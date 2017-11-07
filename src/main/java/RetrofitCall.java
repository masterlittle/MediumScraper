import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by grofers on 06/11/17.
 */
public interface RetrofitCall {

    @GET("topics/explore")
    Observable<ResponseBody> getTopicIds();

    @GET("topics/{topic_id}/stream")
    Observable<ResponseBody> getPostIds(@Path("topic_id") String topicId, @Query("limit") int limit, @Query("to") String time);

    @GET("posts/{post_id}")
    Observable<ResponseBody> getPostData(@Path("post_id") String postId);

}
