package LinkedListRecursion;
import java.util.Scanner;

import LinkedList.Node;

public class MergeSort extends Operations {
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
    // mersort funtion to sort the linked list
    public static Node<Integer> mergeSort(Node<Integer>heaNode){
        if(heaNode == null || heaNode.next == null){
            return heaNode;
        }
        // else find the mid point of Llist
        Node<Integer> mid = midpointBetter(heaNode);
        Node<Integer> nextHead1 = mid.next;
        mid.next= null;
        Node<Integer>h1 = mergeSort(heaNode);
        Node<Integer>h2 = mergeSort(nextHead1);
        // now merge the two arrays
        return merge(h1, h2);
    }

    public static void main(String[] args) {
        Node<Integer> head = createLlist();
        printLL(head);
        Node<Integer> nehead = mergeSort(head);
        printLL(nehead);
    }
}
