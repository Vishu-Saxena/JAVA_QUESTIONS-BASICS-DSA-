package stack.usingLL;

import LinkedList.Node;
import stack.usingArray.StackEmpty;

public class Stack<T> {
    private Node<T> head;
    private int size;

    public Stack(){
        head = null;
        size = 0;
    }

    // size()
    public int size(){
        return this.size;
    }

    // empty()
    public boolean isEmpty(){
        return size == 0;
    }

    // push() 
    public Node<T> push(T data){
        
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
        return head;
    }


    // pop() 
    public T pop() throws StackEmpty{
        if(size == 0){
           throw new StackEmpty();
        }
        T val = head.data;
        head = head.next;
        size--;
        return val;
    }

 
    // top()without head
    public T top() throws StackEmpty{
        if(size == 0){
            throw new StackEmpty();
        }
        return head.data;
    }


}
