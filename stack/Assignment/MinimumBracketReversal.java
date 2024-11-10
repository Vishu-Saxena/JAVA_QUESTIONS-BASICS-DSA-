package stack.Assignment;

import java.util.Stack;

public class MinimumBracketReversal {
    public static void main(String[] args) {
        String str = "{{}}}{{{{{";
        // check the lenght of string if odd then return false 
        if(str.length()%2 != 0){
            System.out.println(-1);
            return;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i) == '}' && stack.isEmpty()){
                stack.push(str.charAt(i));
            }else if(str.charAt(i) == '}' && stack.peek() == '{'){
                stack.pop();
            }else{
                stack.push(str.charAt(i));
            }
        }

        if(stack.isEmpty()){
            System.out.println(0);
        }else{
            int count = 0 ;
            while (!stack.isEmpty()) {
                char c1 = stack.pop();
                char c2 = stack.pop();
                if(c1 == c2){
                    count++;
                }else{
                    count +=2;
                }
            }
            System.out.println(count);
        }
    }
}
