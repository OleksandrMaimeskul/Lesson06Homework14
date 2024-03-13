import java.util.Random;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter digit for M :");
        int m = scanner.nextInt();
        System.out.println("Please enter digit for N :");
        int n = scanner.nextInt();

        int[][] arrayMN = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrayMN [i][j] = random.nextInt(10);
            }
        }
        System.out.println("Initial Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayMN[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arrayMN[j][i] + ",");
            }
            System.out.println();
        }

    }

}
