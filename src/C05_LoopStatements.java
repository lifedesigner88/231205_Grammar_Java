import java.util.Scanner;

public class C05_LoopStatements {
    public static void main(String[] artgs){
        Scanner myScan = new Scanner(System.in);

// 2~10 까지 출력하는 예제

/*

        int count = 2;

        while(count <= 10){
            println(count++);
        }

*/


// 구구단
/*

        int input = 0 ;
        while(++input < 10) {
            println("");
            println( "*** " + input + " *** 단 입니다.");
//            int input = myScan.nextInt();
            int count = 0;


            while (++count < 10) {
                println(input + "X" + count + " = " + input * count);
            }
        }

*/

// 도어락 예제
/*

        int number = 1;
        do {

            String input_Number = "1234";
            System.out.println("-----비밀번호를 입력해주세요");
            String password = myScan.nextLine();
            String result = password.equals(input_Number) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다";
            System.out.println(result);

            if (result.equals("문이 열렸습니다."))
                break;
            else if (number == 5) {
                println("5회 실패하여 보안장치가 작동하였습니다");
                println("삐뽀삐뽀!!!!!!!!!!!!!!!!!!!!!!!!!");

                break;
            }
            println((5 - number++) + "회 남았습니다. 다시 시도해 주세요.");
        } while (true);



        for (int i = 2; i <= 10; i++) {
            println("" + i);
        }

*/

/*

        for( int i = 1 ; i < 11 ; i++ ){
            if ( (i % 2) == 0 );
            else
                println("" + i);
        }

*/



//        자바 변수 유효 범위.

//        지역변수, 전역변수




/*

    for(int i = 2 ; i < 10 ; i++ ) {
        println("**** "+ i + "단 입니다.");
        for (int j = 1; j < 10; j++) {
            println(i + "X" + j + "=" + i * j);
        }
        println("");

    }

*/




/*
        int[][] arr = {{1, 2, 3, 4},{5, 6, 7,8,9}};
        for (int i = 0 ; i<arr.length ; i++){
            println("");
            for(int j = 0 ; j<arr[i].length; j++ ){
                println("" + arr[i][j]);
            }
        }
*/






    loop1:
        for(int i = 0 ; i < 4 ; i++){
            loop2:
            println("안녕하세요");
            for(int j = 0 ; j < 4 ; j++){
                println("안쪽");

                if(j == 3)
                    break;
            }
        }










    }  /////// main end ////////////
    private static void println(String a) {
        System.out.println(a);
    }
}























