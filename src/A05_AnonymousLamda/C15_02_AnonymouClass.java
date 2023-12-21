package A05_AnonymousLamda;

public class C15_02_AnonymouClass {
    public static void main(String[] args){

        Animal dog1 = new Animal() {
            @Override
            public void makeSound(int n) {
                System.out.println("멍멍 x" + n);
            }
        };


        // 익명 객체에 구현 메서드가 1개 밖에 없을 경우 람다표현식(화살표 함수) 표현가능.
        // ()부분에 매개변수 지정하여 구현체에서 활용
        Animal cat1 = (s) -> System.out.println("야옹 x" + s);


        Animal cat2 = new Animal() {
            @Override
            public void makeSound(int n) {
                System.out.println("멍멍 x" + n);
            }
        };
        dog1.makeSound(3);
        cat1.makeSound(3);
        cat2.makeSound(4);



    }// main
}

interface Animal{
    void makeSound(int n);
}
