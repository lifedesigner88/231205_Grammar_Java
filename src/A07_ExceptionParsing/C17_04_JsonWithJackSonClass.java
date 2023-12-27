package A07_ExceptionParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C17_04_JsonWithJackSonClass {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        File myPath = Paths.get("src/A07_ExceptionParsing/test-data2.json").toFile();
        Map<String, JsonNode> univMap = new HashMap<>();
        List<Student> stuList = new ArrayList<>();


        try {
            JsonNode data = mapper.readTree(myPath);
            univMap.put("students", data.get("students"));

            print("테스트" + univMap);

            for(String j : univMap.keySet())

                univMap.get(j).toString();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    } // main


    static void print(String a){System.out.println(a);}
}


class Student {
    int id;
    String name;
    String classNumber;
    String city;

    Student(){};
    Student(int id, String name, String classNumber, String city) {
        this.id = id;
        this.name = name;
        this.classNumber = classNumber;
        this.city = city;}

    public int getId() {return id;}
    public String getName() {return name;}
    public String getClassNumber() {return classNumber;}
    public String getCity() {return city;}
}