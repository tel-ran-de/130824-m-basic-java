public class TriangleClass {
    public static void main(String[] args) {
        int height = 5;
        int a = 0;
        int b = height - 1;
        int c = height + 1;

        for (int y = 0; y <= height; y++) {
            for (int x = 0; x <= height * 2; x++) {
                if (y == a && x > b && x < c) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.println();
        }
    }
}
