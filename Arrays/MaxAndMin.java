package Arrays;
import java.util.*;

public class MaxAndMin {
    public static void main(String[] args) {
        int arr[] = {1,4,8,3,9,20};
        int max = Integer.MIN_VALUE; //returs -infinity
        int min = Integer.MAX_VALUE; //returns +infinity
        for(int i = 0 ; i<arr.length ; i++ ){
            max = max<arr[i]? arr[i] : max;
            min = min > arr[i] ? arr[i] : min;
        }

        System.out.println("Maximum element of array : " + max);
        System.out.println("Minimum element of array : " + min);

    }
}
