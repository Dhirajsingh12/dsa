
import java.util.Arrays;
import java.util.Scanner;

public class KthMaxMin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = scan.nextInt();

        if (k > 0 && k <= n) {
            Arrays.sort(arr);

            int kthMin = arr[k - 1];
            int kthMax = arr[n - k];

            System.out.println("Kth Minimum element: " + kthMin);
            System.out.println("Kth Maximum element: " + kthMax);
        } else {
            System.out.println("Invalid value of K.");
        }

        scan.close();
    }
}
