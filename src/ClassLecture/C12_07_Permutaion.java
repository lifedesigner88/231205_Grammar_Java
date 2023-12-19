package ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_07_Permutaion {

        public static void main(String[] args) {

            print("");

            List<Integer> myList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
            List<List<Integer>> permu = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();


            int n = 4;          // 구하려는 조합의 크기

            boolean[] bool = new boolean[myList.size()];
            permu(n,myList,permu,temp,bool);

            print("" + permu);
            print("갯수: " + permu.size());


        }  //// main /////



        static void permu(int n,  List<Integer> myList, List<List<Integer>> permu, List<Integer> temp, boolean[] bool){

            if (temp.size() == n)
                permu.add(new ArrayList<>(temp));
            else
                for (int i = 0; i < myList.size() ; i++) {
                    if(!bool[i]) {
                        temp.add(myList.get(i));
                        bool[i] = true;}
                    else
                        continue;
                    permu(n, myList, permu, temp, bool);
                    temp.remove(temp.size()-1);
                    bool[i] = false;}

        }

    static void print(String a){System.out.println(a);}

}
