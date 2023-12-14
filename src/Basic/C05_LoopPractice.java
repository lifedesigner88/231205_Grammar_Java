package Basic;

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

/*
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
*/

/*
        int sum1 = 0;
        int[] arr = {1,2,3,4,1,2,3,4};
        for (int a : arr) {
            if( a%2 == 0 ){
                sum1 += a;
            }
        }
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



/* 최소공배수.


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

    int minNum = a/result * b /result * result
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

// 레벨문 활용



/*
        while (true){
            int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13, 14, 15, 16}};

            println("찾을 숫자를 입력하세요. 16개가 있습니다.");
            int for_find = myScan.nextInt();
            loop1:
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == for_find) {
                        println("찾는 숫자의 주소는" + "matrix[" + i + "][" + j + "]");
                        break loop1;
                    }
                }
            }
        }
*/




        int minNum = 1;
        int maxNum = 20 ;
        int divisorCounter = 1 ;

        loop:
        for (int i = minNum ; i <= maxNum ; i++){
            divisorCounter = 1;

            for (int  j = 2 ; j <= i ; j++)
               if( i % j == 0 )
                   divisorCounter++;

            if(divisorCounter >= 5) {

                println("");
                println("범위가 " + minNum + "에서 " + maxNum + "까지의 숫자중에서");
                println(i + "는 약수가 " + divisorCounter + "개 이기 떄문에");
                println("주어진 범위내에서 약수가 5개 이상인 첫 번째 숫자입니다.");

                break loop;
            }
        }









/*
        int[][] arr = {{1, 2, 3, 4},{5, 6, 7,8,9}};
        for (int i = 0 ; i<arr.length ; i++){
            println("");
            for(int j = 0 ; j<arr[i].length; j++ ){
                println("" + arr[i][j]);
            }
        }
*/





    }  /////////////////////////////////////

    private static void println(String a) {
        System.out.println(a);
    }
}




















