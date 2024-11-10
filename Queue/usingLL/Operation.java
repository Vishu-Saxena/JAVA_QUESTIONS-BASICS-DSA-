package Queue.usingLL;

public class Operation {
    public static void main(String[] args) {
        Queue<Integer>q1 = new Queue<Integer>();
        try {
            
            System.out.println("size : " + q1.size());
            System.out.println("front : " + q1.front());
            
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        try {
            System.out.println("front : " + q1.front());
            System.out.println("rear : " + q1.dequeue());
            System.out.println("rear : " + q1.dequeue());
            System.out.println("front " + q1.front());
            System.out.println("rear : " + q1.dequeue());
            System.out.println("rear : " + q1.dequeue());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
