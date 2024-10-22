import java.util.Scanner;

public class PracticeAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int sum = 0;
        int cnt = 0;

        String[] arr = str.split(" ");
        for(String word : arr) {
            sum += word.length();
            cnt ++;
        }

        System.out.println("Avg length = " + (double)sum/cnt);
    }
}
