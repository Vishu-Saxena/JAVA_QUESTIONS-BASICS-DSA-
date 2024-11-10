package stack.Assignment;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] stocks = {5,3,8,7,10,7,7,12,16};

        Stack<Integer> stack = new Stack<>();//stores the index of maximum stock till the current index
        stack.push(0);//at the first element the maximum value of stock is first element only
        System.out.println(1);//span of first day stock would be 1 always as no previous days are there
        for(int i = 1; i<stocks.length ; i++){
            while (!stack.isEmpty() && stocks[i] > stocks[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.println(i+1);
            }else{
                System.out.println( i-stack.peek());
            }
           
            stack.push(i);
        }

    }
}