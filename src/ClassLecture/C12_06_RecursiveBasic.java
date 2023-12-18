package ClassLecture;

public class C12_06_RecursiveBasic {
    public static void main(String[] args) {
        print("");

        int sum = 0;
        for (int i = 10; i > 0; i--)
            sum += i;

        print("1부터 10까지의 합: " + sum);

        int fac = 1;
        for (int i = 10; i > 0; i--)
            fac *= i;

        print("10! 값은?: " + fac);

    } // main



//    재귀함수: 재기호출하는 함수,  재귀호출: 자기자신을 호출

    static int add_acc(int num){
        if (num==1) return 1;
        return num + add_acc(num - 1);}




    static void print(String a){System.out.println(a);}
}