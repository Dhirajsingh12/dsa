
import java.util.Scanner;

public class Upper {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter teh later");
        char later = in.next().trim().charAt(0);
        if (later >= 'a' && later <= 'z') {
            System.out.println("later is lower case:-" + later);

        } else {
            System.out.println("upper case:-" + later);
        }

    }
}
