package A05_AnonymousLamda;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class C15_04_ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표저긍로 2개 제공 : Comparable, Comparator
//        Comparable 인터페이스에는 compareTo메서드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음
//        일반적으로 클래스 내에서 직접 구현해서 사용.
//
//        Comparator 인터페이스는 compare 메서드가 선언,
//
//                  Comparator      int compare(T o1, T o2);
//                  Comparable      public int compareTo(T o);

//        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
//        문자열의 자릿수의 차이가 발생할 때, 그 문자의 유니코드 값의 차이를 반환.

//
//        Scanner myScan = new Scanner(System.in);
//
//        String a ="0" ;
//        String b = myScan.nextLine();
//        System.out.println(a.compareTo(b));
//        if (a.compareTo(b) < 0) System.out.println(a + "가" + b + "더 큽니다.");;
//
//
//        List<String> myList = new ArrayList<>();
//        myList.add(a);
//        myList.add(b);
//
//        Collections.sort(myList); //오름차순
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

        List<Student> studentList = new ArrayList<>();

        Integer intA = 1;
        Integer intB = 1;
        System.out.println(intA.compareTo(intB));

        studentList.add(new Student("3", 3));
        studentList.add(new Student("30", 30));
        studentList.add(new Student("34", 34));
        studentList.add(new Student("5", 5));
        studentList.add(new Student("9", 9));


//        System.out.println(studentList);
//        for (Student c : studentList) System.out.println(c.toString());


        System.out.println(" ");







//        방법1 : Comparator를 익명객체 방식으로 활요하여 정렬, 매개변수 2개



        // 나이로 정렬
        studentList.sort((o1,o2) -> o1.getAge()-o2.getAge());
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//              기본은 오름차순 정렬 하려고 시도
//                o1. getAge()가 더 작은 숫자다 라고 가정
                return o1.getAge() - o2.getAge();    // 오름차순
            }});

//        for (Student c : studentList) System.out.println(c.toString());
        System.out.println(" ");


//        Queue<String> myQue = new PriorityBlockingQueue<>()





//      이름으로 정렬
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }});

        for (Student c : studentList) System.out.println(c.toString());




//        글자길이수로 오름차순 정렬
        String[] stArr = {"hello", "java", "C++", "world222"};
        Arrays.sort(stArr, Comparator.reverseOrder());

//        Priority Queue 내림차순

        Queue<String> myQue = new PriorityQueue<>();






//        방법2 : Comparable 인터페이스 implemnets 후 compareTo 메서드 구현;




    } // main

} // 클래스


class Student{

    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return " 이름은: " + this.name + "  나이는:" + this.age;
    }

}