import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Enter a char");
        char ch = sc.next().charAt(0);

        int count = 0;
        StringBuilder idxSb = new StringBuilder();

        char[] symbols = str.toCharArray();
        for(int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ch) {
                count++;
                idxSb.append(i);
                idxSb.append(" ");
            }
        }
        System.out.println(ch + " in " + str + " = " + count);
        System.out.println("Indexes: " + idxSb);
    }
}
