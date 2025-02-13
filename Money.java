
import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your monthely income");
        int income = input.nextInt();
        System.out.println("your monthely income is" + income);
        if (income > 10000) {
            int c = income + 2000;

            System.out.println("your increase incone is" + c);

        } else if (income < 10000) {
            int d = income + 1000;
            System.out.println("your increase income is" + d);
        } else {
            System.err.println("no increase your income");
        }

    }
}
