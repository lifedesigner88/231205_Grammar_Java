package ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_07_CombiPermu {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<List<Integer>> combi = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();


//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//
//            for (int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//
//                    combi.add(new ArrayList<>(temp));
//
//                temp.remove(temp.size()-1);
//            }
//
//            temp.remove(temp.size()-1);
//        }
//
//        print("조합 리스트를 담은 리스트 출력: " + combi);

        combi(4,0,myList,combi,temp);
        print("조합 리스트를 담은 리스트 출력: " + combi);
        print("조합갯수 " + combi.size());


//        import java.util.*;
//
//        class Solution {
//            public int solution(int balls, int share) {
//
//                Integer[] ball = new Integer[30];
//                Integer num = 0;
//                for (Integer a : ball) ball[num++] = num;
//
//                Stack<Stack<Integer>> comStack = new Stack<>();
//                Stack<Integer> tempStack = new Stack<>();
//
//                combi(share, 0, ball, comStack, tempStack);
//
//                System.out.println(comStack);
//
//
//                int answer = 0;
//                return answer;
//            }
//
//            static void combi(int n, int start, Integer[] ball, Stack<Stack<Integer>> comStack, Stack<Integer> tempStack){
//                if (tempStack.size() == n)
//                    comStack.push(tempStack);
//
//                for (int i = start; i < ball.length; i++){
//                    tempStack.push(ball[i]);
//                    combi(n, start + 1, ball, comStack, tempStack);
//                    tempStack.pop();
//                }
//
//
//
//            }
//
//        }


    }
    static void print(String a){System.out.println(a);}

    static void combi(int n, int start, List<Integer> myList, List<List<Integer>> combi, List<Integer> temp){

       if (temp.size() == n)
           combi.add(new ArrayList<>(temp));
       else
            for (int i = start; i < myList.size(); i++) {
                temp.add(myList.get(i));
                combi( n, i+1, myList,combi,temp);
                temp.remove(temp.size()-1);}


    }
}
