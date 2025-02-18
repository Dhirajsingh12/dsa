
public class swap {

    public static void main(String[] args) {
        // Myfunc mf = new Myfunc();
        int num1 = 10;
        int num2 = 20;
        calculator(num1, num2);
        System.out.println(num1 + "," + num2);
    }

    static void calculator(int val1, int val2) {
        int temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1 + "," + val2);
    }
}
