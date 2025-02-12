
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your frist number");
        int a = input.nextInt();
        System.out.println("enter your second number");
        int b = input.nextInt();
        int c = a / b;
        System.out.println("your multiplication" + c);
    }
}
