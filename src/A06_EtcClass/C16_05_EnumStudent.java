package A06_EtcClass;

public class C16_05_EnumStudent {
    public static void main(String[] args) {

        EnumStudent s1 = new EnumStudent("세종",ClassGrade.A1);
        EnumStudent s2 = new EnumStudent("종현",ClassGrade.A2);
        EnumStudent s3 = new EnumStudent("철수",ClassGrade.A3);


        EnumStudent s4 = new EnumStudent("철수",ClassGrade.A3,Role.GENERAL_USER);
        EnumStudent s5 = new EnumStudent("철수",ClassGrade.A3,Role.ADMIN_USER);


        System.out.println(s4.getRole().getClass());
        System.out.println(s5.getRole().ordinal());


    }

}


class ClassGrade{
    static final String A1 = "first_grade";
    static final String A2 = "second_grade";
    static final String A3 = "third_grade";
}


enum Role{
//    각 열거형 상수는 콤마로 구분하고, 상수 목록 끝에는 세미콜론으로 마무리.
    GENERAL_USER, ADMIN_USER, SUPER_USER;
}


class EnumStudent{

    private String name;
    private String classGrade;
    private Role role;

    public EnumStudent(String name, String classGrade){
        this.name = name;
        this.classGrade = classGrade;
    }

    public EnumStudent(String name, String classGrade, Role role) {
        this(name, classGrade);
        this.role = role;
    }



    public String getName() {return name;}
    public String getClassGrade() {return classGrade;}
    public Role getRole() {return role;}

}

