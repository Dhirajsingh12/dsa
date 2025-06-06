// File: Main.java

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // First thread
        MyThread t2 = new MyThread(); // Second thread

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start(); // Starts first thread
        t2.start(); // Starts second thread
    }
}
