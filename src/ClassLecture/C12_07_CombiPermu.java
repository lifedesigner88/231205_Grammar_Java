package ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_07_CombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        List<List<Integer>> combi = new ArrayList<>();

        for (int i = 0; i < myList.size()-1; i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(myList.get(i));
                temp.add(myList.get(j));
                combi.add(temp);
            }
        }

        print("조합 리스트를 담은 리스트 출력" + combi + combi.size());



    }
    static void print(String a){System.out.println(a);}
}
