package A02_ClassLecture;

public class C12_04_Constructor {
    public static void main(String[] args) {
        print("");

        Calender cal1 = new Calender("2023","12","15");
        cal1.printCal();

        Calender cal2 = new Calender("2023","12");
        cal2.printCal();


        Calender cal3 = new Calender();
        cal3.printCal();

        Calender cal4 = new Calender("2023");
        cal4.printCal();


    }
    static void print(String a){System.out.println(a);}
}


class Calender{
    private String year;
    private String month;
    private String day;

    Calender(){}

    Calender(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;}


    Calender(String year, String month){
        this(year, month, null);}

    Calender(String year){
        this(year, null, null);}

    void setYear(String year){this.year = year;}
    void setMonth(String month){this.month = month;}
    void setDay(String day){this.day = day;}


    void printCal(){
        System.out.println( " year: " + year +
                            " month: " + month +
                            " day: " + day);}

    String getYear(){return year;}
    String getMonth(){return month;}
    String getDay(){return day;}
}