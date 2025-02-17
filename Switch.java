
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to print the week name");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("sunday");

                break;
            case 2:
                System.out.println("monday");

                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesdsy");
                break;
            case 5:
                System.out.println("thurseday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("wrong number");
        }
    }
}
