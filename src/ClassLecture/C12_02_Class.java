package ClassLecture;

import java.util.List;

public class C12_02_Class {
    public static void main(String[] args) {
        print("");



    print(myCalculator.sum(3,4));






    } // main







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


class myCalculator{

    static int total = 0;

    static int sum(int a, int b) {
        return a+b;
    }

    static int sumAcc(int a) {
        total += a;
        return total;
    }
}