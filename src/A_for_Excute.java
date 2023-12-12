import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_for_Excute {
    public static void main(String[] args) {
        print("");



List<Integer> myList = new ArrayList<>();
myList.add(10);
myList.add(20);
myList.add(1,15);
print(myList.toString());

List<Integer> myList2 = new ArrayList<>();
myList.add(30);
myList.add(40);
myList.add(50);

myList.addAll(myList2);
print(myList.toString());
print(myList2.toString());


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





























































