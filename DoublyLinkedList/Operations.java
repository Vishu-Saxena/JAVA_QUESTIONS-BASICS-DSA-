package DoublyLinkedList;

import java.util.Scanner;

public class Operations {

    // function to create a list
    private static Node createList(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n = sc.nextInt();
        while (n != -1) {
            Node curNode = new Node(n);
            if(head == null){
                head = curNode;
            }else{
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                curNode.prev = temp;
                temp.next = curNode;
            }
            n = sc.nextInt();
        }
        return head;
    }

    // optimised way to create a list
    private static Node creatLIst2(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        int n = sc.nextInt();
        while (n != -1) {
            Node curNode = new Node(n);
            if(head == null){
                head = curNode;
                tail = head;
            }else{
                curNode.prev = tail;
                tail.next = curNode;
                tail = curNode;
            }
            n = sc.nextInt();
        }
        return head;
    }

    // function to insert an element at given position in a list
    private static Node insert(int pos , int data , Node head){
        // check if leist is empty
        if(head == null){
            System.out.println("list is empty");
            return head;
        }
        // adding element to head of list
        if(pos == 0){
            Node cNode = new Node(data);
            cNode.next = head;
            return cNode;
            
        }
        // insert the element at given index
        Node temp = head;
        while (pos > 0 && temp.next != null) {

            pos--;
            temp = temp.next;
            
        }
        if(pos > 0 ){
            System.out.println("Index out bound");
            return head;
        }
        Node curNode = new Node(data);
        curNode.next = temp;
        curNode.prev = temp.prev;
        temp.prev.next = curNode;
        temp.prev = curNode;

        return head; 
    }

    // deleting a node
    private static Node delete(Node head , int pos){
        // deleting heaad
        if(pos == 0){
            if(head.next == null){
                return null;
            }
            head.next.prev = null;
            return head.next;
        }
        // deleting given index
        Node temp = head;
        while (pos > 0 && temp.next != null) {
            pos--;
            temp = temp.next;
        }
        if(pos > 0){
            System.out.println("Index out of bound");
            return head;
        }
        if(pos == 0 && temp.next == null){
            // deleting tail
            temp.prev.next = null;
            return head;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        return head;
    }

    // function to print list
    private static void printLIst(Node head){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "<->");
            temp =temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
    public static void main(String[] args) {
        
        Node head = creatLIst2();
        printLIst(head);

        // Node heaNode = insert(1, 0, head);
        // printLIst(heaNode);

        Node newHead = delete(head, 2);
        printLIst(newHead);

    }
}
