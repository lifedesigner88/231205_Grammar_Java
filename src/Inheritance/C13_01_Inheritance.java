package Inheritance;

public class C13_01_Inheritance extends Parents {
    public static void main (String[] args){


        C13_01_Inheritance ih = new C13_01_Inheritance();

//        print("" + ih.b);
        print("" + ih.a);

        print("" + ih.a);

        ih.parentMethod();
        ih.childMethod();

//        부모클래스의 메서드 명을 동일하게 사용함으로써 메소드 오버라디이(덮어쓰기 했다).


    }

    @Override
    void parentMethod(){
        print("자식클래스 오버라이딩 메서드 입니다. 입니다.");

    }

    void childMethod(){
        print("자식클래스 입니다");
        int c = 30;
    }



}


class Parents {
    int a = 10;
    private int b = 20;

    void parentMethod(){
        print("부모 클래스 입니다.");
    }

    static void print(String a){System.out.println(a);
    }
}


interface inter{

}