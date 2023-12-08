import java.util.Arrays;
import java.util.List;

public class C07_Array {
    public static void main(String[] args){
        print("");

/*

//        (1)
        int[] int_arr1 = {1, 2, 3, 4};


//        (2)
        int[] int_arr2 = new int[4];
        int_arr2[0] = 1;
        int_arr2[1] = 2;
        int_arr2[2] = 3;
        int_arr2[3] = 4;


//        (3)
        int[] int_arr3 = new int[]{1, 2, 3, 4};



//        int [] int_arr4 = new int[]; 길이를 정해줘야함, 나중에 늘리는 것은 불가능.

*/


/*

        int sum = 0;

        int[] int_num = {85, 65, 90};
        for(int a : int_num)
            sum += a;
        double averge = (double) sum/int_num.length;
        print("합계는 " + sum +"이고 평균은 "+ averge + "입니다");

*/

/*

        int[] arr = {10, 20, -3, 41, 45, 2, 34, 6,-7};

        int max = arr[0];
        int min = arr[0];

        for ( int a : arr ){
            if (max < a)
                max = a;
            if (min > a)
                min = a;
        }

        print("max : " + max + "     min : " + min);

*/

// 배열의 순서 바꾸기
/*

        int[] arr = {10, 20};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        print(Arrays.toString(arr));
*/
/*

        int temp2 = 0 ;

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
        for ( int i = 0 ; i < arr2.length-1 ; i++ ){
            temp2 = arr2[i];
            arr2[i] = arr2[i+1];
            arr2[i+1] = temp2;
        }
        print(Arrays.toString(arr2));

*/


/*      for upload ********************

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int length = arr.length;
        int[] arr2 = new int[length];

        for ( int a : arr )
            arr2[--length] = a;

        print(Arrays.toString(arr2));

*/










    } // main

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




















