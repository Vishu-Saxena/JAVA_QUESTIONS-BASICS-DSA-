package Arrays;

public class Subarrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i =0 ; i < arr.length ; i++){
            for(int j = i ; j<arr.length ; j++){
                int sum = 0;
                for(int k = i ; k<=j ; k++){
                    System.out.print(arr[k]);
                    sum= arr[k] + sum;
                }
                // System.out.println("sum : " + sum);
                maxSum = maxSum<sum?sum : maxSum;
                minSum = minSum>sum?sum : minSum;
                System.err.println();
            }
            System.out.println();
        }
        System.out.println("maxsum : " + maxSum);
        System.out.println("minsum : " + minSum);
        System.out.println("total number of subArrays : " + (arr.length*(arr.length+1))/2);
    }
}
