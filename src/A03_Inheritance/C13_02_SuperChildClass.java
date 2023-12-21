package A03_Inheritance;

public class C13_02_SuperChildClass extends SuperParents {
    C13_02_SuperChildClass(int a) {
        super(a);
    }
    //super(): 부모클래스의 생성자를 의미,
    //super


    public static void main(String[] arg) {


    }

}


class SuperParents{
    int a;
    SuperParents(int a){
        this.a = a;
    }
}