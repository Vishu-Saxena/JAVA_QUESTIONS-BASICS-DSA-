package Recursion3.assignment;

public class ReturnSubsetOfArray {
    public static int[][] subsets(int[] arr , int si){
        // base case 
        if(si >= arr.length){
            int[][] ans = {{}};
            return ans;
        }

        int[][] smlOutput = subsets(arr, si+1);
        int[][] finalOutut = new int[smlOutput.length *2][];
        // copying all element of smlOutput ot finaloutput
        int k = 0;
        for(int i =0 ; i<smlOutput.length;i++){
            finalOutut[k] = new int[smlOutput[i].length];
            for(int j = 0 ; j<smlOutput[i].length ; j++){
                finalOutut[k][j] = smlOutput[i][j];
            }
            k++;
        }
        // now appending the last character to all the subsets 
        for(int i =0 ; i<smlOutput.length ; i++){
            finalOutut[k] = new int[smlOutput[i].length +1];
            finalOutut[k][0] = arr[si];
            for(int j = 1 ; j< smlOutput[i].length +1 ; j++){
                finalOutut[k][j] = smlOutput[i][j-1];
            }
            k++;
        }
        return finalOutut;
    }

    public static void printArr(int[][] arr){
        // System.out.println("{}");
        for(int i =1 ; i < arr.length ; i++){
            int subSum = 0;
            for(int j =0 ; j<arr[i].length ; j++){
                subSum += arr[i][j];
                // System.out.print(arr[i][j]  + " ");
            }
            System.out.println(subSum);
            // if(sum == subSum){
            //     for(int j =0 ; j<arr[i].length ; j++){
            //         // subSum += arr[i][j];
            //         System.out.print(arr[i][j]  + " ");
            //     }
            //     System.out.println();
            // }
           
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3, 4};
        int[][] subset = subsets(arr, 0);
        // System.out.println(subset[1][0]);
        printArr(subset);
    }
}
