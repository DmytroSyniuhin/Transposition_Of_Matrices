import java.util.Scanner;

public class TranspositionOfMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір M:");
        int scanSizeM = scanner.nextInt();

        System.out.println("Введіть розмір N:");
        int scanSizeN = scanner.nextInt();
        System.out.println("_____________________");


        int[][] matrix1 = new int[scanSizeM][scanSizeN];
        int[][] matrix2 = new int[scanSizeN][scanSizeM];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
                matrix2[j][i] = matrix1[i][j];
            }
        }
        System.out.println("Матриця розміром M×N:");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Матриця розміром N×M:");
        for (int j = 0; j < matrix2.length; j++) {
            for (int i = 0; i < matrix2[j].length; i++) {
                System.out.print(matrix2[j][i] + ", ");
            }
            System.out.println();
        }
    }
}
