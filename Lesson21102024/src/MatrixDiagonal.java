import java.util.Random;

public class MatrixDiagonal {
    public static void main(String[] args) {
        Random random = new Random();
        int sumMain = 0;
        int sumAdd = 0;
        int[][] matrix1 = new int[5][5];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(21);
                System.out.print(matrix1[i][j] + "\t");
                if (i == j ) {
                    sumMain += matrix1[i][j];
                }
                if ((i == matrix1.length - 1 - j && j == matrix1.length - 1 - i)) {
                    sumAdd += matrix1[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum main = " + sumMain);
        System.out.println("Sum additional = " + sumAdd);
    }
}
