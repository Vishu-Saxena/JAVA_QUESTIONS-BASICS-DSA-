package Recursion;

public class ChecknumInArr {
    public static boolean checkNuminArray(int arr[], int key){
        if(arr.length == 0){
            return false;
        }
            if(arr[arr.length-1] == key){
                return true;
            }
        int smlArr[] = new int[arr.length-1];
            for(int i =0; i<arr.length-1;i++){
                smlArr[i] = arr[i];
            }
            return checkNuminArray(smlArr, key);
    }
    public static void main(String[] args) {
        int arr[] = {12,3,4 , 5};
        System.out.println(checkNuminArray(arr, 2));
        
    }
}
