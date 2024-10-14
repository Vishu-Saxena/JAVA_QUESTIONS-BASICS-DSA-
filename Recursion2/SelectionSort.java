package Recursion2;

import java.util.Arrays;

public class SelectionSort {
    // find the index of largest element 
    // swap it with the first element
    static int maxIndex(int[] arr , int ei){
        if(ei <= 0){
            return ei;
        }
        int largest = maxIndex(arr, ei-1);
        if(arr[largest] < arr[ei]){
            largest = ei;
        }
        return largest;
    }
    static void sort(int[]arr , int ei){
        if(ei <= 0){
            return;
        }
        // look for the largest number and swap it this the si
        int largest = maxIndex(arr, ei);

        // swap the end index with largest one
        int temp = arr[ei];
        arr[ei] = arr[largest];
        arr[largest] = temp;
        sort(arr, ei-1);

    }
    public static void main(String[] args) {
        int[]arr = {5,4,0,2,1};
        sort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
