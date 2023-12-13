import java.util.*;
import java.util.stream.Collectors;

public class A_for_Excute {
    public static void main(String[] args) {
        print("");


// 중복제거용.

    Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");
        System.out.println(mySet);




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



        //    Set<String> mySet1 = new HashSet<>();
        //    for (String a : myList) mySet1.add(a);
        //    mySet1.addAll(myList);

        // List를 인자값으로 받아 초기값 세팅 가능
        // 배열인 경우에는 asList(배열);

        Set<String> mySet1 = new HashSet<>(myList);
        print( "종목의 가지수는 " + mySet1.size() + "가지 입니다.");


        String[] myArr = {"java", "python", "C++", "python", "C++"};
        Set<String> mySet2 = new HashSet<>(Arrays.asList(myArr));
        print( "언어의 가지수는 " + mySet2.size() + "가지 입니다.");

        mySet2.remove("java");
        print("mySet2 : " + mySet2);


        int[] myArrInt = {1,2,3,4,5,6,7};
        Set<Integer> mySetInt = new HashSet<>();
        for(int a : myArrInt) mySetInt.add(a);
        print("mySetInt : " + mySetInt );

//       교집합 : retainAll;
        Set<String> temp1 = new HashSet<>(mySet1);
        temp1.retainAll(mySet2);
        print("교집합 : " + temp1);
//       합집합 : addAll;
//       차집합 : removeAll;

        // List를 인자값으로 받아 초기값 세팅 가능
        // 배열인 경우에는 asList(배열);

















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

































































