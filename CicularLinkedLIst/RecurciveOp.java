package CicularLinkedLIst;

class DoubleNode{
    Node<Integer>tail;
    Node<Integer>head;
    DoubleNode(Node<Integer>tail , Node<Integer>head){
        this.head = head;
        this.tail = tail;
    }
}

public class RecurciveOp {
    // funtion to print the circular list
    public static void recursiveprintCl(Node<Integer>tail , Node<Integer>heaNode){
        // base case
        if(heaNode == tail){
            System.out.print(heaNode.data +"->" +heaNode.next.data);
            return;
        }
        System.out.print(heaNode.data+"->");
        recursiveprintCl(tail, heaNode.next);

    }

    public static void printCll(Node<Integer>tail){
        // incase list is empty
        if(tail == null){
            System.out.println("null");
            return;
        }
        // incase there is only one element in the list
        if(tail.next == null){
            System.out.println(tail.data + "->"+ "NULL");
            return;
        }
        recursiveprintCl(tail, tail.next);
        System.out.println();
    }

    // fucntion to calcualte the lenght of list recursivly
    public static int count(Node<Integer>tail , Node<Integer>heaNode){
        if(tail == heaNode){
            return 1;
        }
        if(tail == null){
            return 0;
        }
        return 1+count(tail, heaNode.next);
    }

    public static int reCount(Node<Integer>tail){
        return count(tail, tail.next);
    }

    // function to insert the element at given index
    public static Node<Integer> insertRec(Node<Integer>tail , Node<Integer>head, int pos , int data){

        // inserting element at head
        if(pos == 0){
            Node<Integer>node = new Node<Integer>(data);
            node.next = head;
            tail.next = node;
            return tail;
        }
        // at any index 
        if(pos == 1){
            Node<Integer>node = new Node<Integer>(data);
            node.next = head.next;
            head.next = node;
            return tail;
        }
         insertRec(tail, head.next , --pos , data);
         return tail;
    }

    public static Node<Integer> insert(Node<Integer>tail , int pos , int data){
        return insertRec(tail, tail.next, pos, data);
    }


    // funtion to delete a given node
    public static Node<Integer> deleteRec(Node<Integer>tail , Node<Integer>head , int pos){

        // incase of only single element 
        if(pos == 0 && head == null){
            return null;
        }
        // case : deleting head
        if(pos == 0){
            tail.next = head.next;
            return tail;
        }
        // case deleting given node
        if(pos == 1 && head.next != tail){
            head.next = head.next.next;
            return tail;
        }
        // deleting tail
        if(pos == 1 && head.next == tail){
            head.next = tail.next;
            return head;
        }
        if(pos > 1 && head.next == tail){
            System.out.println("Index out of bound");
            return tail;
        }
        return deleteRec(tail, head.next, --pos);
    }
    public static Node<Integer> delete(Node<Integer>tail , int pos){
        if(tail == null){
            return tail;
        }
        return deleteRec(tail, tail.next, pos);
    }

    // // fucntion to reverse the list
    // public static Node<Integer> reverse(Node<Integer> tail , Node<Integer>head){
    //     // base case
    //     if(head == tail || head.next == tail){
    //         return tail;
    //     }
    //     Node<Integer>temp = head.next;
    //     head.next.next = head
    //     DoubleNode smlAns = new DoubleNode(tail, head);
    // }

    // fucntion to find the mid point of a circular linked list
    public static int midpoint(Node<Integer>tail){
        //incase if only singele element is htere
        if(tail == null){
            System.out.println("list is empty");
            return -1;
        }
        if(tail.next == null){
            System.out.println(tail.data);
            return 0;
        }
        Node<Integer>slow = tail.next;
        Node<Integer>fast = tail.next;
        int midPnt = 0;
        while (fast.next != tail && fast != tail) {
            slow = slow.next;
            fast = fast.next.next;
            midPnt++;
        }

        System.out.println(slow.data);

        return midPnt;

    }

    public static Node<Integer> merge(Node<Integer> tail1, Node<Integer> tail2) {
        // Break the circular links to treat lists as linear
        Node<Integer> p1 = tail1.next;
        tail1.next = null;
        Node<Integer> p2 = tail2.next;
        tail2.next = null;
    
        // Initialize head and tail based on the first node in sorted order
        Node<Integer> head = p1.data < p2.data ? p1 : p2;
        Node<Integer> tail = head;
    
        if (p1.data < p2.data) {
            p1 = p1.next;
        } else {
            p2 = p2.next;
        }
    
        // Merge lists while both have nodes left
        while (p1 != null && p2 != null) {
            if (p1.data < p2.data) {
                tail.next = p1;
                tail = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                tail = p2;
                p2 = p2.next;
            }
        }
    
        // Append any remaining nodes from either list
        while (p1 != null) {
            tail.next = p1;
            tail = p1;
            p1 = p1.next;
        }
        while (p2 != null) {
            tail.next = p2;
            tail = p2;
            p2 = p2.next;
        }
    
        // Restore circular link
        tail.next = head;
    
        // Return the new tail of the merged circular list
        return tail;
    }
    

    public static void main(String[] args) {
        // Node<Integer>n1 = new Node<Integer>(1);
        // Node<Integer>n2 = new Node<Integer>(2);
        // Node<Integer>n3 = new Node<Integer>(3);
        // Node<Integer>n4 = new Node<Integer>(4);
        // Node<Integer>n5 = new Node<Integer>(5);
        // n1.next = n2;
        // n2.next = n3;
        // n3.next = n4;
        // n4.next = n5;
        // n5.next = n1;
        // printCll(n5);
        // Node<Integer>newTail = delete(n5 , 4);
        // printCll(newTail);

        // System.out.println(midpoint(n5));

        Node<Integer>n1 = new Node<Integer>(1);
        Node<Integer>n2 = new Node<Integer>(2);
        Node<Integer>n3 = new Node<Integer>(3);
        Node<Integer>n4 = new Node<Integer>(4);
        Node<Integer>n5 = new Node<Integer>(5);
        Node<Integer>n6 = new Node<Integer>(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;
        n4.next = n5;
        n5.next = n6;
        n6.next = n4;
        printCll(n3);
        printCll(n6);
        Node<Integer>tail = merge(n6, n5);
        printCll(tail);
    }
}
