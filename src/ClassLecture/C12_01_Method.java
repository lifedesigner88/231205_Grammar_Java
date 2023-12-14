package ClassLecture;

import java.util.List;

public class C12_01_Method {
    public static void main(String[] args) {
        print("");


        sumAcc(100,200);





    }    // main




    static void sumAcc(int start, int end){
        int total = 0;
        for (int i = start; i <= end; i++)
            total += i;

        print(total);
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
