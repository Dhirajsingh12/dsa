
import java.util.Scanner;

public class While1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        System.out.println("your number is" + n);
        n = 1;
        while (n < 5) {
            System.out.println(n);
            n++;

        }
    }
}
