import java.util.Random;

public class MatrixPos {
    public static void main(String[] args) {
        Random random = new Random();
        int sumPos = 0;
        int sumNeg = 0;
        int sumZero = 0;
        int[][] matrix1 = new int[5][5];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(-5, 6);
                System.out.print(matrix1[i][j] + "\t");
                if (matrix1[i][j] > 0) {
                    sumPos ++;
                } else if (matrix1[i][j] < 0) {
                    sumNeg ++;
                } else {
                    sumZero ++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum pos = " + sumPos);
        System.out.println("Sum neg = " + sumNeg);
        System.out.println("Sum zero = " + sumZero);
    }
}
