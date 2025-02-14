
import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the frist number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        System.out.println("enter the thred number");

        int c = in.nextInt();

        if (a > b & a > c) {
            System.out.println("the number is largest" + a);
        } else if (b > a & b > c) {
            System.out.println("the number is largest" + b);
        } else {
            System.out.println("the largest number is" + c);
        }
    }
}
