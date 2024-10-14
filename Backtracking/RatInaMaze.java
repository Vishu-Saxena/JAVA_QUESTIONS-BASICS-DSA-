package Backtracking;

public class RatInaMaze {

    public static boolean ratInaMaze(int[][] maze){
        int n = maze.length;
        int[][]path = new int[n][n];
        boolean res = solveMaze(maze, path, 0, 0);
        if(res){
            
        }
        return res;
    } 

    public static boolean solveMaze(int[][] maze , int[][]path , int i , int j){
        int n = maze.length;
        // checking whether current path is valid or not
        if(i<0 || j<0 || i>=n || j>=n || maze[i][j]==0 || path[i][j] == 1){
            return false;
        }
        path[i][j] = 1;//appending it to path matrix
        // incase if current location is destination
        if(i==n-1 && j==n-1){
            for(int r =0 ; r<n ; r++){
                for(int c =0 ; c<n ; c++){
                    if(path[r][c] == 1){
                        System.out.print("1 ");
                    }else{
                        System.out.print("- ");
                    }
                }
                System.out.println();
                
            }
            return true;
        }
        // now look for neext move
        // top
        if(solveMaze(maze, path, i-1, j)){
            return true;
        }
        // right
        if(solveMaze(maze, path, i, j+1)){
            return true;
        }
        // down
        if(solveMaze(maze, path, i+1, j)){
            return true;
        }
        // left
        if(solveMaze(maze, path, i, j-1)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] maze = {{1,1 ,0},{1,1,0},{1,1,1}};
        System.out.println(ratInaMaze(maze));
    }
}
