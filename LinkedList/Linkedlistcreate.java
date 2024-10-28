package LinkedList;

import java.util.Scanner;

public class Linkedlistcreate {

    public static Node<Integer> createLinkedList(Node<Integer>head){
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        if(head==null){
            head = n1;
        }else{
            Node<Integer>temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        return head;
    }
    public static void printLlist(Node<Integer>head){
        Node<Integer>temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // finction to calculate the length of list
    public static void length(Node<Integer>head){
        int len = 0;
        Node<Integer>temp = head;
        while (temp!=null) {
            len++;
            temp = temp.next;
        }
        System.out.println(len);
    }
    // function to increment data of each node
    public static void incrementNode(Node<Integer>head){
        Node<Integer>temp = head;
        while (temp!=null) {
            temp.data++;
            temp = temp.next;
        }
    }
    // functio to print the ith element of linked list
    public static void getIthNode(Node<Integer>head , int i){
        Node<Integer>temp = head;
        int count = 0;
        if(i<=0){
            System.out.println("invalid value of i");
            return;
        }
        while (count<i-1 && temp.next !=null) {
             count++;
             temp = temp.next;
        }
        if(temp.next == null && count<i-1){
            System.out.println("index out of bound");
            return;
        }
        System.out.println(temp.data);
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
    public static void main(String[] args) {
        // Node<Integer> newNode = new Node<Integer>(11);
        // Node <Integer> head = createLinkedList(newNode);
        // printLlist(head);
        // // length(head);
        // // incrementNode(head);
        // // printLlist(head);
        // getIthNode(head,5);
        Node<Integer>head = createLlist();
        printLlist(head);
    }
}
