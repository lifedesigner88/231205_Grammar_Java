package A02_ClassLecture;

import java.util.*;

public class C12_07_CombiPermu {
    public static void main(String[] args) {


print("");

        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<List<Integer>> combi = new ArrayList<>();
        List<List<Integer>> enhancedCombi = new ArrayList<>();
        List<List<Integer>> permu = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();




        int n = 6;          // 구하려는 조합의 크기
        print(myList.size() + "개의 요소를 가진 집합에서 " + n + "개의 순열 또는 조합 수");print("");



//        조합
        long start = System.currentTimeMillis();
        combi(n,0,myList,combi,temp);
        long end = System.currentTimeMillis();
        print("조합: " + (end - start) + " ms");

//        print("" + combi);
        print("갯수: " + combi.size()); print("");



//        향상 조합
        long start2 = System.currentTimeMillis();
        enhancedCombi(n,0,n-1,myList,enhancedCombi,temp);
        long end2 = System.currentTimeMillis();
        print("향상된 조합: " + (end2 - start2) + " ms");

//        print("" + enhancedCombi);
        print("갯수: " + enhancedCombi.size()); print("");

/*


//        순열
        long start3 = System.currentTimeMillis();
        boolean[] visited = new boolean[myList.size()];
        permu(n,myList,permu,temp,visited);
        long end3 = System.currentTimeMillis();
        print("순열: " + (end3 - start3) + " ms");

//        print("" + permu);
        print("갯수: " + permu.size()); print("");




//        합계가 6이상인 2개 순열만 add;

        List<List<Integer>> permuSum = new ArrayList<>();
        permuSum(2,myList,permuSum,temp,visited);
//        print("" + permuSum);
        print("갯수: " + permuSum.size()); print("");



//        합계가 6이상인 모든 순열 add;

        List<List<Integer>> permuSumAll = new ArrayList<>();
        for(int i = 0; i < myList.size(); i++){
            permuSum(i+1,myList,permuSumAll,temp,visited);}

//        print("" + permuSumAll);
        print("갯수: " + permuSumAll.size()); print("");




          // main에 출력하는 부분
        int[] maxNum = new int[3];
        permuMaxSum(maxNum, myList, visited);
        System.out.println("가장 큰 값은: " + maxNum[0]);


*/


//        // 조합 구성요소 체크 하는 코드
//        List<Set<Integer>> mySetList = new ArrayList<>();
//        Set<Integer> mySet= new LinkedHashSet<>();
//
//        for (int i = 0; i < n; i++) {
//            for (List<Integer> a : combi)
//                mySet.add(a.get(i));
//            mySetList.add(new LinkedHashSet<>(mySet));
//            mySet.clear();}
//
//        print("조합구성" + mySetList);




    }   /// main ///





//        향상 조합
    static void combi(int n, int start, List<Integer> myList, List<List<Integer>> combi, List<Integer> temp){

        if (temp.size() == n){
            combi.add(new ArrayList<>(temp));
            return;}

        for (int i = start; i < myList.size() ; i++) {
                temp.add(myList.get(i));
                combi(n, i + 1, myList, combi, temp);
                temp.remove(temp.size()-1);}
    }



//        향상 조합
    static void enhancedCombi(int n, int start, int ignore, List<Integer> myList, List<List<Integer>> combi, List<Integer> temp){

        if (temp.size() == n){
            combi.add(new ArrayList<>(temp));
            return;}

        for (int i = start; i < myList.size() - ignore ; i++) {
            temp.add(myList.get(i));
            enhancedCombi(n, i + 1,ignore-1, myList, combi, temp);
            temp.remove(temp.size()-1);}

    }


//        순열
    static void permu(int n,  List<Integer> myList, List<List<Integer>> permu, List<Integer> temp, boolean[] visited){

        if (temp.size() == n) {
            permu.add(new ArrayList<>(temp));
            return;}

        for (int i = 0; i < myList.size() ; i++) {
            if(!visited[i]) {
                temp.add(myList.get(i));
                visited[i] = true;
                    permu(n, myList, permu, temp, visited);
                temp.remove(temp.size()-1);
                visited[i] = false;}
        }
    }


    //      1 && 2.합계가 6이상인 순열만 add;
    static void permuSum(int n,  List<Integer> myList, List<List<Integer>> permu, List<Integer> temp, boolean[] visited){

        if (temp.size() == n) {
            int tempNum = 0;
            for (Integer a : temp) tempNum += a;
            if(tempNum >= 6) permu.add(new ArrayList<>(temp));
            return;}

        for (int i = 0; i < myList.size() ; i++) {
            if(!visited[i]) {
                temp.add(myList.get(i));
                visited[i] = true;
                permuSum(n, myList, permu, temp, visited);
                temp.remove(temp.size()-1);
                visited[i] = false;}
        }
    }



//      // main에 출력하는 부분
//    int[] maxNum = new int[3];
//    permuMaxSum(maxNum, myList, visited);
//    System.out.println("가장 큰 값은: " + maxNum[0]);



    //      3.합계가 가장 큰 값만
    static void permuMaxSum(int[] maxNum, List<Integer> myList, boolean[] visited){

        // maxNum[0] : 최대값
        // maxNum[1] : 3개 배열 합
        // maxNum[2] : 더해진 배열수 카운트

        if (maxNum[2] == 3 && maxNum[0] <= maxNum[1])
                maxNum[0] = maxNum[1];
        else
            for (int i = 0; i < myList.size(); i++)
                if (!visited[i]) {
                    maxNum[1] += myList.get(i);
                    maxNum[2]++;
                    visited[i] = true;
                        permuMaxSum(maxNum, myList, visited);
                    maxNum[1] -= myList.get(i);
                    maxNum[2]--;
                    visited[i] = false;
                }
    }






    static void print(String a){System.out.println(a);}
}






