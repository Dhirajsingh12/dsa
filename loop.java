
import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            n = n + i;
            System.out.println(n);

        }
    }
}
