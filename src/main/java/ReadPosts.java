import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by grofers on 07/11/17.
 */
public class ReadPosts {

    public void readPosts(File file){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String posts = FileUtils.readFileToString(file);
            String jsonPosts = posts.substring(0, posts.length()-1) + "]";
            List<ModelPost> postsList= objectMapper.readValue(jsonPosts, new TypeReference<List<ModelPost>>(){});
            System.out.println(postsList.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
