package ClassLecture;

public class C12_03_Class2 {
    public static void main(String[] args) {
        print("");

        Person sejong = new Person();

        sejong.setAge(21);
        sejong.setAge(10);
        sejong.setName("세종");
        sejong.setName("세종ㅁㄴㅇㄻㄴㄹㄴㅁㅇㄻㄴㄹ");
        sejong.setEmail("saintsj@naver.com");
        sejong.setEmail("234.ㅁㄴㅇㄹ");

        print("");
        print(sejong.getName() + "의 정보는  "
                + sejong.getAge() + "살  "
                + sejong.getEmail());


        print("");
        Person jongkyn = new Person();
        jongkyn.setName("종균");
        jongkyn.setAge(34);
        jongkyn.setEmail("lifedesinger@outlook.kr");

        print(jongkyn.getName() + "의 정보는  "
                + jongkyn.getAge() + "살  "
                + jongkyn.getEmail());
    }

    private static void print(String a) {
        System.out.println(a);
    }

}





class Person {

    private String name ;
    private String email;
    private String password;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 10)
            print("이름이 너무 깁니다");
        else
            this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@"))
            print("이메일 형식이 아닙니다");
        else
            this.email = email;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 20)
            print("나이가 너무 어립니다");
        else
            this.age = age;
    }
    private void print(String a) {
        System.out.println(a);
    }
}





























































