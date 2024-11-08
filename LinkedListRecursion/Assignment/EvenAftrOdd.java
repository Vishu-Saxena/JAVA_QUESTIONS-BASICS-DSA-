package LinkedListRecursion.Assignment;

import java.util.Scanner;

import LinkedList.Node;

public class EvenAftrOdd {

    public static void printLlist(Node<Integer>head){
        Node<Integer>temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }


    // creating linked list by inserting element from inputs given by user
    public static Node<Integer> createLlist(){
        Scanner s = new Scanner(System.in);
        Node<Integer>head = null;
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer>curNOde = new Node<Integer>(data);
            if(head == null){
                head = curNOde;
            }else{
                Node<Integer>temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next=curNOde;
            }
            data = s.nextInt();
        }
        return head;
    }
    // Even after odd function
    private static Node<Integer> evenAfterOdd(Node<Integer>head){
        Node<Integer>evenHead = null ;
        Node<Integer>evenTail = null ;
        Node<Integer>oddHead = null ;
        Node<Integer>oddTail = null ;
        while (head != null) {
            if(head.data%2 == 0){
                if(evenHead == null){
                    evenHead = head;
                    evenTail = head;
                }else{
                    evenTail.next = head;
                    evenTail = head;
                }
            }else{
                if(oddHead == null){
                    oddHead = head;
                    oddTail = head;
                }else{
                    oddTail.next = head;
                    oddTail = head;
                }
            }

            head = head.next;
        }

        oddTail.next = evenHead;
        evenTail.next = null;
        return oddHead;

    }
    public static void main(String[] args) {
        Node<Integer>head = createLlist();
        printLlist(head);
        Node<Integer>newHead = evenAfterOdd(head);
        printLlist(newHead);
    }
}
