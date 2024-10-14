package Recursion2;

public class BubbleSort {
    static void sort(int[]arr , int si){
        // base case
        if(si == arr.length){
            return;
        }
        // putting the largest element to the end of array
        for(int i = 0 ; i<arr.length-si-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        // caling binarysearch for rest of the array 
        sort(arr, si+1);
    }
    public static void main(String[] args) {
        int[]arr = {6,4,3,2,1};
        sort(arr, 0);
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
