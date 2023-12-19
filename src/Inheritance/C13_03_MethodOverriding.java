package Inheritance;

public class C13_03_MethodOverriding {
    public static void main(String[] args) {

//        Animal 클래스 sound() -> 동물은 소리를 () -> 냅니다.
//        Dog 클래스 Ainimal 상속 -> sound overriding : 멍멍
//        Cat 클래스 : Animal 상속 -> Sound ovveriding : 야옹
//        메인 메서드에서 객체 2개 생성해서 sound 호출



//        다형성 (부모클래스 타입을 자식 클래스의 객체 타입으로 지정가능.

        Animal myAnimal = new Animal();
        myAnimal.sound();

        Animal myDog = new dog();
        myDog.sound();
        myDog.sound2();


        Animal myCat = new cat();
        myCat.sound();


    }


}


class Animal{
    public void sound(){
        System.out.println("동물은 소리를 냅니다.");
    }
    public void sound2(){
        System.out.println("22 동물은 소리를 냅니다.");
    }
}

class dog extends Animal{

    @Override
    public void sound(){
        System.out.println("멍멍");
    }


    @Override
    public void sound2(){
        System.out.println("222멍멍");
    }
}

class cat extends Animal{

    @Override
    public void sound(){
        System.out.println("야옹");
    }
}
