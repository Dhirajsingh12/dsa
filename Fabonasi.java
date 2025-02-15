
import java.util.Scanner;

public class Fabonasi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the term how to find the fabonasi seris:-");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println("your term is " + b);

    }
}
