
import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("your given array=");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }

    }
}
