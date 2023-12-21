package A01_Basic;

public class C03_Operator {
    public static void main(String[] args) {

    /*
        int num1 = 8;
        int num2 = 3;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 / num2 = " + num1 / (double) num2);
        System.out.println("num1 % num2 = " + num1 * num2);


        // 대입연산자

        int n4 = 10;
        int n5 = 10;


        System.out.println("dksjf");
        System.out.println(n4 %= 3);
        System.out.println(n5/=3);

        // 전위연산자, 후위연산자.
        // 비교연산자

        char char1 = 'a';
        char char2 = 'A';

        System.out.println(char1 != char2);
        System.out.println(char1 == char2);
*/
        //논리연산자
        // &&, ||, !
/*
        int num1 = 10;
        int num2 = 20;

        boolean result1;
        boolean result2;
        result1 = num1>5 && num2<20;
        result2 = num2 < 10 || num2 <30;


        // 비트연산자 &, |, ^,
        int n1 = 5;                 //  0000101 (5)
        int n2 = 6;                 //  0001101 (6)
        System.out.println(n1 & n2);//  0000100 (4)
        System.out.println(n1 | n2);//  0001101 (7)
        System.out.println(n1 ^ n2);//  0001000 (3)
        System.out.println( ~n1 );  //  (-6)
        System.out.println(n1<<8);  //  곱하기 2^4
        System.out.println(n1>>8);  //  곱하기 2^4*/



        int a = 13;
        int b = 9;

        while(b!=0){
            int same_index = a & b;
            a = a ^ b ;
            b = same_index << 1;
        }
        System.out.println(a);
/*

        a : 00100;
        b : 10010;


        a :

*/

    }
}































