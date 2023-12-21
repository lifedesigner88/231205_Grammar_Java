package A02_ClassLecture;

import java.util.ArrayList;
import java.util.List;

public class C12_05_MethodOverloading {
    public static void main(String[] args) {



    C12_05_MethodOverloading a = new C12_05_MethodOverloading();
//    메서드 오버로딩을 통해 메서드명 재활용

        print("2자리 더하기" + a.sum(3, 4));
        print("2자리 더하기" + a.sum(3.0, 4.0));
        print("3자리 더하기" + a.sum(3, 4, 5));

//    제네릭을 통해 타입재활용
        List<Integer> myList = new ArrayList<>();


    }


    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    double sum(double a, double b){
        return a + b;
    }

    private static void print(String a) {System.out.println(a);}

}
