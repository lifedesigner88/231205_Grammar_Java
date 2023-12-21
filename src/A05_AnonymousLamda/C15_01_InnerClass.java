package A05_AnonymousLamda;

public class C15_01_InnerClass {


    public static void main(String[] args){

        MemberInnerClass.StaticInnerClass si = new MemberInnerClass.StaticInnerClass();

    }

}


// 일반 내부 클래스

class MemberInnerClass{


    private final int a = 12;

    void display(){
        System.out.println("a" + a + "입니다.");
    }

    void display2(){
        System.out.println("a" + a + "입니다.");
    }


    static class StaticInnerClass {

        private final int data = 34;

        void innerDisplay() {

            System.out.println("data값은 " + data + "입니다.");

        }
        void innerDisplay2() {

            System.out.println("data값은 " + data + "입니다.");

        }

    }
}