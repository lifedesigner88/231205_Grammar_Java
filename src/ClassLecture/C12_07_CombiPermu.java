package ClassLecture;

import java.util.*;

public class C12_07_CombiPermu {
    public static void main(String[] args) {


print("");


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


        List<Integer> myList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<List<Integer>> combi = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int n = 4;
        combi(n,0,myList,combi,temp);




        print("조합 리스트를 담은 리스트 출력: " + combi);
        print("조합갯수 " + combi.size());



        List<Set<Integer>> mySetList = new ArrayList<>();
        Set<Integer> mySet= new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            for (List<Integer> a : combi)
                mySet.add(a.get(i));
            mySetList.add(new LinkedHashSet<>(mySet));
            mySet.clear();}

        print("" + mySetList);








// 생각해볼것. update
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
           combi.add(temp);
       else
            for (int i = start; i < myList.size() ; i++) {
                temp.add(myList.get(i));
                combi(n, i + 1, myList, combi, temp);
                temp.remove(temp.size()-1);}

    }
}

//          start + length - n + 1

/*



    for (int i = 0; i < 5    0 + 8 - 4 + 1 ; i++) {
        temp.add(myList.get(0));

            for (int i = 1; i < 6   1 + 8 - 4 ; i++) {
                temp.add(myList.get(1));

                    for (int i = 2; i < 7   2 + 8 - 4 ; i++) {
                        temp.add(myList.get(2));

                            for (int i = 3; i < 8 3 + 8 - 4 ; i++) {
                                temp.add(myList.get(3));
                                  combi(n, i + 1, myList, combi, temp);
                                temp.remove(temp.size()-1);}
                        temp.remove(temp.size()-1);}
                temp.remove(temp.size()-1);}
        temp.remove(temp.size()-1);}


    for (int i = 0; i < myList.size() ; i++) {
        temp.add(myList.get(i));

            for (int i = start; i < myList.size() ; i++) {
                temp.add(myList.get(i));

                    for (int i = start; i < myList.size() ; i++) {
                        temp.add(myList.get(i));

                            for (int i = start; i < myList.size() ; i++) {
                                temp.add(myList.get(i));
                                  combi(n, i + 1, myList, combi, temp);
                                temp.remove(temp.size()-1);}
                        temp.remove(temp.size()-1);}
                temp.remove(temp.size()-1);}
        temp.remove(temp.size()-1);}
*/









//
//        [1, 2, 3, 4], [1, 2, 3, 5], [1, 2, 3, 6], [1, 2, 3, 7],
//        [1, 2, 4, 5], [1, 2, 4, 6], [1, 2, 4, 7],
//        [1, 2, 5, 6], [1, 2, 5, 7],
//        [1, 2, 6, 7],
//
//        [1, 3, 4, 5], [1, 3, 4, 6], [1, 3, 4, 7],
//        [1, 3, 5, 6], [1, 3, 5, 7],
//        [1, 3, 6, 7],
//
//        [1, 4, 5, 6], [1, 4, 5, 7],
//        [1, 4, 6, 7],
//
//        [1, 5, 6, 7],

//
//
//        [2, 3, 4, 5], [2, 3, 4, 6], [2, 3, 4, 7],
//        [2, 3, 5, 6], [2, 3, 5, 7],
//        [2, 3, 6, 7],

//        [2, 4, 5, 6], [2, 4, 5, 7],
//        [2, 4, 6, 7],
//
//        [2, 5, 6, 7],


//
//        [3, 4, 5, 6], [3, 4, 5, 7],
//        [3, 4, 6, 7],

//        [3, 5, 6, 7],
//
//

//        [4, 5, 6, 7]]
//

