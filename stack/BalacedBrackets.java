package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalacedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                stack.push(str.charAt(i));
            }else{

                if( !stack.empty() && ((stack.peek() == '(' && str.charAt(i) == ')') || (stack.peek() == '[' && str.charAt(i) == ']') || (stack.peek() == '{' && str.charAt(i) == '}'))){
                    stack.pop();
                }else{
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if(!stack.empty()){
            System.out.println("Not Balanced");
            return;
        }
        System.out.println("Balanced");

    }
}
