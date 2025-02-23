
public class Large {

    public static void main(String[] args) {
        int[] arr = {8, 9, 5, 3};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];

            }

        }
        System.out.println(ans);
    }
}
