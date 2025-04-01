
public class array1 {

    void arraydemo() {
        int age[] = new int[3];
        age[0] = 12;
        age[1] = 23;
        age[2] = 34;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
    }

    public static void main(String[] args) {
        array1 obj = new array1();
        obj.arraydemo();
    }
}
