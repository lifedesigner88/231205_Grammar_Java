package A01_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;


public class C06_String {
    public static void main(String[] args){
        print("");

//        Wrapper Class
//        원시(primitive) literal 값으로 세팅.

        String str = new String("세종");

//        int => Integer
//        char => Character
//        long => Char



        // int 와 Interger 의 형변환

        int int_num = 10;
        Integer a = new Integer(20);

        int c = a ;                                 // auto 언박싱
        int d = a.intValue() ;                      // 언박싱

        Integer b = int_num ;                       // auto 박싱
        Integer e = Integer.valueOf(int_num) ;          // 박싱


        // String 과 int 의 변형;

        int int_num1 = 10;
        String st_a = Integer.toString(int_num1);

        int c2 = Integer.parseInt("11");



        // 참조 자료형에 원시자료형을 담을 떄는 wrapper 클래스를 써야한다.
        // ex)컬렉션프레임워크 (List, Set ....);

        List<Integer> list_a = new ArrayList<>();
        list_a.add(10);
        list_a.add(20);
        list_a.add(30);
        print(list_a);


        String mySt1 = new String("hello");
        String mySt2 = new String("hello");
        String mySt3 = "hello";
        String mySt4 = "hello";
        String mySt5 = "hello java java";


        //      String method 들 입니다.

//        length()
        String mySt = " hello ";
        print("length() : " + mySt.length());


//        indexOf  - 특정 문자열의 시작 인댁스
        String myStr2 = "hello java java";
        print("indexOf : " + mySt2.indexOf("java"));


//        contains
        String myStr3 = "hello java java";
        print("contain : " + myStr3.contains("j"));
        print("");


//        charAt : 특정 인덱스의 문자값을 리턴
        String st = "aaabcdefabaadfaaaaaaa";

        int counter = 0;
        for (int i = 0 ; i < st.length() ; i++)
            if(st.charAt(i) == 'a')
                counter++;

        print(st);
        print("위 문장에서 a는 " + counter + "개 존재합니다.");



//        substring(a,b) a이상 b미만의 index를 자른다.

        String s1 = "hello world";
        print(s1.substring(0, 5));
        print(s1.substring(6,s1.length()));


//        trim, strip
        String trimSt = "       hello world  ";
        print(trimSt.trim());
        print(trimSt);
        print(trimSt.strip());
        print(trimSt);



//        toUpperCase / toLowerCase
        String s3 = "Hello";
        String a1 = s3.toUpperCase();
        String a2 = s3.toLowerCase();

        print(a1 + " " + a2);



//        문자열 더하기

        String s4 = "Hello";
        s4 += " world";
        print(s4);



//      Char -> String 형변환

        char ch1 = 'a';
        String st1 = Character.toString(ch1);


//      알파벳 뺴고 다시 집어넣기.

        String str3 = "172a8한937ssjkasdk구jh";
        String str2 = "";

        for (int i = 0 ; i < str.length() ; i++) {
            if ('a' <= str.charAt(i) && 'z' >= str.charAt(i)) ;
            else
                str2 += str.charAt(i);

        }
        print(str2);


//        my_string.toCharArray(); => char 배열로 변경
//        String[] arr = my_string.split("");
//        아무것도 없으면 스트링 배열로 변경.
//        StringBuilder .. sb.setCharAt(index, char)

// 정규표현식


//  replace(a,b) : a 문자를 b문자로 대체

        String str1 = "hello world";
        String st2 = st1.replace("world", "java");
        print(st2);

//  replaceAll(a,b)

        String st3 = st1.replaceAll("world", "python");
        print(st3);

        String str4 = "172a8한937ssjkasdk구jh";
        String str5 = str4
                .replaceAll("[a-z]", "");
        print("소문자 제거 : " + str5);

        String str6 = str4.replaceAll("[가-힣]","");
        print("한글 제거 : " + str6);

        String str7 = str4.replaceAll("[0-9]","");
        print("한글 제거 : " + str7);

        String str8 = str4.replaceAll("[A-Za-z0-9]","");
        print("한글 제거 : " + str8);




//        Pattern 클래스
//        전화번호 검증
        boolean matcher = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-1223-1234");
        print(matcher);
//          이메일 검증
        boolean matcher2 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "sejong@naver.com");
        print(matcher2);



//        split

