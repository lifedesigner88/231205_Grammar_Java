package A07_ExceptionParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C17_05_JsonWithJackSonHttp {
    public static void main(String[] args) {
//        http 클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();
//        http 요청 객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();

//        http응답객체 생성
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            print("Response " + response.body());
            String body = response.body();


//            readTree를 이용한 매핑방식
            JsonNode jsonNode = mapper.readTree(body);
            Post myPost1= new Post(
                    jsonNode.get("userId").asText(),
                    jsonNode.get("id").asText(),
                    jsonNode.get("title").asText(),
                    jsonNode.get("body").asText());

            System.out.println("Tree(readTree): " + myPost1);


//            readValue를 사용해서 객체로 곧바로 매핑
            Post myPost2 = mapper.readValue(body,Post.class);
            System.out.println("Value(readValue): " + myPost2);


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


        HttpRequest reqLong = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();


        List<Post> postList = new ArrayList<>();

        try {
            HttpResponse<String> response  = client
                    .send(reqLong, HttpResponse.BodyHandlers.ofString());

//            print("response Long 100 " + response.body());

//            readTree를 이용한 매핑방식
            String body = response.body();
            JsonNode jsonNode = mapper.readTree(body);

            for(JsonNode j : jsonNode){
                Post myPost = mapper.readValue(j.toString(),Post.class);
                postList.add(myPost);
            }



        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


//
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            String post = response.body();
//            JsonNode jsonNode = mapper.readTree(post);
////            Post myPost = new Post(jsonNode.get("id").asInt(), jsonNode.get("title").asText(), jsonNode.get("body").asText(), jsonNode.get("userId").asInt());
////            readValue를 사용해서 객체로 곧바로 매핑
////            Post myPost2 = mapper.readValue(post, Post.class);
////            System.out.println(myPost2);
////            JsonNode는 트리구조 이므로,
////            for(JsonNode j : jsonNode) 이런 형식이 가능.
//            List<Post> postList = new ArrayList<>();


//            for(JsonNode j : jsonNode){
//                Post myPost = mapper.readValue(j.toString(), Post.class);
//                postList.add(myPost);
//            }
//            System.out.println(postList);
//
////            java객체를 json데이터로 직렬화
//            String serialized_data = mapper.writeValueAsString(postList);
//            System.out.println(serialized_data);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }















    } // main
    static void print(String a){System.out.println(a);}
}

class Post {
    String userId;
    String id;
    String title;
    String body;

    Post(){};

    Post(String userId, String id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;}

    @Override
    public String toString() {
        return "\n"+
                "* userId = " + userId + "\n" +
                "* id = " + id + "\n" +
                "* title = " + title + "\n" +
                "* body = " + body + "\n";}

    public String getUserId() {return userId;}
    public String getId() {return id;}
    public String getTitle() {return title;}
    public String getBody() {return body;}

}


// Post 클래스 생성
// getter, 생성자, toString메서드