public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arr[1]);
        System.out.println(arr[arr.length - 2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = -1;
            System.out.print(arr[j] + " ");
        }
    }
}
