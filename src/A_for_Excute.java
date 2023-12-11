import java.util.Arrays;
import java.util.List;

public class A_for_Excute {
    public static void main(String[] args) {




        int temp = 0;

        int[] arr = {30, 22, 20, 25, 12};
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i+1; j < arr.length; j++)
                if ( arr[i] > arr[j] ) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    print(Arrays.toString(arr));

                }





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
