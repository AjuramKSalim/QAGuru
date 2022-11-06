import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fruits1 {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String filepath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"jsonData"+File.separator+"fruits.json";
        fruit1[] fruit1 = mapper.readValue(new File(filepath),fruit1[].class);
        System.out.println("My fruit is " + fruit1[0].getName());
        System.out.println("My fruit is " + fruit1[1].getName());
        System.out.println("My fruit is " + fruit1[2].getName());
        System.out.println("My fruit is " + fruit1[3].getName());
    }
}
