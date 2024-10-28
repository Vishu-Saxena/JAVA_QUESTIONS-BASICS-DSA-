package LinkedList;

public class Node<T> {
    public T data;
    public Node next;
    public Node(T data){
        this.data = data;
        this.next = null;//this step is not mandatory as java by default store vlaue for non-initialised objects instances
    }
}
