
import java.util.Scanner;

public class Forloop1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = input.nextInt();
        System.out.println("your number is" + n);
        for (int num = 1; num <= n; num++) {
            System.out.println(num);

        }

    }
}
