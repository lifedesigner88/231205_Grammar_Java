package ClassLecture;

public class C12_05_MethodOverloading {
    public static void main(String[] args) {


    C12_05_MethodOverloading a = new C12_05_MethodOverloading();


        print("2자리 더하기" + a.sum(3, 4));
        print("3자리 더하기" + a.sum(3, 4, 5));


    }


    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    private static void print(String a) {System.out.println(a);}

}
