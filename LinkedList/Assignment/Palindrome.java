package LinkedList.Assignment;

import java.util.Scanner;

import LinkedList.Node;

public class Palindrome {

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

    // find the mid point of a linked lis
    private static Node<Integer> midPoint(Node<Integer>head){
        if(head == null|| head.next == null){
            return head;
        }

        Node<Integer>slow = head;
        Node<Integer>fast = head;
        while ( fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // to reverse a linked list
    private static Node<Integer> reverse(Node<Integer>head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer>reversedpHead =  reverse(head.next);
        Node<Integer>tail = reversedpHead;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;
        head.next = null;
        return reversedpHead;

    }

    // palindrome()
    private static boolean palindrome(Node<Integer>head){
        // step one divide the list from between(midpoint)

        Node<Integer>midHead = midPoint(head);
        Node<Integer>secHead = midHead.next;
        midHead.next = null;

        // step two reverse the second half of the list
        Node<Integer>reversedHead = reverse(secHead);

        //compare each node of first half and reversed second half of list
        while (head != null && reversedHead != null ) {
            if(head.data != reversedHead.data)return false;
            head = head.next;
            reversedHead = reversedHead.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node<Integer>head = createLlist();
        printLlist(head);
        System.out.println(palindrome(head));
    }
}
