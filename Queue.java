
import java.util.*;

public class Queue {

    static void queuelist() {
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q);
    }

    public static void main(String[] args) {
        queuelist();
    }
}
