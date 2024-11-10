package Queue.usingArray;

public class CircularQueue {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    // size()
    public int size(){
        return this.size;
    }
    // isEmpty()
    public boolean isEmpty(){
        if(size() ==  0)return true;
        return false;
    }

    // front()
    public int front(){
        if(!isEmpty())return data[front];
        return -1;   
    }

    // enque()
    public void enqueue(int ele){
        if(isEmpty()){
            data[++front] = ele;
            rear++;
            size++;
        }else{
            if(size == data.length){
                System.out.println("Stack is full");
                return ;
            }
            rear = (rear+1)%data.length;
            data[rear] = ele;
            this.size++;
        }
    }

    // dequeue()
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else if(rear == front()){
            int ele = data[front];
            front = -1;
            rear = -1;
            size--;
            return ele;
        }
        else{
            int ele = data[front];
            front = (front+1 )% data.length;
            size--;
            return ele;
        }
    }
}
