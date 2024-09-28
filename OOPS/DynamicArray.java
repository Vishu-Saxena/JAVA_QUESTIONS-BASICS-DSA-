package OOPS;

public class DynamicArray {

    private static int arr[];
    private int pointer = 0;
    // constructor
    public DynamicArray(){
        arr = new int[5];
    }
    private DynamicArray(int size){
        int prevArr[] = arr;
        arr = new int[size*2];
         for(int i = 0 ; i<size ; i++){
            arr[i] = prevArr[i];
         }
    }
    // function to add element to array
    public void add(int num){
        // System.out.println(pointer);
        if(pointer >=  arr.length){
           new DynamicArray(arr.length);
        }
        arr[pointer] = num;
        pointer++;
    }

    // funtion to print array element
    public void print(){
        for(int i =0 ; i<pointer ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // function to return size of array()
    public int size(){
        return pointer+1;
    }

    // function to add value at particular position of array
    public void set(int indx , int ele){
        arr[indx] = ele;
    }

    // function to get the value of particular indx
    public int get(int indx){
        return arr[indx];
    }
    
    // funciton t0 remove last element from array
    public void remove(){
        arr[pointer] = 0;
        pointer--;
    }
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        int i = 0;
        while (i<50) {
            d.add(i+1);
            i++;
        }
        d.print();
        d.set(1, 10);
        System.out.println();//just to add next line to output
        System.out.println(d.get(1));
        int size = d.size();
        while (size > 20) {
            d.remove();
            size--;
        }
        d.print();
    }
}
