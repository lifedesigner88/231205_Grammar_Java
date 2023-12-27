package A07_ExceptionParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C17_03_JsonWithJackSonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {

//            readTree를 통해서 json을 계층적 트리구조형태로 변환
            File myPath = Paths.get("test-data1.json").toFile();
            JsonNode data1 = mapper.readTree(myPath);
            Map<String, String> studentMap = new HashMap<>();

            studentMap.put("id",            data1.get("id").asText());
            studentMap.put("name",          data1.get("name").asText());
            studentMap.put("classNumber",   data1.get("classNumber").asText());
            studentMap.put("city",          data1.get("city").asText());

//             key:value중에 value의 타입이 혜상되지 않을때는 object 타입으로도 받을 수 있다.
            Map<String, String> studentMap2 = mapper.readValue(myPath, Map.class);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


//
//ObjectMapper mapper = new ObjectMapper();
//String json = "{\"name\":\"mkyong\", \"age\":\"37\"}";
//
//        try {
//
//// convert JSON string to Map
//Map<String, String> map = mapper.readValue(json, Map.class);
