package ClassLecture;

public class C12_06_RecursiveBasic {
    public static void main(String[] args) {
        print("");



//        수의 합
        int sum = 0;
        for (int i = 10; i > 0; i--)
            sum += i;

        print("For 1부터 10까지의 합: " + sum);
        print("Recul 10까지의 함수: " + add_acc(10));
        print("");



//        펙토리얼
        int fac = 1;
        for (int i = 10; i > 0; i--)
            fac *= i;

        print("For 10! 값은?: " + fac);
        print("Recul 10! 값은?: " + fact(10));
        print("");



//        피보나치

        int first = 1;                      // 변수 3개 이용
        int finalFivo = 1;

        for (int i = 2; i < 10; i++) {
            int temp = first + finalFivo;
            first = finalFivo;
            finalFivo = temp;}



        int[] fivoArr = new int[10];        // 배열 이용
        fivoArr[0] = 1;                     // 메모이제이션 기억알고리즘
        fivoArr[1] = 1;

        for (int i = 2; i < 10; i++)
            fivoArr[i] = fivoArr[i-1] + fivoArr[i-2];


        print("For Pivo 10의 값은?: " + finalFivo);
        print("Recul Pivo 10의 값은?: " + fivo(10));
        print("Array Pivo 10의 값은?: " + fivoArr[9]);


        print("");





    } // main



//    재귀함수: 재기호출하는 함수

    static int add_acc(int num){
        if (num==1) return 1;
        return num + add_acc(num - 1);}

    static int fact(int num){
        if (num<=1) return 1;
        return num * fact(num - 1);}

    static int fivo(int num){
        if (num <= 2 ) return 1;
        return fivo(num-1) + fivo(num-2);}



//    프린트함수
    static void print(String a){System.out.println(a);}
}