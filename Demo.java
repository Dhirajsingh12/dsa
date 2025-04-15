
public class Demo {

    void show() {
        System.out.println("in show 1");
    }

    void show(int a) {
        System.out.println("in show 2");
    }

    void show(int a, String b) {
        System.out.println("in show 3");

    }

    void show(String a, int b) {
        System.out.println("in show 4");

    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show("ram", 10);
        obj.show(20, "sita");
        obj.show();
        obj.show(10);
    }
}
