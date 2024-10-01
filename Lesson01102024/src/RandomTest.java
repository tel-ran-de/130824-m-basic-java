import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
//        create variable with type - Random and name - rand
        Random rand = new Random();
//        int randNum1 = rand.nextInt(); // number from -2**31 to 2**31 - 1 (int size)
//        int randNum2 = rand.nextInt(10); // from 0 to bound - 1 (10 - 1 = 9)
//        int randNum3 = rand.nextInt(10, 100); // from origin(10) to bound - 1 (100 - 1 = 99)
//
//        System.out.println("randNum1 = " + randNum1);
//        System.out.println("randNum2 = " + randNum2);
//        System.out.println("randNum3 = " + randNum3);


//        double doubleNum1 = rand.nextDouble();
//        double doubleNum2 = rand.nextDouble(10);
//        double doubleNum3 = rand.nextDouble(10, 50);
//        System.out.println("doubleNum1 = " + doubleNum1); // from 0 to 1
//        System.out.println("doubleNum2 = " + doubleNum2); // from 0 to 10 - 1
//        System.out.println("doubleNum3 = " + doubleNum3); // from 10 to 50 - 1

//       call method random() from Math class
        double num = Math.random(); // double from 0 to 1
        System.out.println("num = " + num);

//        Math.random()*(max-min+1)+min
//        Math.random() => from 0 to 1
//        max-min+1 => 50 - 10 + 1 = 41
//        Math.random()*(max-min+1) => from 0 to 41 - 1 = 40 double
//        Math.random()*(max-min+1)+min => from 10 to 51(51 - 1 = 50)
        int minVal = 10;
        int maxVal = 50;
        int randValue = (int)(Math.random() * (maxVal - minVal + 1) + minVal);
        System.out.println("randValue = " + randValue);
    }
}
