
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter frist number");
        int a = input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("sum of two number:-" + c);

    }
}
