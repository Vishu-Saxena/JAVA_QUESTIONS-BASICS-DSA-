package Recursion;

public class CheckSortedBetter {

    public static boolean isSorted(int arr[] , int startIndex){
        if(startIndex == arr.length-1){
            return true;
        }
        if(arr[startIndex] > arr[startIndex+1]){
            return false;
        }
        return isSorted(arr, startIndex+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6 ,4};
        System.out.println(isSorted(arr, 0));
    }
}
