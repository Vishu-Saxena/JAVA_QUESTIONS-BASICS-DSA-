package Queue.usingLL;

import LinkedList.Node;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    // size()
    public int size(){
        return this.size;
    }

    // isEmpty()
    public boolean isEmpty(){
        if(size == 0)return true;
        return false;
    }

    // front()
    public T front()throws NullPointerException{
        if(isEmpty()) {
            throw new NullPointerException("Queue is empty");
        }
        return front.data;
    }

    // enqueue()
    public void enqueue(T ele){
        Node<T>temp = new Node<>(ele);
        //check if queue is empty
        if(size() == 0){
            front = temp;
            rear = front;
            size++;
        }else{
            rear.next= temp;
            rear = temp;
            size++;
        }
    }

    // dequeue()
    public T dequeue(){
        // check if queue is empty
        if(size() == 0){
            System.out.println("Stack is empty");
            return front();
        }else if(front == rear){//incase only one element left in queue
            T ele = front();
            front = null;
            rear = null;
            size--;
            return ele;
        }
        T ele = front();
        front = front.next;
        size--;
        return ele;
    }
}
