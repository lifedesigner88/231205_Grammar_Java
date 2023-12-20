package Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;


public class C11_StackQueueDeque{
    public static void main(String[] args) {



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


//        신기한 풀이법
//        Stack<Integer> stack = new Stack<>();
//
//        for (String w : s.split(" ")) {
//            if (w.equals("Z")) {
//                stack.pop();
//            } else {
//                stack.push(Integer.parseInt(w));
//            }
//        }
//        for (int i : stack) {
//            answer += i;
//        }

//    앞으로 가기 뒤로 가기

        Scanner myScan = new Scanner(System.in);


//      Stack to Array;
//        Integer[] array = stack.toArray(new Integer[stack.size()]);
//

//        Integer[] array = new Integer[stack.size()];
//        int index = 0;
//
//        while (!stack.isEmpty()) {
//            array[index++] = stack.pop();
//        }






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



        Queue<Integer> myQue = new LinkedList<>();
        myQue.add(10);
        myQue.add(20);
        myQue.add(30);
        myQue.add(40);
        print(myQue.poll());
        print("큐 출력 : " + myQue);

        Queue<String> docPrinter= new LinkedList<>();

        docPrinter.add("문서1");
        docPrinter.add("문서2");
        docPrinter.add("문서3");
        docPrinter.add("문서4");

        while(!docPrinter.isEmpty())
            print("현재 인쇄 중인 문서 " + docPrinter.poll());


//      길이의 제한이 있는 큐 : ArrayBlockingQueue
        Queue<String> myQue1 = new ArrayBlockingQueue<>(3);
        myQue1.offer("hellow1");
        myQue1.offer("hellow2");
        print(myQue1.offer("hellow3"));         //true
        print("" + myQue1.offer("hellow4"));    //false


//       우선순위 큐 (PriorityQueue)

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(7);
        pq.add(6);
        pq.add(5);
        pq.add(4);
        pq.add(4);
        pq.add(4);

        print("우선순위큐 : " + pq);

        while(!pq.isEmpty()) {
            print(pq.poll());
            print("우선순위큐 : " + pq);

        }

        Deque<Integer> myDeque = new ArrayDeque<>();
        Deque<Integer> myDeque2 = new LinkedList<>();
        myDeque.addFirst(10);
        print("덱 출력" + myDeque);
//
//    myDeque.addLast(20);
//    myDeque.addLast(21);
//    myDeque.addLast(22);
//        print("덱 출력" + myDeque);
//
//    myDeque.pollFirst();
//        print("퍼스트 출력" + myDeque);

        myDeque.pollLast();
        print(myDeque.peekLast());
        print("라스트 출력" + myDeque);


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

