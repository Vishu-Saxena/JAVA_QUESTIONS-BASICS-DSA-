package Backtracking;
import java.util.Scanner;
public class BackTrackOnArray {
    public static void createArray(int arr[] , int indx){
        if(indx == arr.length){
            return;
        }
        // else add elements to array
        arr[indx] = new Scanner(System.in).nextInt();
        createArray(arr, indx+1);
        arr[indx] -=2; 
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        createArray(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
