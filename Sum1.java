
import java.util.Scanner;

public class Sum1 {

    public static void main(String[] args) {

        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the frist number");
        int num1 = in.nextInt();
        System.out.println("enter the second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of two number" + sum);

    }
}
