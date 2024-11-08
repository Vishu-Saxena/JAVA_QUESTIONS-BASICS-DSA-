package CicularLinkedLIst;
import java.util.Scanner;

public class Operations {
    // function to create a circular linked list
    public static Node<Integer> createClist(){
        Scanner sc = new Scanner(System.in);
        Node<Integer>tail = null;
        Node<Integer>head = null;
        int n = sc.nextInt();
        while (n>-1) {
            if(tail == null){
                tail = new Node<Integer>(n);
                head = tail;
            }else{
                tail.next = new Node<Integer>(n);
                tail = tail.next;
                tail.next = head;
            }
            n = sc.nextInt();
        }
        return tail;
    }

    // function to delete given node
    public static Node<Integer> delete(Node<Integer>tail , int pos){
        Node<Integer>head = tail.next;
        // deleting first node
        if(pos == 0){
            tail.next = head.next;
        }
        Node<Integer>temp = head;
        pos--;
        while (pos>0 && temp !=tail) {
            temp = temp.next;
            pos--;
        }
        if(pos>0){
            System.out.println("Index out of bound");
            return tail;
        }
        // deleting tail
        if(pos == 0 && temp.next == tail){
            temp.next = tail.next;
            return temp;
        }

        temp.next = temp.next.next;
        return tail;
    }

    // function to insert a node at given index
    public static Node<Integer> insert(int data , int pos , Node<Integer>tail){
        Node<Integer>n = new Node<Integer>(data);
        // case 1 adding element to head
        if(pos == 0){
            n.next = tail.next.next;
            tail.next = n;
            return tail;
        }
        // look for index we have to add the given node
        Node<Integer>temp = tail.next;
        while (pos>1 && temp.next !=tail) {
            temp = temp.next;
            pos--;
        }
        // check index out of bound
        if(pos>1){
            System.out.println("Index out of bound");
            return tail;
        }
        if(pos == 1 ){
            n.next = temp.next;
            temp.next = n;
        }
        
        
        return tail;
    }

    // function to calcualte lenght of cir list
    public static int lenght(Node<Integer>tail){
        if(tail == null){
            return 0;
        }
        Node<Integer>head = tail.next;
        int len = 1;
        while (head != tail) {
            len++;
            head = head.next;
        }
        return len;
    }

    // function to print to list
    public static void printCl(Node<Integer>tail){
        Node<Integer> head = tail.next;
        while (head != tail) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print(tail.data + "->" + tail.next.data);
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer>tail = createClist();
        printCl(tail);
        // Node<Integer>tail2 = delete(tail, 3);
        // System.out.println();
        // printCl(tail2);
        Node<Integer>tail3v = insert(6, 4, tail);
        printCl(tail3v);
        System.out.println(lenght(tail3v));
    }
}
