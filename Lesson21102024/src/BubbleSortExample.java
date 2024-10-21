import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {22, 3, 4, 2, 50, 21, 1, 0, -10, 45};
        int[] arr1 = {22, 3, 4, 2, 50, 21, 1, 0, -10, 45};
        long start = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Start time " + start);
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("All time " + (System.currentTimeMillis() - start));

        long start1 = System.currentTimeMillis();
        System.out.println("Start time2 " + start1);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("All time2 " + (System.currentTimeMillis() - start1));
    }

    public static void sortBubble(int[] arr) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
