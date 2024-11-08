package LinkedListRecursion.Assignment;

import java.util.Scanner;

import LinkedList.Node;

public class DeleteEveryNnodes {

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

    // deleting every n node and keeping every m nodes
    private static Node<Integer> deletingEvryNnode(Node<Integer>head , int m , int n){
        Node<Integer>temp1 = head;
        Node<Integer>temp2 = head;
        int tempM = m;
        int tempN = n;

        while (temp1 != null && temp2 !=null) {
            while ( temp1 !=null && tempM > 1) {
                temp1 = temp1.next;
                tempM--;
            }
            if(temp1 == null){
                return head;
            }
            temp2 = temp1.next;
            tempM = m;
    
            while(temp2 != null && tempN > 1){
                temp2 = temp2.next;
                tempN--;
            }

            tempN = n;
    
            temp1.next = temp2 != null ? temp2.next : temp2;
            temp1 = temp1.next;
        }

        if(temp1 != null){
            temp1.next = null;
        }
        return head;
        
    }

    public static void main(String[] args) {
        Node<Integer> head = createLlist();
        printLlist(head);
        printLlist(deletingEvryNnode(head, 1 ,1 ));
    }
}
