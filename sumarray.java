
public class sumarray {

    void sum() {
        int arr[] = {1, 3, 24, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        sumarray obj = new sumarray();
        obj.sum();

    }
}
