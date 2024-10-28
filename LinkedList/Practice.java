package LinkedList;

import java.util.Scanner;

import Arrays.sorting.Insertion;

public class Practice {
    // creating linked list
    public static Node<Integer> createList(Node<Integer> head){
        // creating nodes of linked list
        Node<Integer> n1 = new Node<Integer>(1);
        Node<Integer> n2 = new Node<Integer>(2);
        Node<Integer> n3 = new Node<Integer>(3);
        head = n1;
        n1.next = n2;
        n2.next = n3;
        return head;
    }

    // dynamicaly creating linkedlist (O(N^2))
    public static Node<Integer> dynamicCreateLL(Node<Integer>head){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positice number to add it to linked list");
        System.out.println("enter 0 to terminate");
        int n = sc.nextInt();
        while (n>0) {
            Node<Integer> tempNode = new Node<Integer>(n);
            if(head == null){
                head = tempNode;
            }else{
                Node<Integer>temp = head;
                while (temp.next !=null) {
                    temp = temp.next;
                }
                temp.next = tempNode;
            }
            n = sc.nextInt();
        }
        return head;
    }
    // creating linked list with efficient way(O(N))
    public static Node<Integer> dynamicListCreation(){
        Node<Integer> head = null, tail=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positice number to add it to linked list");
        System.out.println("enter 0 to terminate");
        int n = sc.nextInt();
        while (n>0) {
            
            Node<Integer>curNode = new Node<Integer>(n);
            if(head == null && tail==null){
                head = curNode;
                tail = curNode;
            }else{
                tail.next = curNode;
                tail = tail.next; //or you can also write tail = curnode
            }
            n = sc.nextInt();
        }

        return head;

    }

    // fn to insert elemetn
    public static void insertAt(int data , int indx , Node<Integer>head){
        Node<Integer> n = new Node<Integer>(data);
        Node<Integer>temp = head;
        int count = 0;
        while (count<indx) {
            temp = temp.next;
            count++;
        }
        Node<Integer>nextNode = temp.next;
        temp.next = n;
        n.next = nextNode;
    }

    // printing linked list
    public static void printList(Node<Integer> head){
        if(head == null){
            System.out.println("list is empty");
            return;    
        }
        Node<Integer>temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // function to increment every element of list
    public static void increment(Node<Integer> head){
        Node<Integer>temp = head;
        while (temp != null) {
           ++temp.data;
           temp = temp.next;
        }
    }

    // function to count the lenght of list
    public static int lenghtOfList(Node<Integer>hNode){
        Node<Integer> tmp = hNode;
        int count =0;
        while (tmp!=null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
    
    // function to delete end node
    public static void deleteEndNode(Node<Integer>head){
        Node<Integer>temp = head;
        Node<Integer>prev = null;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
            
        }
        prev.next = null;
    }
    // fucntion to delete any node
    public static void delete(Node<Integer>head , int indx){
        Node<Integer>temp = head;
        if(indx == 0){
            System.out.println("You cannot delete head using this functions");
            return;
        }
        
        while (indx>1) {
            temp = temp.next;
            --indx;
        }
        temp.next = temp.next.next;

    }
    // delete function that can be used to delete any node included head
    public static Node<Integer> deleteAnyNode(Node<Integer>head , int indx){
        if(indx == 0){
            return head.next;
        }
        Node<Integer>temp = head;
        while (indx>1 && temp.next !=null && temp.next.next !=null) {
            temp = temp.next;
            --indx;
        }
        if(indx>1){
            System.out.println("Index out of bound");
            return head;

        }
        temp.next = temp.next.next;
        return head;
    }
    
    public static void main(String[] args) {
        // Node<Integer> heaNode = createList(null);
        // Node<Integer> head = dynamicCreateLL(null);
        // increment(head);
        // printList(head);
        // System.out.println(lenghtOfList(head));
        // Node<Integer> head2 = dynamicCreateLL(head.next);
        // printList(head2);

        Node<Integer> head = dynamicListCreation();
        printList(head);
        // insertAt(100, 1, head);
        // printList(head);
        // deleteEndNode(head);
        Node<Integer>newhead = deleteAnyNode(head, 9);
        printList(newhead);
    }
}
