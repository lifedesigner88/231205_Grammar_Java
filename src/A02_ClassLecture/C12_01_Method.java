package A02_ClassLecture;

import java.util.ArrayList;
import java.util.List;

public class C12_01_Method {
    public static void main(String[] args) {
        print("");


//        print(sumAcc(100,200));

    // 같은 클래스 내의 method들 사이에서의 호출은
    // static 메서드라 할지라도 클래스명 생략가능

//        메서드 구성요소 : 매개변t수, 변환타입, 접근제어자, 클래스매서드 여부(static)






        primePrint(97);
//        isPrimePrint(1231);






    }    // main

    List<Integer> prime = new ArrayList<>();

    static void primePrint(int number) {
        print(1);
        print(2);
        int counter = 2;
        for (int i = 3; i <= number; i+=2)
            if(isPrime(i)) {
                print(i);
                counter++;
            }
        print("소수의 개수는:" + counter);
    }








    static boolean isPrime(int number){

        for (int i = 2; i * i <= number; i++)
            if (number % i == 0)
                return false;

        return true;

    }


    static void isPrimePrint(int number){

        for (int i = 2; i*i <= number; i++)
            if (number % i == 0) {
                print("소수아닙니다");
                return;
            }
        print("소수아닙니다");
    }



   public static int sumAcc(int start, int end){
        int total = 0;
        for (int i = start; i <= end; i++)
            total += i;
        return total;
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
