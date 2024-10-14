package Backtracking;

public class GridWays {
    public static int gridWay(int m , int n  , int i, int j){
        if(i == m-1 && j==n-1){
            return 1;
        }
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }
        int rightWays = gridWay(m, n, i, j+1);
        int downWays = gridWay(m, n, i+1, j);
        return rightWays+downWays;

    }
    public static void main(String[] args) {
        System.out.println(gridWay(4, 5,  0, 0));
    }
}
