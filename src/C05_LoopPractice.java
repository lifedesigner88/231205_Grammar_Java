import java.util.Arrays;
import java.util.Scanner;

public class C05_LoopPractice {
    public static void main(String[] args) {

    /*

        int sum = 0;
        for(int i = 1 ; i <= 10 ; i++){
            sum += i*2;
        }
            println("" + sum);
    */

// 숫자 뒤집기

        Scanner myScan = new Scanner(System.in);

        while(true) {

            int a = 0;
            int b = 0;
            int c = 0;
            int result = 0;

            println("최대 9자리 숫자를 입력해주세요");
            int number = myScan.nextInt();
            int length = (int) Math.log10(number) + 1;

            for (int i = 1; i <= length; i++) {
                a = (int) Math.pow(10, i);
                b = (int) Math.pow(10, (length-i));
                c = (int) Math.pow(10, i - 1);
                result += (((number % a) - (number % c)) / c) * b;
            }
            println("" + result);

        }




/*

    int a = 72;
    int b = 36;
    int result = 0;
    int temp = 0;

    if (a>b)
        temp = a;
    else
        temp = b;


    for(int i = 1 ; i <= temp ; i++) {
        if ( (a % i == 0) && (b % i == 0))
            result = i;
    } println("" + result);

    */



/*


        int a = 72;
        int b = 36;
        int result = 0;
        int temp = 0;

        if (a>b)
            temp = a;
        else
            temp = b;


        for(int i = 1 ; i <= temp ; i++) {
            if ( (a % i == 0) && (b % i == 0))
                result = i;
        } println("" + result);


*/
/*



    // 배열과 for 문

    int[] myArr = {1,5,7,9,10};
    for(int i=0 ; i < myArr.length ; i++){
        myArr[i] += 10;
        println("" + myArr[i]);
    }

            println("");
            println("");

    int sum =0;

    //enhanced for 문 (주소값의 내용을 복사해서 조작하는 for 문이다)
    for(int a: myArr){
        sum += a;
    }

    System.out.println(sum);
    println(Arrays.toString(myArr));



*/












    }  /////////////////////////////////////

    private static void println(String a) {
        System.out.println(a);
    }
}
