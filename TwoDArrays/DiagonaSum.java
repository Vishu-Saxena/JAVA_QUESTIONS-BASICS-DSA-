package TwoDArrays;
import java.util.*;;
public class DiagonaSum {

    public static void digonalSum(int arr[][]){
        // diagonal sum is calculated for sqaure matrices only
        int sum = 0;
        int n = arr.length;
        for(int i =0 ; i < n ; i++){
            sum+=arr[i][i];
            sum+= arr[i][n-1-i];
        }
        // checking the whether it is even or odd order matrix
        // incase of odd we have a duplicate entry to remove
        if(n/2 != 0){
            sum -= arr[n/2][n/2];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // taking 2d matrix as input
        int matrix[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        digonalSum(matrix);
    }
}
