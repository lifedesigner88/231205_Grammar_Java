import java.util.Scanner;

public class C01_InputOutput {
    public static void main(String[] args){

/*

        int a = 20;

        System.out.print(a);                    // 출력 후 줄바꿈 없음.
        String myString = "hello world";
        System.out.println(10+20);
        System.out.println(myString + a);       // 문자열과 숫자를 합하면 문자가 된다.

        System.in(키보드 입력) + Scanner(입력을 위한 클래스)

*/

/*

        System.out.println("아무 문자열을 입력해주세요");
        Scanner myScan = new Scanner(System.in);
        String inputs = myScan.nextLine();                        // 입력받은 데이터를 한 줄 읽어서, String 으로 리턴
        System.out.println("사용자가 입력한 문자열 : " + inputs);

        int inputs_int = myScan.nextInt();                      // nextInt은 입력 받은 데이터를 한 줄 읽어서 Int로 리턴
        System.out.println("사용자가 입력한 숫자는 : " + inputs_int);

*/

/*

        System.out.println("더하기를 할 숫자 2개를 입력해주세요");
        Scanner sumScan = new Scanner(System.in);
        int result1 = sumScan.nextInt();
        int result2 = sumScan.nextInt();
        int sum = result1 + result2;
        System.out.println( "두 수를 더한 값은 " + sum + "입니다." );

*/

/*

        System.out.println("소수점 입력을 해주세요");
        Scanner myScan = new Scanner(System.in);
        double input_double = myScan.nextDouble();
        System.out.println("입력받은 소수는" + input_double);

*/


/*

        System.out.println("불린을 입력해주세요");
        Scanner myScan = new Scanner(System.in);
        boolean input_boolean = myScan.nextBoolean();
        System.out.println("입력하신 참/거짓 : " + input_boolean);

        myScan.close();             // 입출력 메모리 해제

*/


    }
}
