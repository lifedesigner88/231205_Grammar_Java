package A03_Inheritance.Inheritance_Test;

import A03_Inheritance.C13_04_ProtetedClass;

public class ProtectedMain extends C13_04_ProtetedClass{
    public static void main(String[] args) {
        C13_04_ProtetedClass pt = new C13_04_ProtetedClass();

//        print(pt.protectedstr);
//        print(pt.defaultStr);
//        print(pt.protectedStr);
        print(pt.publicStr);


        ProtectedMain pm = new ProtectedMain();


    }




    static void print(String a){System.out.println(a);}

}
