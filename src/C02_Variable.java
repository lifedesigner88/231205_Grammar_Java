import java.math.BigDecimal;

public class C02_Variable {
    public static void main(String[] arg){

/*        byte num1 = 127;
        byte num2 = -128;
        num1++;
        num2--;
        System.out.println(num1);
        System.out.println(num2);

        float f1 = 1234567891234f;      //      숫자 7자리 , 38제곱까지.
        System.out.println(f1);

        double f2 = 1.23;               //      숫자 15자리 , 308 제곱까지.
*/

/*

        double temp = 0.1;
        double float_test = 0.1d;


        for( int i = 0 ; i < 1000 ; i++ ){
            temp = temp + (0.1*10);
            System.out.println(temp/10);
        }
*/


        BigDecimal myBig1 = new BigDecimal("1.03");
        BigDecimal myBig2 = new BigDecimal("0.0042");

        double result = myBig1.subtract(myBig2).doubleValue();


        System.out.println(myBig1.subtract(myBig2));
        System.out.println(result);



        char my_char = '가';
        System.out.println(my_char);


        boolean my_bool = true;
        System.out.println(my_bool);

        if(my_bool){
            System.out.println("조건식이 참입니다.");
        }

        int bool_num1 = 20;
        int bool_num2 = 10;

        if( bool_num1 > bool_num2 ){
            System.out.println("조건식이 참입니다.");
        }


//        묵시적 타입변환
        char ch1 = 'a';
        int ch1_num = ch1;
        System.out.println(ch1_num);

        int my_int1 = 10;
        double my_double1 = 11.2;
        my_int1 = (int)my_double1;      // 소수점값 손실발생 가능성이 있다.

        int a = 1;
        int b = 4;

        int c = a/b;
        double d = (double)a/b;
        double e = (double)a/(double)b;
        System.out.println(c);
        System.out.println(d);


        int a1 = 10;
        a1 = 20;

        System.out.println(a1);

        final int AGES = 20;



    }
}
