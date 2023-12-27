package A08_Thread;

public class Library {
    int bookcount = 100;

//    public static void borrowBook()
//    synchonized 키워드를 통해

    public synchronized void borrowBook(){
        if (bookcount>0) {
//        책을 빌리는 시간을 10 밀리초로 가정.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            bookcount -= 1;
            System.out.println("대출완료");
        }else
            System.out.println("대출불가");

    }
}




// Thread 클래스를 이용
// thread(상속하는 방식)
// runable 구현방식.
