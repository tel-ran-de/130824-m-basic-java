import java.util.Random;

public class NumbersClass {
    public static void main(String[] args) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int num;
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
             num = rand.nextInt(-100, 101);
            System.out.print(num + " ");
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println();
        System.out.printf("pos = %d, neg = %d, zero = %d", pos, neg, zero);
    }
}
