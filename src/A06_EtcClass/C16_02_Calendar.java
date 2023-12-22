package A06_EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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


    }
}
