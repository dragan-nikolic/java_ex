import com.jayway.jsonpath.JsonPath;

public class JsonPathEx {
    static String json = "posts.json";
    public static void main(String[] args) {
        String pageName = JsonPath.read(json, "$.pageInfo.pageName");
        System.out.println(pageName);
        
        Integer posts = JsonPath.read(json, "$.posts.length()");
        
        for(int i=0; i < posts; i++) {
            String post_id = JsonPath.read(json, "$.posts[" + i + "].post_id");
            System.out.println(post_id);
        }
    }
}
