package A03_Inheritance;

public class C13_04_ProtectedTest {
    public static void main(String[] args) {

        print("");
        C13_04_ProtetedClass pt = new C13_04_ProtetedClass();
//        print(pt.privateStr);      // private 콜 불가
        print(pt.defaultStr);      // dafault
        print(pt.protectedStr);      // Protected
        print(pt.publicStr);      // public



    }

    static void print(String a){System.out.println(a);}
}
