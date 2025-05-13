
import java.io.*;

class Person {

    int salery = 60000;

}

class Engineer extends Person {

    int bonous = 10000;
}

class Gfg {

    public static void main(String arg[]) {
        Engineer e1 = new Engineer();
        System.out.println("salery" + e1.salery, "bonous" + e1.bonous);

    }
}
