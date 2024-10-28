package LinkedListRecursion;

import LinkedList.Node;

class DoubleNode{
    Node<Integer>head;
    Node<Integer>tail;
    public DoubleNode(Node<Integer>head , Node<Integer>tail){
        this.head = head;
        this.tail = tail;
    }
}

public class Operations {
    // function to print linked list recursively
    public static void printLL(Node<Integer>node){
        if(node == null){
            System.out.println("null");
            return;
        }
        System.out.print(node.data+ "->");
        printLL(node.next);
    }
    // function to insert element recursively
    public static Node<Integer> insert(Node<Integer>head , int indx , int data){
       
        // case 1 : if indx = 0 means chancge the head and return new head
        if(indx == 0){
            Node<Integer>node = new Node<Integer>(data);
            node.next = head;
            return node;
        }
        // incase index given is greater than the lenght of list
        if(head == null && indx >=1){
            System.out.println("Index out of bound");
            return head;
        }
        // otherwise look for the required index
        if(indx == 1){
            Node<Integer>node = new Node<Integer>(data);
            Node<Integer>temp = head.next;
            head.next = node;
            node.next = temp;
            return head;
        }
        insert(head.next, --indx, data);
        return head;
    }

    // function to delete the node recursively
    public static Node<Integer> deleteNode(Node<Integer>head , int indx){
        // base case deleting head
        if(indx == 0 && head != null){
            return head.next;
        }
        // case 2 if invalid index is given
        if(head == null){
            System.out.println("index out of bound");
            return head;
        }      
        head.next = deleteNode(head.next, --indx);
        return head;
    }

    // function to reverse the linked list (O(N^2))
    public static Node<Integer> reverse(Node<Integer>head){
        
        // check if list is empty or having only element
        if(head == null || head.next == null){
            return head;
        }
        // else make recursive call to next node
        Node<Integer>smlHead = reverse(head.next);
        Node<Integer>tail = smlHead;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return smlHead;
    }
    
   
   
     // function to reverse the linked list in efficient way(O(N))
     public static DoubleNode reverseBetter(Node<Integer>head){
        // base case
        if(head == null || head.next == null){
            DoubleNode ans = new DoubleNode(head, head);
            return ans;
        }

        DoubleNode smlAns = reverseBetter(head.next);
        smlAns.tail.next = head;
        smlAns.tail = head;
        head.next = null;
        return smlAns;
     }

    //  function to calculate the mid point of linked list
    // brut force (calculate the length then by dividing the lenght by 2 we can get mid point)
    public static int lenghtOfll(Node<Integer>head){
        if(head == null){
            return 0;
        }
        Node<Integer>temp = head;
        int count = 1 + lenghtOfll(temp.next);

        return count;
    }
    public static void midpoint(Node<Integer>head){
        int midpt = lenghtOfll(head)/2;
        Node<Integer>temp = head;
        while (midpt>0) {
            temp = temp.next;
            midpt--;
        }
        System.out.println(temp.data);
    }

    // optimise way to calculate mid point of a list
    // we'll use two pointers fast and slow fast moves 2 steps at a time whereas slowe moves 1 step at time
    public static Node<Integer> midpointBetter(Node<Integer>head){
        Node<Integer>slow , fast;
        fast = head;
        slow = head;
        while ( fast.next !=null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // function to merge two sorted linked list
    public static Node<Integer> merge(Node<Integer>head1 , Node<Integer>head2){
        Node<Integer>temp1 = head1;
        Node<Integer>temp2 = head2;
        Node<Integer>newHead;
        Node<Integer>tail;
        if(temp1.data < temp2.data){
            newHead = temp1;
            temp1 = temp1.next;
        }else{
            newHead = temp2;
            temp2 =temp2.next;
        }
        tail = newHead;
        while (temp1 !=null && temp2 !=null) {
            if(temp1.data < temp2.data){
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
            }else{
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            tail.next = temp1;
            tail = temp1;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            tail.next = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        Node<Integer>n1 = new Node<>(1);
        Node<Integer>n2 = new Node<>(2);
        Node<Integer>n3 = new Node<>(3);
        Node<Integer>n4 = new Node<>(4);
        Node<Integer>n5 = new Node<>(5);
        Node<Integer>n6 = new Node<>(6);
        n1.next = n3;
        n3.next = n5;
        n2.next = n4;
        n4.next = n6;
        printLL(n1);
        printLL(n2);
        // midpoint(n1);
        // System.out.println(midpointBetter(n1));
        // System.out.println(len);
        // Node<Integer>newhead = insert(n1, 3 , 4);
        // Node<Integer>newhead = deleteNode(n1, 2);
        // Node<Integer> newhead = reverse(n1);

        // printLL(newhead);

        Node<Integer> newHead = merge(n1, n2);
        printLL(newHead);
        printLL(n1);
        printLL(n2);
    }
}
