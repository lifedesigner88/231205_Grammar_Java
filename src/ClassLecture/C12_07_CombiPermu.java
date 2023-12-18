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


        List<Integer> myList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                                            11, 12, 13, 14, 15, 16, 17, 18, 19,
                                                            20, 21, 22, 23, 24,25,26,27,28,29));
        List<List<Integer>> combi = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int n = 20;          // 구하려는 조합의 크기

        long start = System.currentTimeMillis();
        combi(n,0,myList,combi,temp);
        long end = System.currentTimeMillis();
        System.out.println("기존 재귀: " + (end - start) + " ms");


        long start2 = System.currentTimeMillis();
        enhancedCombi(n,0,n-1,myList,combi,temp);
        long end2 = System.currentTimeMillis();
        System.out.println("향상된 재귀: " + (end2 - start2) + " ms");


//        print("조합 리스트를 담은 리스트 출력: " + combi);
//        print("조합갯수 " + combi.size());


//
//        List<Set<Integer>> mySetList = new ArrayList<>();
//        Set<Integer> mySet= new LinkedHashSet<>();
//
//        for (int i = 0; i < n; i++) {
//            for (List<Integer> a : combi)
//                mySet.add(a.get(i));
//            mySetList.add(new LinkedHashSet<>(mySet));
//            mySet.clear();}
//
//        print("" + mySetList);



    }
    static void print(String a){System.out.println(a);}


    static void combi(int n, int start, List<Integer> myList, List<List<Integer>> combi, List<Integer> temp){

        if (temp.size() == n)
           combi.add(new ArrayList<>(temp));
        else
            for (int i = start; i < myList.size() ; i++) {
                temp.add(myList.get(i));
                combi(n, i + 1, myList, combi, temp);
                temp.remove(temp.size()-1);}

    }


    static void enhancedCombi(int n, int start, int ignore, List<Integer> myList, List<List<Integer>> combi, List<Integer> temp){

        if (temp.size() == n)
            combi.add(new ArrayList<>(temp));
        else
            for (int i = start; i < myList.size() - ignore ; i++) {
                temp.add(myList.get(i));
                enhancedCombi(n, i + 1,ignore-1, myList, combi, temp);
                temp.remove(temp.size()-1);}

    }


}






