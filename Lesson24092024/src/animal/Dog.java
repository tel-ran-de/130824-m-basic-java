package animal;

public class Dog {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Java");

        byte num1 = 10; //-> (Byte) num1; -> (byte)num1
//        Byte byteObj;

        short shortPr; // -> (Short) shortObj;
        long num2 = 11_000_000_000L; //Long
        Long num21 = 11_000_000_000L; //Long
        double dbl = 3.1415; // Double
        float flt = 3.1415F; //Float
        num1 = 10;
        int numInt = 10; // -> int -> Integer -> int

        char ch = 'q';
        String str = "12343";

        boolean flag = false;

        long res = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + res);
        System.out.printf("%d + %d = %d", num1, num2, res);

        int i = 0;
        System.out.println(i);
    }
}
