package Arrays;
import java.util.*;;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        // creating prefix sum arr
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];//since the element at 0 index in prefixsum array is the first element of original array
        for(int i = 1 ; i<arr.length ; i++){
            prefixSum[i] = prefixSum[i-1]+arr[i]; 
        }

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int curSum = 0;
            for(int j = i ; j<arr.length ; j++){
                curSum  = i==0 ? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
            }

            maxSum = maxSum > curSum ? maxSum : curSum;
        }

        System.out.println("maxSum : " + maxSum);
    }
}
