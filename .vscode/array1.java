
public class array1 {

    void arraydemo() {
        int age[] = new int[3];
        int weight[] = new int[4];
        String name[] = new String[3];
        name[0] = "dhiraj";
        name[1] = "amit";
        name[2] = "shubham";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        weight[0] = 10;
        weight[1] = 110;
        weight[2] = 1011;
        weight[3] = 101;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        System.out.println(weight[3]);
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
