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
        if(pos == 0 && temp.next == tail){
            temp.next = tail.next;
            return temp;
        }

        temp.next = temp.next.next;
        return tail;
    }

    // function to print to list
    public static void printCl(Node<Integer>tail){
        Node<Integer> head = tail.next;
        while (head != tail) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print(tail.data + "->" + tail.next.data);
    }
    public static void main(String[] args) {
        Node<Integer>tail = createClist();
        printCl(tail);
        Node<Integer>tail2 = delete(tail, 3);
        System.out.println();
        printCl(tail2);
    }
}
