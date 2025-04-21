
import java.util.Scanner;

public class problem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 2;
        int cols = 3;

        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements for a 2x3 array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
