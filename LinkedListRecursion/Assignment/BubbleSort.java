package LinkedListRecursion.Assignment;

import java.util.Scanner;

import LinkedList.Node;

public class BubbleSort {
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

    private static int length(Node<Integer>hNode){
        Node<Integer>temp = hNode;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        return len;
    }

    // bubble sort function
    public static Node<Integer> bubbleSort(Node<Integer>head){
       
        int n = length(head);
        for(int i = 0 ; i< n-1; i++){
            Node<Integer>current = head;
            Node<Integer>prev = null;
    
            for (int j = 0; j <( n-1-i); j++) {
                if((int)current.data > (int)current.next.data){
                    if(prev == null){//swpping needs to be done with head node
                        Node<Integer>forward = current.next;
                        current.next = forward.next;
                        forward.next = current;
                        head = forward;
                        prev = forward;
                    }else{
                        // swap
                        Node<Integer>forward = current.next;
                        current.next = forward.next;
                        forward.next = current;
                        prev.next = forward;
                        prev = forward;
                    }
                }else{
                    prev = current;
            
                    current = current.next ;
                }

               
            }
        }

        return head;
        
    }
    public static void main(String[] args) {
        Node<Integer>head= createLlist();
        printLlist(head);
        printLlist(bubbleSort(head));
    }
}
