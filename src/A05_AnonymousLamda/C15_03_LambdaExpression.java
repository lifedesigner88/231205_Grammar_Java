package A05_AnonymousLamda;

public class C15_03_LambdaExpression {

    public static void main(String[] args) {

//        실행문 1개일 때는 {}제외하고 return 생략
//        실행문 2개 이상일 때에는 {}포함하고 return 필요
//        매개변수를 순서로 인지하므로, 타입 지정해줄 필요는 없다.

    LambdaInterface join1 = (a, b, c) -> a + b + ":" + c ;


    LambdaInterface join2 = new LambdaInterface() {
        @Override
        public String makeString(String a, String b, int c) {
            return a + b + ":" + c;
        }
    };

    LambdaInterface join3 = (a,b,c) -> {
        String answer = a+b;
        return a + b + ":" + c;
    };


        System.out.println(join1.makeString("세종","이다",3));
        System.out.println(join2.makeString("세종","이다",2));
        System.out.println(join3.makeString("세종","이다",1));

    }

}

interface LambdaInterface{
    String makeString(String a, String b, int c);
}
