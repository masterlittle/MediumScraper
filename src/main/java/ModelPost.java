import lombok.*;

/**
 * Created by grofers on 07/11/17.
 */
@Builder
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class ModelPost {

    String postId;
    String topicId;
    String content;
    String title;
    long claps;
    long userCount;
    long publishedAt;
    long wordCount;
    long imageCount;
    long responseCreated;
    double readingTime;

    @Override
    public String toString() {
        return stringWithDelimiter(postId)
                + stringWithDelimiter(topicId)
                + stringWithDelimiter(title)
                + stringWithDelimiter(title)
                + stringWithDelimiter(String.valueOf(claps))
                + stringWithDelimiter(String.valueOf(userCount))
                + stringWithDelimiter(String.valueOf(publishedAt))
                + stringWithDelimiter(String.valueOf(wordCount))
                + stringWithDelimiter(String.valueOf(imageCount))
                + stringWithDelimiter(String.valueOf(responseCreated))
                + String.valueOf(readingTime);
    }

    private String delimiter() {
        return ",";
    }

    private String stringWithDelimiter(String s){
        return s.replace("\"", "\\\"") + delimiter();
    }
}
