package stack.usingArray;

public class Stack {
    // making it private so that no one can access the data[]
    private int[]data;
    private int topIndex;
    // constructor
    public Stack(int size){
        data = new int[size];
        topIndex = -1;//as at the time of stack creation it is empty
    }

    // size()
    public int size(){
        return this.topIndex+1;
    }

    // top()
    public int top() throws StackEmpty{
        if(this.topIndex == -1){
            throw new StackEmpty();
        }
        return data[topIndex];
    }

    // empty()
    public boolean isEmpty(){
        if(this.topIndex == -1){
            return true;
        }
        return false;
    }

    // push()
    public void push(int num) throws StackoverFlow{
        if(topIndex+1 == this.data.length){
            throw new StackoverFlow();
        }
        this.data[++this.topIndex] = num;
    }

    // pop()
    public int pop() throws StackEmpty{
        if(this.topIndex == -1){
            throw new StackEmpty();
        }
        return this.data[this.topIndex--];
    }

}
