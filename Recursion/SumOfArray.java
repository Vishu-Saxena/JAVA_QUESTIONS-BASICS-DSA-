package Recursion;

public class SumOfArray {

    public static int sum(int arr[]){
        if(arr.length == 0){
            return 0;
        }
        if(arr.length ==1){
            return arr[0];
        }
        int smlArr[] = new int[arr.length-1];
        for(int i =1; i<arr.length;i++){
            smlArr[i-1] = arr[i];
        }
        int sum = arr[0] + sum(smlArr);
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4};
        System.out.println(sum(arr));
    }
}
