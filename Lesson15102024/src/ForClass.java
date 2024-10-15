public class ForClass {
    public static void main(String[] args) {
        System.out.println("for");
        for(int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.println( i + " * " + j  + " = " + (i * j));
            }
            System.out.println();
        }
        System.out.println("\nwhile");
        int i = 2;
        while (i < 10) {
            int j = 2;
            while (j < 10) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
