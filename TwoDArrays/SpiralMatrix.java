
package TwoDArrays;
import java.util.Scanner;


public class SpiralMatrix {
   
    public static void spiral(int arr[][]){
        int sr ,er, sc, ec;
        sr = sc = 0;
        er = arr.length-1;
        ec = arr[0].length-1;
        while (sr <= er && sc<= ec) {
            // for top of spiral
            for(int j = sc ; j <= ec ; j++){
                System.out.print(arr[sr][j] + " ");
            }
            // right side of spiral
            for(int i = sr+1 ; i<=er ; i++){
                System.out.print(arr[i][ec] + " ");
            }
            // bottom side of spiral
            for(int j = ec-1 ; j>=sc ; j-- ){
                if(sr == er){
                    break;
                }
                System.out.print(arr[er][j] + " ");
            }
            // right side of spiral
            for(int i = er-1 ; i>=sr+1 ; i--){
                if(sc == ec){
                    break;
                }
                System.out.print(arr[i][sc] + " ");

            }
            sc++;
            sr++;
            er--;
            ec--;
        }
    }
    
    public static void main(String[] args) {
        // taking 2d matrix as input
        Scanner sc = new Scanner(System.in);
        int row , col;
        System.out.print("enter the number of rows : ");
        row = sc.nextInt();
        System.out.print("enter the number of coloumns : ");
        col = sc.nextInt();

        int matrix[][] = new int[row][col];

        for(int i =0 ; i < row ; i++){
            for(int j =0 ; j<col ; j++){
                System.out.print("enter the matrix element : ");
                matrix[i][j] = sc.nextInt();
                
            }
            System.out.println();
        }
        for(int i =0 ; i < row ; i++){
            for(int j =0 ; j<col ; j++){
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }

        spiral(matrix);
    }
}
