package stack;
import java.util.Stack;

public class ReverseStack {

    private static void reverse(Stack<Integer> stck){
        // base case

        if(stck.size() == 0 || stck.size() == 1)return;

        int currentTop = stck.pop();
        reverse(stck);
        Stack<Integer> helpr = new Stack<>();
        while (!stck.empty()) {
            helpr.push(stck.pop());
        }
        stck.push(currentTop);
        while (!helpr.empty()) {
            stck.push(helpr.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();
        stck.push(1);
        stck.push(2);
        stck.push(3);
        stck.push(4);

        reverse(stck);

        while (!stck.empty()) {
            System.out.println(stck.pop());
        }
    }
}
