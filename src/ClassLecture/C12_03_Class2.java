package ClassLecture;

public class C12_03_Class2 {
    public static void main(String[] args) {

        Person.person_total++;
        Person sejong = new Person();

        sejong.name = "박세종";
        sejong.age = 11;


        print(sejong.whoIs());

    }

    private static void print(String a) {
        System.out.println(a);
    }

}






class Person {

    static int person_total;

    String name ;
    String email;
    String password;
    int age;

    String whoIs(){
        return "내 이름은 " + name      + "입니다. "
         + "이메일은 "      + email     + "이고, "
         + "비밀번호는 "    + password   + "이며, "
         + "나이는 "       + age        + "살 입니다.";

    }

    private void print(String a) {
        System.out.println(a);
    }

}
