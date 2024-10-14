public class RectangleClass {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int M = 5;
        int N = 8;
        for (int y = 0; y <= M; y++) {
            for (int x = 0; x <= N; x++) {
                if (x == 0 && y <= M || y == 0 && x <= N || y <= M && x == N || y == M && x <= N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
