package Interface;

public class interfaceMain {
    public static void main(String[] args) {

        CatImplements myCat = new CatImplements();
        myCat.makeSound();

        AnimalInterface1 myCat2 = new CatImplements();
        myCat.makeSound();

        DogImplements myDog = new DogImplements();
        myDog.makeSound();


        // 다형성이란 하나의 객체가 여러개의 참조변수를 가질 수 있음을 의미
        CatMultiImplements myMultiCat = new CatMultiImplements();
        AnimalInterface1 myMultiCat2 = new CatMultiImplements();
        AnimalInterface2 myMultiCat3 = new CatMultiImplements();
        myMultiCat.makeSound();


        print(myMultiCat.play("코리안 숏헤어", "브리티시폴드"));

        DogMultiImplements myMultiDog = new DogMultiImplements();
        AnimalInterface1 a1 = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };

    }

    static void print(String a){System.out.println(a);}

}
