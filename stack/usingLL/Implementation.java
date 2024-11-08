package stack.usingLL;

import stack.usingArray.StackEmpty;

public class Implementation {
    public static void main(String[] args) throws StackEmpty {
        Stack<Integer> stc = new Stack<>();
        System.out.println(stc.size());
        stc.push(1);
        stc.push(2);
        stc.push(23);
        System.out.println(stc.size());
        try {
            System.out.println("top of stack : " + stc.top());
            System.out.println(stc.pop());
            System.out.println(stc.pop());
            System.out.println(stc.pop());
            System.out.println(stc.pop());

        } catch (StackEmpty e) {
            System.out.println("stack is empty");
        };

    }
}
