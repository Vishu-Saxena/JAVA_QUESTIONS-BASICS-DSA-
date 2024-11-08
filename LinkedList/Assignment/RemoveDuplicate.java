package LinkedList.Assignment;

import java.util.Scanner;

import LinkedList.Node;

public class RemoveDuplicate {
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

    private static Node<Integer> removeDuplictes(Node<Integer>head){
       
        Node<Integer>temp = head;
        while (temp != null && temp.next != null ) {
            if(temp.data == temp.next.data){
                Node<Integer>nxtDiff = temp.next;
                while (nxtDiff!=null && nxtDiff.data == temp.data) {
                    nxtDiff = nxtDiff.next;
                }
                temp.next = nxtDiff;
                temp = nxtDiff;

            }else{
                temp = temp.next;
            }
           
        }

        return head;

    }

    private static void printReverse(Node<Integer>head){
        if(head == null){
           
            return;
        }
        int current = head.data;
        printReverse(head.next);
        System.out.print(current + " ");
    }
    public static void main(String[] args) {
        Node<Integer>head = createLlist();
        printLlist(head);
        // removeDuplictes(head);
        // printLlist(head);
        printReverse(head);
    }
}
