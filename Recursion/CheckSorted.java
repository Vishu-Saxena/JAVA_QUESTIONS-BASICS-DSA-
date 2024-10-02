package Recursion;

public class CheckSorted {

    public static boolean isSorted(int arr[]){
        if(arr.length == 0 ||arr.length == 1 ){
            return true;
        }
        if(arr[0] > arr[1]){
            return false;
        }
        int smallerArray[] = new int[arr.length-1];
        for(int i =1 ; i<arr.length ; i++){
            smallerArray[i-1] = arr[i];
        }
        return isSorted(smallerArray);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,0,4};
        boolean res = isSorted(arr);
        System.out.println(res);
    }
}
