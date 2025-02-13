
import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        System.out.println("yor age is" + age);
        if (age >= 18) {
            System.out.println("you are elegibal for voting");
        } else {
            System.out.println("you are not elegibal for voting");
        }
    }
}
