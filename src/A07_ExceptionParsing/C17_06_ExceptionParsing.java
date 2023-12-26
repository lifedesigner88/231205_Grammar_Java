package A07_ExceptionParsing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C17_06_ExceptionParsing {
    public static void main(String[] args) {
//        find .err grep 고객 id
//        datadog, elk (각종 로그 툴 -JSP, 타임리프)
//        1. 강제종료 2. 로그기록 3.프론트와 소통;

//        MSA DB를 쪼개는 방식. (json 방식)

//        try       실행되는 코드
//        catch     예외처리를 담당.
//        final     예외가 발생하는것과 관계없이 실행

//        .ArithmeticException : 0으로 나눌 때 ;

        print("나눗셈 프로그램 입니다. 숫자에 10에 나눌 분모값을 입력해주세요");

        int num = 10;
        Scanner sc = new Scanner(System.in);

//        예외가 발생할 것으로 예상되는 코드에 try catch 감싸준다.
        try {
//            int input = sc.nextInt();
//            print("10에" + input + "을 나누면");
//            print(num / input + "입니다");

//        catch에는 try 구문안에서 발생가능한 예외사항을 적어야 정상적으로 catch가 된다.
        } catch (InputMismatchException e) {print("잘못된 값을 입력했습니다");
        } catch (ArithmeticException e) { print("0을 입력하시면 안됩니다.");
        } catch (Exception e) {print("알수없는 예외가 발생했습니다.");
            print("예외 메시지 출력" + e.getMessage());

            e.printStackTrace();
//            java.lang.ArithmeticException: / by zero
//            at A07_ExceptionParsing.C17_06_ExceptionParsing.main(C17_06_ExceptionParsing.java:28)
        } finally {print("감사합니다");
        }



        print("");
//        throw와 throws 예제
        String password = "1234";


        try {
            login(password);
        } catch (IllegalArgumentException e) {
            // 던진 함수에 작성되어있는 메시지를 불러오는 함수다.
            System.out.println(e.getMessage());
        }



    } // main

//    unchecked exception에서 throews를 하지 않더라도 혜의는 호출한 곳으로 전파.
//    이때 throws를 하는 이유는 명시적으로 예외가 발상핼수 있음을 알리는 것 뿐

//    checked exception은 예외처리가 강제되고 해당 메서드에서 예외처리를 하던지 thorow를 통해 호출한 곳에 위임
//    이때 호출한 쪽에서는 예외처리 강제된다.


    static void login(String password) throws IllegalArgumentException{
        if (password.length()<10) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다");
        }
    }

    static void print(String a){
        System.out.println(a);
    }
}
































