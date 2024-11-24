package Arrays.Searching.Matrix;

import java.util.Arrays;

public class BinarySearch {

    public static int[] binarySearch(int[][]matrix , int target){
        // given arr needs to be sorted
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0;
        int col=m-1;
        while (row < n && col>=0) {
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][]matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println(Arrays.toString(binarySearch(matrix, 10)));
    }
}
