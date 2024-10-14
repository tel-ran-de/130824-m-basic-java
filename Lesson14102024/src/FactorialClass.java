public class FactorialClass {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Factorial " + num + " = " + getFactorial(num));
    }

    public static int getFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}
