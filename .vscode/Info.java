
public class Student {

    String name;
    int age;
    int rollnumber;

    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student rollnumber: " + rollnumber);
    }
}

public class Info {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 20;
        s1.name = "Amit";
        s1.rollnumber = 9012;
        s1.display();
    }
}
