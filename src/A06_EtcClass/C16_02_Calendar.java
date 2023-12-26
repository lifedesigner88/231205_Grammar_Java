package A06_EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C16_02_Calendar {
    public static void main(String[] args) {
//        날짜 관련 클래스의 종류 : Calendar(java.util), java.time 패키지 안에 있는 Local~ 클래스

        System.out.println();

//        Calender 클래스.
        Calendar time = Calendar.getInstance();
        System.out.println("Calendar.getInstance(): " + time.getTime());


//      데이값.
//        System.out.println(time.get(Calendar.YEAR));
//        System.out.println(time.get(Calendar.MONTH)+1);
//        System.out.println(time.get(Calendar.DAY_OF_MONTH));
//        System.out.println(time.get(Calendar.DAY_OF_WEEK));
//        System.out.println("24시간: " + time.get(Calendar.HOUR_OF_DAY));
//        System.out.println("시간 " + time.get(Calendar.HOUR));
//        System.out.println("분: " + time.get(Calendar.MINUTE));



//        java.time 패키지 : Local ~ 클래스
        LocalTime present_time = LocalTime.now();
        System.out.println("LocalTime.now(): " + present_time);

        LocalDate present_date = LocalDate.now();
        System.out.println("LocalDate.now(): " + present_date);

        LocalDateTime present_dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime.now(): " + present_dateTime);



//        임의로 특정 시간을 만들어 내고 싶을때
        LocalDate birthDay = LocalDate.of(1988, 9, 12);
        LocalTime birthTime = LocalTime.of(22, 2, 19, 20);

        LocalDateTime birthDateTime = LocalDateTime.of(birthDay, birthTime);


//        크로노 필드 enum 타입 사용 ( 매개변수로 사용하기 좋다. ) - 크로노 필드를 받아 프로그램의 유연성 향상
        print("크로노 YEAR: " + birthDateTime.getYear());
        print("크로노 YEAR: " + birthDateTime.get(ChronoField.YEAR));
        print("크로노 MONTH_OF_YEAR: " + birthDateTime.getMonth());
        print("크로노 MONTH_OF_YEAR: " + birthDateTime.get(ChronoField.MONTH_OF_YEAR));
        print("크로노 AMPM_OF_DAY: " + birthDateTime.get(ChronoField.AMPM_OF_DAY));


//        현재시간은 오전/오후 입니다.
        String isAmPm = (birthTime.get(ChronoField.AMPM_OF_DAY) == 0) ? "오전" : "오후";

        print("오전/오후 판별:" + isAmPm);




    }

    static void print(String a){System.out.println(a);};
}
