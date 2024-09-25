//import java.util.Scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Enter a string:");
//        String userInput = inputData.next();
//        System.out.println("The first word - " + userInput);
//        System.out.println("---------------------------------");
//        String inputLine = inputData.nextLine();
//        System.out.println("Input line - " + inputLine);
//        int userNumber = inputData.nextInt();
//        System.out.println("The integer - " + userNumber);
        double userDouble = inputData.nextDouble();
        System.out.println(userDouble);

    }
}
