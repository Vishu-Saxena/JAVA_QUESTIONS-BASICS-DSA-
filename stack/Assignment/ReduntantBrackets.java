package stack.Assignment;

import java.util.Scanner;
import java.util.Stack;

public class ReduntantBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // we are only using parenthesis for now

        String str = sc.nextLine();
        Stack<Character>stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){

            if(str.charAt(i) == ')'){
                int count  = 0;
                while (stack.peek() != '(' ) {
                    count++;
                    stack.pop();
                }
                if(count == 0 || count == 1){
                    System.out.println("true");
                    return;
                }

            }else{
                stack.push(str.charAt(i));
            }
        }

        // this will check in case is any extra open brackets are there or not ex: ((a+v)
        while (!stack.isEmpty()) {
            if(stack.pop() == '('){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
