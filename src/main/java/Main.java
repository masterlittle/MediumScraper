import com.fasterxml.jackson.databind.ObjectMapper;
import com.shitij.medium.MediumData;
import com.shitij.medium.Next;
import com.shitij.medium.posts.PostData;
import com.shitij.medium.topics.TopicData;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.io.FileUtils;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by grofers on 06/11/17.
 */
public class Main {

    private static CountDownLatch countDownLatch = new CountDownLatch(500000);
    private static int LIMIT = 60;
    private static RetrofitCall service;
    private static List<String> topicIds;
    private static HashSet<String> hashOfPosts = new HashSet<>();
    private static File file = new File("medium-posts.json");
    private static AtomicInteger count = new AtomicInteger(0);
    private static AtomicInteger totalPostCount = new AtomicInteger(0);

    public static void main(String args[]) throws InterruptedException, IOException {

//        ReadPosts readPosts = new ReadPosts();
//        readPosts.readPosts();
        scrapeMedium();

    }

    private static void scrapeMedium() throws IOException, InterruptedException {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.medium.com/_/api/")
                .client(client)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        service = retrofit.create(RetrofitCall.class);
        ObjectMapper objectMapper = new ObjectMapper();

        FileUtils.write(file, "[", true);
        getListOfTopics(service, objectMapper);
        topicIds.forEach(s -> getListOfPosts(service, objectMapper, "1507305601019", s));

        countDownLatch.await();
    }

    private static void getData(RetrofitCall service, ObjectMapper objectMapper, List<String> postIds, String topicId) {

        Observable.from(postIds)
                .delay(2, TimeUnit.SECONDS)
                .onBackpressureBuffer()
                .flatMap(id1 -> service.getPostData(id1)
                        .map(postResponse -> {
                            String r;
                            try {
                                r = getSubstringFromResponse(postResponse.string());
                                return objectMapper.readValue(r, PostData.class);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            return new PostData();
                        })
                        .filter(postData -> !postData.getPayload().getValue().isIsSubscriptionLocked())
                        .onBackpressureBuffer()
                        .map(postData -> {
                            List<com.shitij.medium.posts.Paragraph> paragraphs = postData.getPayload().getValue().getContent().getBodyModel().getParagraphs();
                            String title = postData.getPayload().getValue().getTitle();
                            String postId = postData.getPayload().getValue().getId();
                            String content = paragraphs.stream().map(com.shitij.medium.posts.Paragraph::getText).collect(Collectors.joining(" "));
                            long publishedAt = postData.getPayload().getValue().getFirstPublishedAt();
                            long claps = postData.getPayload().getValue().getVirtuals().getTotalClapCount();
                            long userCount = postData.getPayload().getValue().getVirtuals().getRecommends();
                            long wordCount = postData.getPayload().getValue().getVirtuals().getWordCount();
                            long imageCount = postData.getPayload().getValue().getVirtuals().getImageCount();
                            long responsesCreated = postData.getPayload().getValue().getVirtuals().getResponsesCreatedCount();
                            double readingTime = postData.getPayload().getValue().getVirtuals().getReadingTime();
                            return new ModelPost.ModelPostBuilder()
                                    .postId(postId)
                                    .topicId(topicId)
                                    .content(content)
                                    .title(title)
                                    .publishedAt(publishedAt)
                                    .claps(claps)
                                    .userCount(userCount)
                                    .wordCount(wordCount)
                                    .imageCount(imageCount)
                                    .responseCreated(responsesCreated)
                                    .readingTime(readingTime)
                                    .build();

                        }))
                .onBackpressureBuffer()
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<ModelPost>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ModelPost modelPost) {
                        try {
                            count.incrementAndGet();
                            System.out.println("Size of posts till now is " + count.get());
                            String json = objectMapper.writeValueAsString(modelPost);
                            FileUtils.write(file, json + ",", true);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        countDownLatch.countDown();
                    }
                });
    }

    private static void getListOfTopics(RetrofitCall service, ObjectMapper objectMapper) {
        service.getTopicIds().flatMap(responseBody -> {
            try {
                TopicData topicData = objectMapper.readValue(getSubstringFromResponse(responseBody.string()), TopicData.class);
                return Observable.from(topicData.getPayload().getStreamItems())
                        .flatMap(streamItem -> Observable.from(streamItem.getSection().getItems())
                                .map(item -> item.getTopic().getTopicId()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }).filter(Objects::nonNull)
                .toList()
                .subscribe(new Subscriber<List<String>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                        try {
                            throw e;
                        } catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }

                    @Override
                    public void onNext(List<String> strings) {
                        topicIds = strings;
                    }
                });
    }

    private static void getListOfPosts(RetrofitCall service, ObjectMapper objectMapper, String time, String topicId) {

        if (Objects.equals(time, ""))
            return;

        Observable.just(topicId)
                .flatMap(id -> service.getPostIds(id, LIMIT, time)
                        .onBackpressureBuffer()
                        .flatMap(responseBody -> {
                            try {
                                String response = responseBody.string();
                                MediumData mediumData = objectMapper.readValue(getSubstringFromResponse(response), MediumData.class);
                                return Observable.from(mediumData.getPayload().getStreamItems())
                                        .flatMap(streamItem -> Observable.from(streamItem.getSection().getItems())
                                                .map(item -> {
                                                    String post = item.getPost().getPostId();
                                                    if (!hashOfPosts.contains(post)) {
                                                        hashOfPosts.add(post);
                                                        return post;
                                                    }
                                                    else
                                                        return "";
                                                }))
                                        .filter(postId -> !postId.isEmpty())
                                        .toList()
                                        .map(strings -> {
                                            Next next = mediumData.getPayload().getPaging().getNext();
                                            if (next != null) {
                                                String nextPage = next.getTo();
                                                if (nextPage != null && !nextPage.isEmpty())
                                                    return new ModelPostWithPaging.ModelPostWithPagingBuilder()
                                                            .postIds(strings)
                                                            .topicId(id)
                                                            .time(nextPage)
                                                            .build();
                                            }
                                            return new ModelPostWithPaging.ModelPostWithPagingBuilder()
                                                    .postIds(strings)
                                                    .time("")
                                                    .topicId(id)
                                                    .build();
                                        });
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            return null;
                        }))
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<ModelPostWithPaging>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        try {
                            throw e;
                        } catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }

                    @Override
                    public void onNext(ModelPostWithPaging modelPostWithPaging) {
                        totalPostCount.addAndGet(modelPostWithPaging.getPostIds().size());
                        System.out.println("Topics-- Size of total posts till now is " + totalPostCount.get());

                        System.out.println("Topic: " + modelPostWithPaging.getTopicId());
                        getData(service, objectMapper, modelPostWithPaging.getPostIds(), modelPostWithPaging.getTopicId());
                        getListOfPosts(service, objectMapper, modelPostWithPaging.getTime(), modelPostWithPaging.getTopicId());
                    }
                });
    }

    private static String getSubstringFromResponse(String response) {
        return response.substring(16);
    }

}

