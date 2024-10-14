public class FibonacciClass {
    public static void main(String[] args) {
        getFibonacci(15);
    }

    public static void getFibonacci(int num) {
        int num0 = 1;
        int num1 = 1;
        int num2;
        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i <= num; i++) {
            num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
        System.out.println();
    }
}
