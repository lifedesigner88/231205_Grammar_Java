package A05_AnonymousLamda;

import java.util.Arrays;

public class C15_05_StreamAPI_01 {
    public static void main(String[] args) {

    int[] arr = {20, 1, 4, 12}; // 전통적인 방식
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println();


//    데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그램 방식
//    java에서 함수형 프로그래밍을 지원하기 위한 라이브러리 -> StreamApi

//      forEach는 각 요소를 소모하면서 동작을 수행한다.
        Arrays.stream(arr).forEach(a -> System.out.println(a));
        System.out.println();
        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
        System.out.println();
        Arrays.stream(arr).forEach(a -> System.out.println(a));


    } // main


}
