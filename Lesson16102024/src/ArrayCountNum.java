import java.util.Random;

public class ArrayCountNum {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int[] arr = new int[15];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) {
                continue;
            } else if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(" ");
        System.out.println("Array contains " + even + " even and " + odd + " odd numbers");
    }
}
