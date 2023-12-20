package Interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_vs_LinkdedList {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            myList.add(i);

        long endTime = System.currentTimeMillis();
        System.out.println("소요시간: " + (endTime - startTime)+"ms");
    }
}
