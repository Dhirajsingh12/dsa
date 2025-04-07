
public class maxm {

    void max() {
        int arr[] = {9, 7, 65, 2};
        int ans = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];

            }

        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        max obj = new max();
        obj.max();
    }
}
