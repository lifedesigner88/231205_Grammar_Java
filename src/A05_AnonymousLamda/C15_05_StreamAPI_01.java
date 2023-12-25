package A05_AnonymousLamda;

import java.util.*;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class C15_05_StreamAPI_01 {
    public static void main(String[] args) {

    int[] arr = {20, 1, 4, 12}; // 전통적인 방식
        for (int j : arr) System.out.print(j);


//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그램 방식
//        java에서 함수형 프로그래밍을 지원하기 위한 라이브러리 -> StreamApi


//        스트림의 생성
        String[] stArr = {"HTML", "Css", "JAVA", "PYTHON"};

//        Strem<객체> 제네릭 타입으로 Stream객체가 생성
//        참조변수의 스트림변환의 경우 제네릭의 타입소거 문제 발생
//        제네릭의 타입소거란 Java버전의 호환성을 위해 제네릭 타입을 런타임시점에 제거하는 것을 의미.
        Stream<String> stStream = stream(stArr);
//        String[] stArr2 = stStream.filter(a -> a.length() <= 4).toArray(a->new String[a]);

//        메소드 참조 방식
        String[] stArr2 = stStream.filter(a -> a.length() <= 4).toArray(String[]::new);
        print("메소드 참조 방식" + Arrays.toString(stArr2));


        int[] intArr = {10, 20, 30, 40, 50};
        IntStream intStream = stream(intArr);

        int[] intArr2 = intStream.filter(a -> a>20).toArray();
        print("20보다 큰 값 필터링" + Arrays.toString(intArr2));


//        distinct // 중복제거 후 스트림 변환
        int[] intArr3 = {10, 20, 30, 40, 50, 10, 30, 40, 50, 50, 1};


//        중복제거후 종합 반환
        int answer = stream(intArr3)
                .distinct()
                .sum();
        print("중복제거후 종합 반환:" + answer);

//        중복제거 후 새로운 배열 생성
        String[] stArr3 = {"HTML", "Css", "JAVA", "PYTHON", "PYTHON"};
        String[] stArr4 = stream(stArr3)
                .distinct()
                .toArray(String[]::new);

        print("중복제거후 종합 스트링 반환:" + Arrays.toString(stArr4));


//        Int로 변환
        int[] myStream = stream(stArr3)
                .distinct()
                .filter(a -> a.length() <= 3)
                .mapToInt(String::length).toArray();

        print("Int로 변환:" + Arrays.toString(myStream));


//        숫자 배열 정렬하기.
        int[] arr5 = {5, 1, 2, 3, 5, 7};
        int[] intStream2 = stream(arr5).sorted().toArray();
        print("숫자정렬 int[]로 하는방법" + Arrays.toString(intStream2));


//        숫자 리스트 정렬하기
        List<Integer> myList = new LinkedList<>(Arrays.asList(6, 1, 2, 3, 4, 5, 6, 8));
//        collect (구체적인 컬렉션 객체 명시)
        List<Integer> myList2 = myList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        print("숫자 정렬은 Interger로 한다." + myList2);


//        문자의 정렬
        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript", "aaaa"));

        List<String> answerList = stList.stream()
                .filter(a -> a.length() >= 4)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        print("길이가 4이상" + answerList);


//        리스트에 모두 10개 더하기
        int[] arr_plus10 = myList.stream()
                .mapToInt(a -> a + 10)
                .sorted()
                .distinct()
                .toArray();

        print("리스트에 모두 10 더하기" + Arrays.toString(arr_plus10));


//        짝수만 골라서 제곱의 총합
        int answer2 = Arrays.stream(arr_plus10)
                .filter(a -> a % 2 == 0)
                .map(a -> a * a).sum();
        print("짝수만 골라서 제곱의 총합: " + answer2);



//        forEach, reduce (스트림 소모)
        int[] arr6 = {10, 20, 30, 40};;
        Arrays.stream(arr6).forEach(System.out::println);

//        reduce 누적연산
//        초기값을 지정하지 않으면 Optional 객체 return.
//        Optional 객체 : 값이 있을수도 있고, 없을 수도 있다는 것을 명시한 타입(java8이후 추가)

        String nullIs = null;
        Optional<String> myOptional = Optional.of("hello");

        int result = Arrays.stream(arr6)
                .reduce(1,(multi,aa) -> multi * aa);
        print("누적 곱" + result);


        result = Arrays.stream(arr6)
                .reduce(Integer::sum).getAsInt();

        result = Arrays.stream(arr6)
                .reduce(Integer::sum)
                .getAsInt();   // int 값 변환

        print("누적 합" + result);

//
        String[] stArr5 = {"HTML", "Css", "JAVA", "PYTHON", "PYTHON"};
        String stAnswer3 = Arrays.stream(stArr5)
                .reduce((temp, aa) -> temp + ", " + aa)
                .get(); // String 변환



        Deque<Integer> myDeque = new LinkedList<>();
        myDeque.addFirst(10);
        myDeque.addFirst(11);
        myDeque.addFirst(12);
        myDeque.addFirst(13);
        print("덱 출력" + myDeque);

        myDeque.addLast(20);
        myDeque.addLast(21);
        myDeque.addLast(22);
        print("덱 출력" + myDeque);

        myDeque.pollFirst();
        print("퍼스트 출력" + myDeque);

        myDeque.pollLast();
        print("라스트 출력" + myDeque);

        String answer1 = myDeque.stream()
                .map(Object::toString)
                .reduce((temp,str) -> temp + str)
                .get();





        print(stAnswer3);

        Optional<String> stAnswer4 = Arrays.stream(stArr5)
                .reduce((temp, aa) -> temp + ", " + aa);
//        if (stAnswer4.isPresent()) print(stAnswer4.get());
        stAnswer4.ifPresent(C15_05_StreamAPI_01::print);


//       count(), sum(), min(), findFirst()
//        최소, 최대, 평균, 총합 : min/max/average/sum
        List<Integer> myList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        OptionalInt min = myList3.stream()
                .mapToInt(i -> i)
                .min();
        print("최소값 min: " + min);


        OptionalInt max = myList3.stream()
                .mapToInt(i -> i)
                .max();
        print("최대값 max: " + max);

        OptionalDouble average = myList3.stream()
                .mapToInt(i -> i)
                .average();
        print("평균값: " + average);

        int sum = myList3.stream()
                .mapToInt(i -> i)
                .sum();

        print("평균값: " + average);



        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("jong", 33));
        myStudents.add(new Student("kim", 25));
        myStudents.add(new Student("park", 22));
        myStudents.add(new Student("choi", 35));
        myStudents.add(new Student("song", 28));
        myStudents.add(new Student("hun", 31));


//        findFirst()
        Optional<Student> st1 = myStudents.stream()
                .filter(Student-> Student.getAge() > 30)
                .findFirst();
        st1.ifPresent(student -> print("파인드 퍼스트:" + student));


//        제일 어린 사람
        Optional<Student> st2 = myStudents.stream()
                .min((o1, o2) -> o1.getAge() - o2.getAge());
        st2.ifPresent(student -> print("제일 어린사람은: " + student));


//        30대 이상 인원수
        long st3 = myStudents.stream()
                .filter(Student -> Student.getAge() >= 30)
                .count();
        print("30대 이상은: " + st3 + "명");


//        평균값
        OptionalDouble st4 = myStudents.stream()
                .mapToInt(Student::getAge).average();

        st4.ifPresent(Student -> print("모든 객체의 평균 나이는: " + Student + "입니다"));


//        30대 이상 선착순
        Optional<Student> st5 = myStudents.stream()
                .filter(Student -> Student.getAge() <= 30)
                .findFirst();
        st5.ifPresent(Student -> print("30세 이하중 선착순 등록자는 " + Student));


        Stack<Integer> stack = new Stack<>();

            stack.pop();


//        Integer List 를
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // 방법 1
        int[] arr1 = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++)
            arr1[i] = list.get(i);

        // 방법 2
        int[] arr2 = list.stream()
                .mapToInt(i -> i)
                .toArray();


        // 방법 2
        int[] arr22 = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        // 방법 3
        long[] arr3 = list.stream()
                .mapToLong(Long::valueOf)
                .toArray();

        // 방법 4
        int[] arr4 = list.stream()
                .filter(Objects::nonNull)
                .mapToInt(i -> i)
                .toArray();


        String a  = "";




