import java.util.Arrays;

public class ArrayReversClass {
    public static void main(String[] args) {
        int[] arr = new int[50];
//        int j = 0;
        for (int i = 1, j = 0; i < 100; i+=2, j++) {
            arr[j] = i;
//            j++;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i > -1 ; i--) {
            System.out.print(arr[i] + " ");
        }

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] =  i + 1;
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = arr.length - 1; i >= 0; i-=2) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] % 2 != 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }
    }
}
