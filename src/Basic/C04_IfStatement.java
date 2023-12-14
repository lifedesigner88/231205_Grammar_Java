package Basic;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

/*
        while(true) {

            String input_Number = "0234";
            System.out.println("-----비밀번호를 입력해주세요");
            String password = myScan.nextLine();

            if (password.equals(input_Number))
                System.out.println("문이 열렸습니다.");
            else
                System.out.println("비밀번호가 틀렸습니다");


            System.out.println("****알파벳 하나를 입력해주세요");
            char text = myScan.nextLine().charAt(0);

            if (text >='A' && text <= 'Z')
                System.out.println("대문자입니다.");
            else if(text >='a' && text <= 'a')
                System.out.println("소문자 입니다.");
            else
                System.out.println("알파벳이 아닙니다");

        }

*/



// 가진돈 입력
/*

        while(true) {

            System.out.println("가진돈을 입력하세요");
            int money = myScan.nextInt();
            System.out.println("카드를 훔쳤습니까? Y/N 으로 답해주세요");
            String isStolen = myScan.nextLine();
            boolean thef = isStolen.equals("Y");

            if (!thef && money < 1500)
                System.out.println("잔액이 부족합니다.");
            else if (!thef && money >= 1500)
                System.out.println("정상탑승되었습니다");
            else
                System.out.println("도둑맞은 카드입니다");
        }
*/


// 삼항연산자
/*
        while(true) {

            String input_Number = "0234";
            System.out.println("-----비밀번호를 입력해주세요");
            String password = myScan.nextLine();
            String result = password.equals(input_Number) ? "문이 열렸습니다.": "비밀번호가 틀렸습니다";
            System.out.println(result);

        }
*/


/*

        int myMoney = 1000;

        if (myMoney >= 10000)
            System.out.println("택시를 이용하세요");
        else if (myMoney >= 3000)
            System.out.println("버스를 타세요");
        else if (myMoney >= 2000)
            System.out.println("킥보드를 타세요");
        else
            System.out.println("걸어가세요");

*/

/*
        println("원하시는 번호를 입력해 주세요");
        while(true){
            int input = myScan.nextInt();
            switch (input) {
                case 1:
                    println("1. 대출서비스 입니다.");
                    break;
                case 2:
                    println("2. 예급 서비스 입니다.");
                    break;
                case 3:
                    println("3. 적급서비스 입니다.");
                    break;
                case 0:
                    println("0. 상담사 연결입니다.");
                    break;
                default:
                    println("잘못누르셨습니다.");
                    break;


            }
        }
 */

    }

    private static void println(String s) {
        System.out.println(s);
    }
}
































