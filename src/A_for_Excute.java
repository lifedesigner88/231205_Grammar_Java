import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_for_Excute {
    public static void main(String[] args) {
        print("");

// 리스트 선언 방법
        ArrayList<String> myList1 = new ArrayList<>();
        List<String> myList2 = new ArrayList<>();


        myList2.add("java");
        myList2.add("java");
        myList2.add("python");

        print(myList2);

//  초기값 생성방법 2. 하꺼번에 add

        String[] myArr1 = {"java", "python", "c++"};
        List<String> myList3 = new ArrayList<>(Arrays.asList(myArr1));


//  배열이 인트인 경우 -> 문제발생
        int[] myIntArr1 = {1, 2, 3};
        List<Integer> myIntList1 = new ArrayList<>();







    }   // main
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


















































