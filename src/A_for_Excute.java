import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class A_for_Excute {
    public static void main(String[] args) {
        print("");




//
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

        Queue<Integer> pq = new PriorityQueue();
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

































































