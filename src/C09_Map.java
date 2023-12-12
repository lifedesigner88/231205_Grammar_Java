import java.util.*;

public class C09_Map {
    public static void main(String[] args) {


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


        // key값 하나씩 출력.
        print(myMap.keySet()+"");
        print(myMap.values()+"");

        for(String a : myMap.keySet()) print("keuSet() 출력 : " + a);
        for(String a : myMap.values()) print("value() 출력 : " + a);


        // Iterator 이용한 방법
        Iterator<String> myIter = myMap.keySet().iterator();
        while(myIter.hasNext())
            print("HasNext로 출력 : " + myIter.next());


        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("kbaseball");
        myList.add("kbaseball");
        myList.add("kbaseball");
        myList.add("kbaseball");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("kbaseball");
        myList.add("kbaseball");
        myList.add("tennis");
        print("");



        Map<String,Integer> myMap1 = new HashMap<>();
        for(String S : myList) {
            if (myMap1.containsKey(S))
                myMap1.put(S, myMap1.get(S) + 1 );
            else
                myMap1.put(S,1);
        }


        // upload*
        Map<String,Integer> myMap2 = new HashMap<>();
        for(String S : myList)
            myMap2.put(S, myMap2.getOrDefault(S, 0)+1);



        for(String S : myMap2.keySet())
            print(S + "를 " + myMap2.get(S) +"명이 좋아합니다.");


/*      // upload
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {

        String answer = "";
        Map<String, Integer> members = new HashMap<>();

        for (String p : participant)
            members.put(p , members.getOrDefault(p, 0) + 1 ) ;

        for (String c : completion)
            if (members.containsKey(c))
                members.put(c, members.get(c) - 1);

        for (String a : members.keySet())
            if (members.get(a) == 1)
                answer = a;

        return answer;
    }
}
        */




    }


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

















