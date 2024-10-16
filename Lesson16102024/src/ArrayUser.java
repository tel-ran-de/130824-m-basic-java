import java.util.Random;

public class ArrayUser {
    public static void main(String[] args) {
        int sum = 0;
        int idx = 0;
        int[] arr = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-10, 31);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                idx = i;
                break;
            }
        }

        for (int i = idx + 1; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
