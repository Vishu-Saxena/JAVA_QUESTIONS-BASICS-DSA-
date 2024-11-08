package LinkedList.Assignment;

import LinkedList.Node;

public class AppendNLastNode {

    private static int length(Node<Integer>head){
        Node<Integer>temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        System.out.println(len);
        return len;
    }

    private static Node<Integer> appendNnode(Node<Integer>head , int n ){
        if(head == null || head.next == null)return head;
        int count = length(head)-n;
        Node<Integer>newTail = head;
        Node<Integer>newHead;

        // traversing to the point from wheree the list is going to break
        while (count > 1) {
            newTail = newTail.next;
            count--;
        }

        newHead = newTail.next;
        newTail.next = null;

        Node<Integer>temp = newHead;
        // traverse to the end of list whose head is newHead
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.next = head;

        return newHead;

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

    public static void main(String[] args) {
        Node<Integer>head = new Node<Integer>(1);
        Node<Integer>n2 = new Node<Integer>(2);
        Node<Integer>n3 = new Node<Integer>(3);
        Node<Integer>n4 = new Node<Integer>(4);
        Node<Integer>n5 = new Node<Integer>(5);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        printLlist(head);

        Node<Integer>newHEad = appendNnode(n3, 2);
        printLlist(newHEad);

    }
}
