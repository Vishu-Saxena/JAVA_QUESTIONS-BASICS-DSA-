package Arrays.Searching.Matrix;

import java.util.Arrays;

public class Sorted {

    public static int[]binarySearch(int[][]matrix, int scol , int ecol, int row , int target){
        while (scol<=ecol) {
            int mid = (scol+ecol)/2;
            if(matrix[row][mid]==target){
                return new int[]{row, mid};
            }else if(target > matrix[row][mid]){
                scol = mid+1;
            }else{
                ecol = mid-1;
            }
        }k
        return new int[]{-1,-1};
    }

    public static int[]search(int[][]matrix , int target){

        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1) return binarySearch(matrix, 0, cols-1, 0, target);
     
        if(cols == 0) return new int[]{-1,-1};

        int rowStart = 0;
        int rowEnd = rows-1;
        while (rowStart < rowEnd-1) {
            int mid = rowStart+(rowEnd-rowStart)/2;
            if(matrix[mid][cols/2] == target){
                return new int[]{mid,cols/2};
            }else if(target > matrix[mid][cols/2]){
                rowStart=mid;
            }else{
                rowEnd = mid;
            }
        }

        // now we are left with two end rows
        if(matrix[rowStart][cols/2] == target)return new int[]{rowStart , cols/2};
        if(matrix[rowStart+1][cols/2] == target)return new int[]{rowStart+1 , cols/2};
        // search in first half
        if(target <= matrix[rowStart][cols/2-1])return binarySearch(matrix , 0, cols/2-1 , rowStart , target) ;
        // search in second half 
        if(target > matrix[rowStart][cols/2] && target <= matrix[rowStart][cols-1])return binarySearch(matrix, cols/2+1, cols-1, rowStart, target);
        // search in third half
        if(target <= matrix[rowStart+1][cols/2-1])return binarySearch(matrix, 0, cols/2-1, rowStart+1, target);
        // search in fourth half
        return binarySearch(matrix, cols/2+1, cols-1, rowStart+1, target);


    }
    public static void main(String[] args) {
        // when the given array is sorted not only column wise or row wise but entirely
        int[][]matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(search(matrix, 11)));

    }
}
