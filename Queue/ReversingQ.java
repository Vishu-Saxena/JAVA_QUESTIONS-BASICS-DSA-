package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReversingQ {

    private static void reverse(Queue<Integer>que){
        // base case
        if(que.size() == 0 || que.size() == 1){
            return;
        }
        // store the front of queue in a variable
        int front = que.poll();
        reverse(que);
        que.add(front);
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
        // now call reverse function
        reverse(que);
        // print the que
        System.out.println("reversed queue : " + que.toString());
    }
}
