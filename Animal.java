// File: Main.java

class Animal1 {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal1 {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal1 {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class Animal {

    public static void main(String[] args) {
        Animal1 a; // Reference of superclass

        a = new Dog(); // Object of Dog
        a.sound();     // Calls Dog's sound()

        a = new Cat(); // Object of Cat
        a.sound();     // Calls Cat's sound()
    }
}
