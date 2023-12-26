package A06_EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C16_04_Iterator {
    public static void main(String[] args) {
    print("");

    List<String> myList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

//    enhanced for 문으로 출력
    for (String a : myList) print("enhanced for: " + a);
    print("");


//    참조하고 있는 원본 데이터 삭제 가능 ->
    Iterator<String> iter = myList.iterator();
    while(iter.hasNext()) print("iterator: " + iter.next());
    while(iter.hasNext()) print("iterator: " + iter.next()); // 소모되어서 안나옴

//??
    while (iter.hasNext())
        if (iter.next().equals("banana"))
            iter.remove();

    for (String a : myList) print("제거: " + a);






//        StringBuilder sb = new StringBuilder();
//        sb.insert;


    } // main

    static void print(String a){
        System.out.println(a);
    }


}
