import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * Created by grofers on 07/11/17.
 */
@Builder
@Getter
@EqualsAndHashCode
@ToString
public class ModelPostWithPaging {
    List<String> postIds;
    String time;
    String topicId;
}
