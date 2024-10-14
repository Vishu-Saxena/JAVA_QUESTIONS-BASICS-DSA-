package Backtracking;

public class RatinMazeAllpaths {

    public static void AllPaths(int[][]maze){
        int n = maze.length;
        int[][]path = new int[n][n];
        printAllPaths(maze , path , 0 , 0);
    }
    public static void printAllPaths(int[][] maze , int[][]path , int i , int j){
        int n = maze.length;
        // check whether the current i and j are valid or not
        if(i<0 || j<0 || i>=n || j>=n || maze[i][j] == 0 || path[i][j] == 1){
            return;
        }
        path[i][j] = 1;
        // check if current postion is destination or not
        if(i==n-1 && j==n-1){
            System.out.println("path printing");
            for(int r= 0; r<n ; r++){
                for(int c =0 ; c<n ; c++){
                    System.out.print(path[r][c]+" ");
                }
                System.out.println();
            }
            System.out.println();

            path[i][j] = 0;
            return;
            
        }
        // now explore all the directions
        System.out.println("calling top " + (i-1 )+ " " + j);
        printAllPaths(maze, path, i-1, j);//top
        System.out.println("calling right " + i + " " + (j+1));
        printAllPaths(maze, path, i, j+1);//right
        System.out.println("calling down " + (i+1) + " " + j);
        printAllPaths(maze, path, i+1, j);//down
        System.out.println("calling left " + i + " " + (j-1));
        printAllPaths(maze, path, i, j-1);//left
        path[i][j] = 0;
        System.out.println("path reset done " + i + " " + j );

    }

    public static void main(String[] args) {
        int[][] maze = {{1,1,0} , {1,1,0} , {1,1,1}};
        AllPaths(maze);
    }
    
}