import java.util.Arrays;
import java.util.List;

public class A_for_Excute {
    public static void main(String[] args) {
        print("");

//        int temp = 0;
//
//        int[] arr = {30, 22, 20, 25, 12};
//        for (int i = 0; i < arr.length - 1; i++)
//            for (int j = i+1; j < arr.length; j++)
//                if ( arr[i] > arr[j] ) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                    print(Arrays.toString(arr));
//
//                }

//        int count = 0;
//        int[] arr = {10, 20, 30, 40, 50, 60};
//
//        for (int i = 0; i < arr.length - 1; i++)
//            for (int j = i + 1; j < arr.length; j++) {
//                print(arr[i] + "," + arr[j] + "  count : " + ++count);
//                print("sum = " + (arr[i] + arr[j]));
//            }

//        중복제거하기
//        int[] temp = {10,10,40,5,7,7,7,7,4,10,22,12,44,10,5};
//        int[] temp = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5};

//        배열복사
//        int[] new_temp = Arrays.copyOfRange(temp,0,3);

//
//        int[] temp = {1,2,3,9,4,5,6,7,8,1,9,9,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(temp));
//
//        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));
//
//        String strTemp = "";
//
//        for (int i = 0; i < temp.length; i++) {
//            strTemp += temp[i] + ",";
//            for (int j = i + 1; j < temp.length; j++)
//                if (temp[i] != temp[j]) {
//                    i = j-1;
//                    break;
//                }
//        }
//        String[] result = strTemp.split(",");
//        System.out.println(Arrays.toString(result));
//
//
//        int[] new_temp = new int[temp.length];
//        int count = 0;
//
//        for (int i = 0; i < temp.length-1; i++)
//            if (temp[i] != temp[i+1])
//                new_temp[count++] = temp[i];
//
//        new_temp[count++] = temp[temp.length-1];
//        int[] answer = Arrays.copyOfRange(new_temp,0,count);
//
//        System.out.println(Arrays.toString(answer));
//        print(Arrays.toString(answer));


//      버블정렬
        int[] arr = {9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,1,2,3,4,1,2,3,4,1,2,3,4};
        System.out.println(Arrays.toString(arr));
        int temp= 0;
        int length = arr.length -1;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int complet = 0;

        for (int i = 0; i < length ; i++) {
            complet = count1;
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count1++;
                }
                count2++;
            }
            if (count1 == complet)
//                break;
            count3++;
        }

        System.out.println(Arrays.toString(arr));
        print(count1 + count2 + count3);
        print(arr.length);
        print(arr.length*arr.length);













    }   // main
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


















































