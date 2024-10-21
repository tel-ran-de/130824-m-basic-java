import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int key;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public static int searchLinear(int[] arr, int key) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
