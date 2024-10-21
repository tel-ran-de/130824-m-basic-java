import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(matrix[2][2]);
// 1 2 3
// 4 5 6
// 7 8 9
        Random random = new Random();
        int[][] matrix1 = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(51);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] matrix3d = {{1, 2}, {4, 5, 6, 6}, {1}};
        for (int i = 0; i < matrix3d.length; i++) {
            System.out.println(Arrays.toString(matrix3d[i]));
        }
    }
}
