
public class Asum {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 9, 6, 87, 999999999};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
