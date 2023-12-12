import java.util.*;
import java.util.stream.Collectors;

public class C08_List {
    public static void main(String[] args) {




//// 리스트 선언 방법
//        ArrayList<String> myList1 = new ArrayList<>();
//        List<String> myList2 = new ArrayList<>();   //왼 인터, 우 구현
//
//
//        myList2.add("java");
//        myList2.add("java");
//        myList2.add("python");
//
//        print(myList2);
//
////  초기값 생성방법 2. 하꺼번에 add
//
//        String[] myArr1 = {"java", "python", "c++"};
//        List<String> myList3 = new ArrayList<>(Arrays.asList(myArr1));
//
//
////  배열이 인트인 경우 -> 문제발생
//        int[] myIntArr1 = {1, 2, 3};
//        List<Integer> myIntList1 = new ArrayList<>();


//      add(E element)
//      add(int index ,E elemet);
//      addAll(Collection <? extends E> c);
//      get(int index)
//      size()
//      isEmpty()
//      set(int index, E elemet)
//      contains (element)





        // 2023.12.12

// 끼워넣기
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(1,15);
        print("끼워넣기 : " + myList.toString());



// 2번째 만들어 붙이기
        List<Integer> myList2 = new ArrayList<>();
        myList2.add(30);
        myList2.add(40);
        myList2.add(50);

        myList.addAll(myList2);
        print("붙이기 : " + myList.toString());
        print("붙이고 나서 List2 : " + myList2.toString());      //empty



// get 하기.
        for (Integer integer : myList) print(integer);



// 삭제하기.
        myList.remove(0);
        myList.remove(Integer.valueOf(0));
        print(myList.toString());



// 삽입하기.
        myList.set(myList.size()-1, 100);
        print(myList.toString());



// 특정값 이 있는지.
        print(myList.contains(15));



// 인덱스 찾기.  - 없으면 -1;
        List<Integer> myList3 = new ArrayList<>();

        myList3.add(10);
        myList3.add(10);
        myList3.add(20);
        myList3.add(30);

        print("인덱스 값은 : " + myList3.indexOf(20));     // 같은 숫자는 처음 값 리턴.



// 전체 삭제
        myList3.clear();
        print("클리어 : " + myList3.toString());



// 전체삭제.
        print(myList2.isEmpty());
        myList2.clear();



// 배열이 들어간 리스트.
        List<int[]> myList4 = new ArrayList<>();
        myList4.add(new int[]{1,2,3});
        myList4.add(new int[2]);

        myList4.get(1)[0] = 10;
        myList4.get(1)[1] = 20;

        System.out.println(Arrays.deepToString(myList4.toArray()));

        for (int[] I : myList4)
            print(Arrays.toString(I));




// 리스트가 들어간 리스트.
        List<List<Integer>> myList5 = new ArrayList<>();
        myList5.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        myList5.add(new ArrayList<>(Arrays.asList(1, 2, 3)));

        for (List<Integer> integers : myList5) integers.add(10);


        System.out.println("mylist5 : " + myList5);





// 리스트가 들어간 리스트.
        List<List<Integer>> myList6 = new ArrayList<>();
        myList6.add(new ArrayList<>());
        myList6.add(new ArrayList<>());
        myList6.add(new ArrayList<>());

        for (int i = 0; i < myList6.size(); i++)
            for (int j = 0; j < 3; j++)
                myList6.get(i).add((j+1)*(int)Math.pow(10,i));

        System.out.println("myList6 : " + myList6);



        print("");
        print("4교시");

// 정렬
        List<Integer> myList7 = new ArrayList<>(Arrays.asList(5,3,2,1,5));

        Collections.sort(myList7); myList7.add(4);
        Collections.sort(myList, Comparator.reverseOrder());
        myList7.sort(Comparator.naturalOrder());
        myList7.sort(Comparator.reverseOrder());




// String 배열 => list 로 변환.
        String[] str = {"1","2","3","4","5","6","7","8","9"};
        int[] intArr = {1,2,3,4,5,6,7};

// 1-1
        List<String> stList = new ArrayList<>(Arrays.asList(str));
// 1-2
        for (String S : str) stList.add(S);
        Collections.addAll(stList, str);

// 1-3
        List<String> stList3 = Arrays.stream(str)
                .collect(Collectors.toList());

        List<Integer> intList = Arrays.stream(intArr)
                .boxed()
                .collect(Collectors.toList());

        print("String Linked -> : " + stList.toString());
        String[] stArr1 = stList.toString().split(", ");

        print("String Linked -> : " + Arrays.toString(stArr1));

        String[] stArr2 = stList.stream().toArray(a -> new String[a]);
        String[] stArr = stList.toArray(String[]::new);



        // 2개를 더한 조합의 수 구하기. (*upload)
        int[] comStr = {1,2,3,4,5,6,7,8,9,0};

        List<Integer> comBi = new ArrayList<>();
        for (int i = 0; i < comStr.length-1; i++)
            for (int j = i + 1; j < comStr.length; j++)
                comBi.add(comStr[i] + comStr[j]);

        comBi.sort(Comparator.naturalOrder());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < comBi.size() - 1; i++)
            if (!comBi.get(i).equals(comBi.get(i+1)))
                result.add(comBi.get(i));

        result.add(comBi.get(comBi.size() - 1));

        print("Result : " + result);


        // 2개를 더한 조합의 수 구하기. (*upload)

        for (int i = 0; i < comStr.length-1; i++)
            for (int j = i + 1; j < comStr.length; j++)
                if(!comBi.contains(comStr[i] + comStr[j]))
                    comBi.add(comStr[i] + comStr[j]);

        comBi.sort(Comparator.naturalOrder());

        int[] answer = new int[comBi.size()];
        int counter = 0;
        for (Integer i : comBi) answer[counter++] = i;

        print("Result : " + comBi);



        // 약수 구하기
        int n = 12;
        List<Integer> multi = new ArrayList<>();

        counter = 1;
        do
            if (n % counter == 0)
                multi.add(counter);
        while(counter++ < n);

        print("n의 약수 : " + multi);






    } // main
    private static void print(List<String> A) {
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

