package A05_AnonymousLamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class C15_04_Applicant {
    public static void main(String[] args) {
        System.out.println();

        List<Applicant> Y_2023 = new ArrayList<>();

        Applicant A001 = new Naver(100,35,"세종");
        Applicant A002 = new Naver(72,95,"철수");
        Applicant A003 = new Naver(52,100,"영희");

        Y_2023.add(A001);
        Y_2023.add(A002);
        Y_2023.add(A003);

        Collections.sort(Y_2023);

        System.out.println("네이버 지원자순위: " + Y_2023);
        System.out.println("최종합격자: " + Y_2023.get(0));

        System.out.println();


        List<Applicant> K_2023 = new ArrayList<>();

        Applicant K001 = new KaKao(100,35,"세종");
        Applicant K002 = new KaKao(72,95,"철수");
        Applicant K003 = new KaKao(52,100,"영희");

        K_2023.add(K001);
        K_2023.add(K002);
        K_2023.add(K003);


        Collections.sort(K_2023);

        System.out.println("카카오 지원자순위: " + K_2023);
        System.out.println("최종합격자: " + K_2023.get(0));

        System.out.println();



//        출석점수 기준 람다 활용
        K_2023.sort((o1, o2) -> o2.getAttendance() - o1.getAttendance());

        System.out.println("카카오 출석점수순위: " + K_2023);
        System.out.println("출석 1등: " + K_2023.get(0));
        System.out.println();


//        코테점수 기준 람다 활용
        K_2023.sort(new Comparator<Applicant>() {
            @Override
            public int compare(Applicant o1, Applicant o2) {
                return o2.getCode_Test() - o1.getCode_Test();}
        });
        System.out.println("카카오 코테점수순위: " + K_2023);
        System.out.println("코테 1등: " + K_2023.get(0));



    } // main

} // 클래스


interface Applicant extends Comparable<Applicant>{  // 인스턴스
    public int totalScore();
    public int getCode_Test();
    public int getAttendance();
}

abstract class calculator implements Applicant {     // 추상클래스
    protected int Code_Test;
    protected int Attendance;
    protected String Name;

    calculator(int Code_Test, int Attendance, String Name) {
        this.Code_Test = Code_Test;
        this.Attendance = Attendance;
        this.Name = Name;}

    @Override
    public int getCode_Test() {return Code_Test;}
    public int getAttendance() {return Attendance;}

    @Override
    public String toString() {
        return   this.Name + "(" + this.totalScore()+")";}

    @Override
    public int compareTo(Applicant o) {
        return (this.totalScore() - o.totalScore())*(-1);}

}

class Naver extends calculator {                     // 구현클래스 1

    Naver(int Code_Test, int Attendance, String Name) {
        super(Code_Test, Attendance, Name);}

    @Override
    public int totalScore() {
        return Code_Test*7 + Attendance*3;}

}

class KaKao extends calculator {                    // 구현클래스 2

    KaKao(int Code_Test, int Attendance, String Name) {
        super(Code_Test, Attendance, Name);}

    @Override
    public int totalScore() {
        return Code_Test*5 + Attendance*5;}

}

