package A03_Inheritance;

// import java.util.*



//public class C13_05_Others extends FinalClass{
//final 클래스는 상속불가.


public class C13_05_Others {

//    final
//     Class

    public static void main(String[] args) {

        C1305Dog myDog =new C1305Dog();
        myDog.makeSound1();
        myDog.makeSound2();

        C1305Animal myAnimal = new C1305Animal() {
            @Override
            void makeSound1() {
                System.out.println("d");
            }
        };


        C1305Animal myAnimal2 = new C1305Animal() {
            @Override
            void makeSound1() {
                System.out.println("d");
            }
        };


        System.out.println(myDog.getClass());
        System.out.println(myAnimal.getClass());
        System.out.println(myAnimal2.getClass());



    }


}





final class FinalClass{}

abstract class C1305Animal{

//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }

    abstract void makeSound1();

    void makeSound2(){
        System.out.println("makesound2");
    };

}


class C1305Dog extends C1305Animal{

    @Override
    void makeSound1() {
        System.out.println("makesound1");

    }


//
//    @Override
//    void makeSound(){
//
//    }
}