//        기존 자바의 Null 처리
        String nullIs2 = null;

//        자바 8 이후에 나온 Optional 객체를 통해 특정 객체에 값이 없을지라도 모른다는 것을 명시적으로 표현;
//        빈값인지 아닌지 check하는 메서드 : isPresent();
        Optional<String> opt1 = Optional.empty();
        opt1.ifPresent(s -> s.compareTo("abc"));

//        Optional 객체 생성
        Optional<String> opt2 = Optional.ofNullable("hello"); //null 이 있을 수도 있음을 의미;




//        orElse관련, 메서드 사용하여 null(빈값)처리
//        orElse(), orElseGet(), orElsethrow();

//        orElse() 값이 있으면 해당값 return, 없으면 default 지정값 return
        System.out.println(opt1.orElse("").compareTo("abc"));

//        orElseGet() 값이 있으면 해당값 return, 없으면 람다함수 또는 메소드참조 실행
        System.out.println(opt1.orElseGet(String::new).compareTo("abc"));

//        orElseThrow() : 값이 있으면 해당값 return, 없으면 지정된 예외 강제 발생;
        int result1 = opt1.orElseThrow(() -> new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
        System.out.println(result1);


//        OptionalInt, OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1, 2, 3, 4)).stream()
                .mapToInt(i -> i)
                .max();

        if(oi.isPresent());else;
        System.out.println(oi.orElseThrow(() -> new NoSuchElementException("no Value")));

//        stream API => 디버깅이 어렵다.
//        OptionalInt o2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4)).stream()
//                .peek() => 추가로 공부.
//                .mapToInt(i -> i);
//                .max();


    } // main

    static void print(String a){System.out.println(a);}
}

