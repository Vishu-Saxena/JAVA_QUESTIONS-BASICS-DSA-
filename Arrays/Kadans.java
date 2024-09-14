package Arrays;
import java.util.*;
public class Kadans {
    public static void main(String[] args) {
        int arr[] = {-2 , -3 , -4, -1 , -2 , 1 , 5 , -3};
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length ; i++){
            curSum = curSum + arr[i] > 0 ? curSum + arr[i] : 0;
            maxSum = maxSum > curSum ? maxSum : curSum;
        }
        System.out.println(maxSum);
    }
}
