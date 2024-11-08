package LinkedListRecursion.Assignment;

import java.util.Scanner;

import LinkedList.Node;

public class SwapTwoNodes {

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


    private static Node<Integer> swapTwoNodes(Node<Integer>head , int n1 , int n2){ // n1 <= n2

        // case 1 if head node is getting changed;
        if(n1 == 1 && n2 != 2){
            Node<Integer>c1 = head;
            Node<Integer>temp = head;
            Node<Integer>forward = head.next;
            while (n2 > 2) {
                temp = temp.next;
                n2--;
            }
            Node<Integer>p2 = temp;
            Node<Integer>c2 = temp.next;

            // swap the nodes
            p2.next = c1;
            c1.next = c2.next;
            c2.next = forward;
            return c2;
        }

        // head node and it's adjacent node is getting swapped
        if(n1 == 1 && n2 == 2){
            Node<Integer>c1 = head;
            Node<Integer>c2 = head.next;
            c1.next = c2.next;
            c2.next = c1;
            return c2;

        }

        // traverse to the n1th node and n2nd node
        Node<Integer>temp = head;
        while (n1 > 2 && n2>2) {
            temp = temp.next;
            n1--;
            n2--;
        }
        Node<Integer>p1 = temp;
        Node<Integer>c1 = temp.next;
        while (n2 > 2) {
            temp = temp.next;
            n2--;
        }
        Node<Integer>p2 = temp;
        Node<Integer>c2 = temp.next;

        // now swap the nodes wisely
        p1.next = c2;
        p2.next = c1;
        Node<Integer>forward = c1.next;
        c1.next = c2.next;
        c2.next = forward;

        return head;  
    }

    public static void main(String[] args) {
        Node<Integer>head = createLlist();
        printLlist(head);
        printLlist(swapTwoNodes(head, 3, 4));
    }
}
