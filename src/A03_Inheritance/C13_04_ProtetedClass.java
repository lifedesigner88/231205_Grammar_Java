package A03_Inheritance;

// public : 프로젝트 전체에서 접근가능
// protected : 패키지를 벗어나도 상송관계인 경우엔 접근가능
// defalult : 패키지 내에서만 접근가능
// private : 클래스 내에서만 접근가능

public class C13_04_ProtetedClass {

    private final String privateStr =    "hello java";
    String defaultStr =            "hello java";
    protected String protectedStr =  "hello java";
    public String publicStr =     "hello java4";

}
