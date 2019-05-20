package com.dragan.app;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import com.jayway.jsonpath.JsonPath;

public class JsonPathEx {
    public static void main(String[] args) throws IOException {
        Path postsPath = Paths.get("/Users/dragan/dev/java_ex/json_ex", "posts.json");

        byte[] postsBytes = Files.readAllBytes(postsPath);
        String json = new String(postsBytes, StandardCharsets.UTF_8);
        System.out.println("***** json *****");
        System.out.println(json);
        System.out.println("***** json e*****");
        String pageName = JsonPath.read(json, "$.pageInfo.pageName");
        System.out.println(pageName);
        
        Integer posts = JsonPath.read(json, "$.posts.length()");
        
        for(int i=0; i < posts; i++) {
            String post_id = JsonPath.read(json, "$.posts[" + i + "].post_id");
            System.out.println(post_id);
        }
    }
}
