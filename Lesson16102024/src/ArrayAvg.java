import java.util.Random;

public class ArrayAvg {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 0;
        int[] arr = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-20, 20);
            System.out.print(arr[i] + " ");
            if (arr[i] > 0) {
                sum += arr[i];
                cnt++;
            }
        }
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Cnt = " + cnt);
        System.out.println("Avg = " + (double)sum/cnt);
    }
}
