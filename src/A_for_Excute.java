import java.util.*;
import java.util.stream.Collectors;

public class A_for_Excute {
    public static void main(String[] args) {
        print("");


    Stack<String> myStr = new Stack<>();
    for (int i = 1; i<=6; i++)
        myStr.push("hello " + i);

//    Pop은 요소 제거 후 반환
    print("Stack : " + myStr.pop()); // 40

    print("pop result : " + myStr);
    print("Peek : " + myStr.peek()); // 40
    print("Stack Size : " + myStr.size());
    print("Stack isEmpty : " + myStr.isEmpty());
    print("");



    while(!myStr.isEmpty())
        print("while, isEmpty 활용하여 모두 팝 : " + myStr.pop());


//    앞으로 가기 뒤로 가기

    Scanner myScan = new Scanner(System.in);

    while(true) {

        print("");
        print("(뒤로가기: 1) (히스토리: 2)");
        print("방문할 사이트를 입력해주세요 ");
        String inputs = myScan.nextLine();

        Stack<String> StackForWeb = new Stack<>();

        if (inputs.equals("1"))

            if (StackForWeb.isEmpty())
                print("이전 페이지가 없습니다. 다시 입력해주세요");
            else
                print(StackForWeb.peek() + "페이지로 이동하였습니다.");

        else if (inputs.equals("2"))
            print("현재 방문 기록" + StackForWeb);

        else {
            StackForWeb.push(inputs);
            print(inputs + "페이지로 이동하였습니다.");
        }


    }














    }   // main
    private static void print(Integer A) {
        System.out.println(A);
    }
    private static void print(List<String> A) {
        System.out.println(A);
    }
    private static void print(String a) {
        System.out.println(a);
    }
    private static void print(boolean a) {
        System.out.println(a);
    }
    private static void print(int a) {
        System.out.println(a);
    }
}

































































