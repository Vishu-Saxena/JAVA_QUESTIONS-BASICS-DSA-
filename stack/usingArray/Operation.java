package stack.usingArray;

public class Operation {
    public static void main(String[] args) {
        Stack stck = new Stack(5);
        System.out.println(stck.isEmpty());
        System.out.println(stck.size());
        try {
            stck.push(1);
            stck.push(2);
            stck.push(3);
            stck.push(4);
            System.out.println(stck.size());
            System.out.println(stck.pop());
            stck.push(5);
            stck.push(6);
            System.out.println(stck.top());
            stck.push(7);
        } catch (StackEmpty se) {
            System.out.println("Stack is empty");
        }catch(StackoverFlow sf){
            System.out.println("Stack is full");
        }catch(Exception e){

            System.out.println(e);
        }   
        
    }
}
