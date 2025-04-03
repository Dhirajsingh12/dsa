
public class max {

    void max() {
        int arr[] = {28, 5, 3, 2, 7, 8};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }

        }
        System.err.println("max=" + ans);

    }

    public static void main(String[] args) {
        max obj = new max();
        obj.max();
    }
}
