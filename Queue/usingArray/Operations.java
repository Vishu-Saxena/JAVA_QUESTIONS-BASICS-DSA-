package Queue.usingArray;

public class Operations {
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        System.out.println(q1.isEmpty());
        System.out.println(q1.front());
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueueDynamic(7);
        q1.enqueue(6);

        while (!q1.isEmpty()) {
            System.out.println(q1.dequeue());
        }
       

        // circular queue
        // CircularQueue c1 = new CircularQueue(5);
        // c1.enqueue(1);
        // c1.enqueue(2);
        // c1.enqueue(3);
        // System.out.println(c1.dequeue());
        // c1.enqueue(4);
        // c1.enqueue(5);
        // System.out.println(c1.front());
        // System.out.println(c1.dequeue());
    }
}
