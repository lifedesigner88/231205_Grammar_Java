package A08_Thread;

public class MainClass {
    public static void main(String[] args) {

//        상속방식으로 스레드 생성
        Thread etc1 = new ExtendsThreadClass();
        etc1.start();
        Thread etc2 = new ExtendsThreadClass();
        etc2.start();

        new ExtendsThreadClass().start();;
        new ExtendsThreadClass().start();;
        new ExtendsThreadClass().start();;


//        스레드 실행시 순차적으로 실행되지 않음에 주의

//        Thred 생성자로 Runnable 객체를 주입하는 방식.
//        Thread 클래스에 Runnable 객체가 전달되어 사용자가 직접 정의 run메서드가 실행.

        Thread rt1 = new Thread(new RunnableImplementsClass());     //1
        rt1.start();
        new Thread(new RunnableImplementsClass()).start();          //2
        new Thread(new Runnable() {                                 //3
            @Override
            public void run() {
                System.out.println("익명객체 스래드");
            }});
        new Thread(() -> System.out.println("익명객체 스래드"));       //4


//        thread의 동시성 이슈 테스트
        Library testLibrary = new Library();
        for (int i = 0; i < 1000; i++)        // 싱글 스레드
            testLibrary.borrowBook();
        System.out.println("최종 남은 수량 " + testLibrary.bookcount);


        Library library = new Library();
        for (int i = 0; i < 1000; i++) {     // 멀티 스레드

            Thread th = new Thread(library::borrowBook);

            try {
                th.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("최종 남은 수량 " + library.bookcount);






    }
}
