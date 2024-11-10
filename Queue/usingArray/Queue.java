package Queue.usingArray;

public class Queue {
    private int[]data;
    private int front;
    private int rear;
    private int size;

    // constructor
    public Queue(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // front()
    public int front(){
        if(front == -1){
            return -1;
        }
        return data[front];
    }

    // equeue()
    public void enqueue(int ele){
        // check if queue is empty
        if(front == -1 && rear == -1){
            data[++front] = ele;
            this.size++;
            rear++;
        }else if(rear == data.length-1){// check if queue is full;
            System.out.println("Queue is full");
            
            return;
        }else{
            data[++rear] = ele;
            this.size++;
        }
    }
    // dequeue()
    public int dequeue(){
        // check if queue is empty
        if(front == -1 && rear == -1){
            System.out.println("Queue is emoty");
            return -1;
        }else if(front == rear){//removing the last elelment of queue
            
            int ele = data[rear];
            rear = -1;
            front = -1;
            this.size--;
            return ele;
        }else{
            this.size--;
            return data[rear--];
            
        }
    }

    // size()
    public int size(){
        return this.size;
    }

    // isEmpty()

    public boolean isEmpty(){
        if(this.size == 0)return true;
        return false;
    }

    // making queue dynamic
    // enqueue() incase the stack got full increase it's size by 2time of it currnt size
    public void enqueueDynamic(int ele){
        if(isEmpty()){
           
            data[++front] = ele;
            this.size++;
            rear++;
            
        }else if(size == data.length){
            int[]prevData = data;
            data = new int[size*2];
            for (int i = 0 ; i<size ; i++) {
                data[i] = prevData[i];
            }
            // now add the new element 
            data[++rear] = ele;
            this.size++;
        }else{
            data[++rear] = ele;
            this.size++;
        }
    }
}

