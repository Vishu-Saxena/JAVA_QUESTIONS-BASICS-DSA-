package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Collection {
    public static void main(String[] args) {
        // collection framework offer queue
        // but the queue is an interface not a class so to use queue we have to create an instance of a class that implements queue interface
        Queue<Integer>queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.offer(3));
        System.out.println(queue.element());
    }
}
