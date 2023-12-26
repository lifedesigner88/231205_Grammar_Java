package A06_EtcClass;

import java.util.Arrays;

public class C16_03_GenericMain {
    public static void main(String[] args) {
        print("");


//        Integer Swap
        Integer[] intArr = {0, 1, 2, 3, 4, 5,};

        Integer intTemp = intArr[0];             // 0번째와 1번째 자리 change
        intArr[0] = intArr[1];
        intArr[1] = intTemp;
        print("Integer 배열 순서 변경: " + Arrays.toString(intArr));

        IntegerSwap(intArr, 2, 1);      // 함수이용 Swap
        Swap(intArr, 2, 1);             // 제네릭 함수이용 Swap
        print("IntegerSwap 함수로 배열 순서 변경: " + Arrays.toString(intArr));
        print("");


//      String Swap
        String[] strArr = {"0 java", "1 python", "2 C++"};

        String strTemp = strArr[0];              // 1번 쨰 2번째 자리 change
        strArr[0] = strArr[1];
        strArr[1] = strTemp;
        print("String 배열 순서변경: " + Arrays.toString(strArr));
        print("");


        StringSwap(strArr, 1, 2);       // 함수이용 Swap
        Swap(strArr, 1, 2);             // 제네릭 함수이용 Swap
        print("StringSwap 배열 순서변경: " + Arrays.toString(strArr));
        print("");


        GenericStudent<Integer> GenInteger = new GenericStudent<>("Sejong", 23);
        print("GenInteger.age 타입 체크: " + GenInteger.age.getClass());
        print(GenInteger.toString());
        print("");


        GenericStudent<String> GenString = new GenericStudent<>("Sejong", "23");
        print("GenString.age 타입 체크: " + GenString.age.getClass());
        print(GenString.toString());
        print("");



    } // main


    static void StringSwap(String[] strArr, int std, int ref) {
        String strTemp = strArr[std];
        strArr[std] = strArr[ref];
        strArr[ref] = strTemp;
    }


    static void IntegerSwap(Integer[] intArr, int std, int ref) {
        Integer intTemp = intArr[std];
        intArr[std] = intArr[ref];
        intArr[ref] = intTemp;
    }


//    제네릭 매서드 생성: 반환타입 왼쪽에 <T> 선언
    static <T> void Swap(T[] intArr, int std, int ref) {
        T intTemp = intArr[std];
        intArr[std] = intArr[ref];
        intArr[ref] = intTemp;
    }

    static void print(String a) {
        System.out.println(a);
    }
}


class GenericStudent<T>{

    String name;
    T age;

    GenericStudent(String name, T age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "이는 나이가 " + age.toString();
    }
}