        String a24 = "a:b:c:d";
        String[] stArr = a24.split(":");
        print(Arrays.toString(stArr));

        String a23 = "a b c  d";
        String[] stArr2 = a23.split(" ");
        print(Arrays.toString(stArr2));

        String a3 = " a b c  d";
        String[] stArr3 = a3.strip().split("\\s+");
        print(Arrays.toString(stArr3));

//        isEmpty 와 Null 구분



        String str11 = null;
        String str21 = "";
        print( str11 == null );


//        NullPointerException

        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "world";
        print(arr[3]);



//      프로그래머스 가운데 글자 가져오기 나만의 풀이.

class Solution {
    public String solution(String s) {
        String answer = "";

        int count = s.length();
        int lastCount = count+3;

        int[] arr = new int[lastCount];

        for(int i = 0 ; i < lastCount; i++)
            arr[i] = i/2;
        answer = s.substring(arr[count-1], arr[lastCount-1]);

        return answer;
    }
}



//        String before = "asdf";
//        char[] a = before.toCharArray();
//        String(a)

// join : String[] -> String 합치기

        String[] arr44 = {"html", "java", "java-script", "python"};
        print(String.join(" ",arr44));

        // String 과 int의 형변환

        int a12 = 10;
        String st_a2 = Integer.toString(a12);
        String st_a1 = String.valueOf(a12);



// StringBuffer 는 문자열을 추가하거나 변경할 때 주로 사용하는 객체

        StringBuffer sb = new StringBuffer("hello");


        sb.append(" world");
        print("append result : " + sb.toString());
        sb.insert(sb.indexOf(" ")," java");
        enter();
        print("substring : " + sb.substring(6, 10));
        print("substring result : " + sb.toString());
        sb.delete(6, 11);
        print(sb.toString());

// 성능 String < StringBuffer < StringBuilder (스레드 safe X)

        StringBuilder sb2 = new StringBuilder("hello");
        sb2.append(2);

        String strtt = new String("dsf");

        String[] arr2 = {} ;
        String.join ("", arr2);


        int[][] board = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};

        int k = 3;


                int answer = 0;

                for (int row = 0; row < board.length; row++)
                    for (int col = 0; row + col < k; col++)
                        answer += board[row][col];

                print("정답은" + answer);


    // 문자열 밀기 풀이.

        class Solution2 {
            public int solution(String A, String B) {
                int answer = 0;
                int length = A.length();
                StringBuilder temp = new StringBuilder(A);


                for (int i = 0 ; i < length ; i++){
                    if (B.equals(temp.toString()))
                        break;
                    temp.insert(0,temp.charAt(length-1));
                    temp.delete(length, length+1);
                    answer++;
                }

                if (!B.equals(temp.toString()))
                    answer = -1;

                return answer;

            }
        }


        class Solution3 {
            public int solution(String A, String B) {
                int answer = -1;
                int length = A.length();
                StringBuilder temp = new StringBuilder(A);


                for (int i = 0 ; i < length ; i++){
                    if (B.equals(temp.toString())){
                        answer = i;
                        break;
                    }
                    temp.insert(0,temp.charAt(length-1));
                    temp.delete(length, length+1);
                }

                return answer;
            }
        }


    } // main

    private static void enter() {
        print("");
    }

    // Print funtion
    private static void print(List<Integer> A) {
        System.out.println(A);
    }
    private static void print(String a) {
        System.out.println(a);
    }
    private static void print(boolean a) {
        System.out.println(a);
    }
    private static void print(int a) {
        System.out.println(a);
    }

}
