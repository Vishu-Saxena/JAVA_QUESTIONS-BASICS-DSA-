package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseFirstKele {

    private static void reverse(Queue<Integer>que , int k){
        if(k==0){
            return;
        }
        // store the front in variable
        int front = que.poll();
        reverse(que, --k);
        que.add(front);
    }
    private static void reverseFirstK(Queue<Integer>que , int k){//tihis k here is equal to n-k
        reverse(que, k);
        for(int i=0; i< que.size()-k; i++){
            int front = que.poll();
            que.add(front);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int len = sc.nextInt();
        // creating queue
        for(int i = 0; i<len; i++){
            que.add(sc.nextInt());
        }
        System.out.println("queue : " + que.toString());
        reverseFirstK(que, 1);
        System.out.println("queue reversed : " + que.toString());
        
    }
}
