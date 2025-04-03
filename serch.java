
public class serch {

    void sercharr() {
        int arr[] = {4, 6, 2, 7};
        int x = 2;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;

            }

        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        serch obj = new serch();
        obj.sercharr();
    }
}
