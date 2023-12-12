import java.util.*;
import java.util.stream.Collectors;

public class A_for_Excute {
    public static void main(String[] args) {
        print("");


        Map<String,String> myMap = new HashMap<>();

        myMap.put("basketball","농구");
        myMap.put("soccer","축구");
        myMap.put("baseball","야구");

        print(myMap + "");
        print(myMap.get("basketball"));


        // size(), isEmpty() 사용가능
        print(myMap.putIfAbsent("baseball","배구")); // 기존 값 리턴해줌


        // getOrDefalut  키가 없으면 기본값을 return 한다.
        print(myMap.getOrDefault("tennis", "스포츠"));
        print(myMap.containsKey("tennis"));
        myMap.remove("baseball");


        print(myMap.keySet()+"");

















    }   // main
    private static void print(Integer A) {
        System.out.println(A);
    }
    private static void print(List<String> A) {
        System.out.println(A);
    }
    private static void print(String a) {
        System.out.println(a);
    }
    private static void print(boolean a) {
        System.out.println(a);
    }
    private static void print(int a) {
        System.out.println(a);
    }
}

































































