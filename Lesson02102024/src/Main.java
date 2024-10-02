import java.util.Random;

public class Main {
    public static void main (String[] args)  {
        findEvenOdd(2);
//        findEvenOdd(4);
//        findEvenOdd(5);
        Random rand = new Random();
        int num = rand.nextInt(2, 11);
        System.out.println(num);
    }

    public static void findEvenOdd(int num)  {
        if (num % 2 == 0) {
            System.out.println(num+" is even"); }
        else  {
            System.out.println(num+" is odd");  }
    }


//    ====================================
//    1 return value - void, input - empty
    public static void print() {
        System.out.println("Test");
    }

//    2 return value - void, input - int
    public static void print(int num) {
        System.out.println("Test" + num);
    }


//    3 return value - int, input - empty
    public static int getNum() {
        return 10;
    }

//    4 return value - int, input - int
    public static int getNum(int num) {
        return num;
    }


}