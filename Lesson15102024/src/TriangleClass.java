public class TriangleClass {
    public static void main(String[] args) {
        int height = 8;
        int a = 0;
        int b = height - 1;
        int c = height + 1;
//
//        for (int y = 0; y <= height; y++) {
//            for (int x = 0; x <= height * 2; x++) {
//                if (y == a && x > b && x < c) {
//                    System.out.print("*");
//
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            a++;
//            b--;
//            c++;
//            System.out.println();
//        }


        a = 0;
        b = height;
        c = height;
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height * 2; j++) {
                if (i == a && j == b || i == a && j == c || i == height
                        && j <= height * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.print("\n");
        }
    }
}
