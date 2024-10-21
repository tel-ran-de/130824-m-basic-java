import java.util.Random;

public class MatrixRowSum {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int[][] matrix1 = new int[5][5];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(21);
                System.out.print(matrix1[i][j] + "\t");
                sum += matrix1[i][j];
            }
            System.out.println();
            System.out.println( i + " row, sum = " + sum);
            sum = 0;
        }
    }
}
