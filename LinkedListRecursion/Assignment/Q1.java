package LinkedListRecursion.Assignment;

import java.util.Scanner;

import LinkedList.Node;

public class Q1 {
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

    // find a node in LL
    private static int find(Node<Integer>heaNode , int indx , int data){
        if(heaNode == null){
            return -1;
        }
        if(heaNode.data == data){
            return indx;
        }
        return find(heaNode.next, indx+1, data);
    }


    public static void main(String[] args) {
        Node<Integer>head = createLlist();
        System.out.println(find(head, 0, 3));
    }
}
