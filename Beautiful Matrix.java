import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int rowWithOne = -1;
        int colWithOne = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    rowWithOne = i;
                    colWithOne = j;
                    break;
                }
            }
            if (rowWithOne != -1) {
                break;
            }
        }

        int rowMoves = Math.abs(rowWithOne - 2);
        int colMoves = Math.abs(colWithOne - 2);
        int totalMoves = rowMoves + colMoves;

        System.out.println("\n"+totalMoves);

    }
}
