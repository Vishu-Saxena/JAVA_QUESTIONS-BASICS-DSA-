package Backtracking;

public class NQueen {

    public static void placeQueen(char[][] board , int row){
        if(row == board.length){
            for(int k = 0 ; k<board.length; k++){
                for (int i = 0; i < board.length; i++) {
                    System.out.print(board[k][i] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int k =0 ; k<board.length; k++){
            if(isValid(board , row , k)){
                board[row][k] = 'Q';
                placeQueen(board, row+1);
                board[row][k] = '.';
            }
            
        }
        
    }

    public static boolean isValid(char[][]board , int row, int col){
        // vertical validation
        for(int i = row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal left up 
        for(int i = row-1 , j= col-1; i>=0 && j>=0 ; i-- ,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diagonal right up
        
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for(int j =0 ; j<n ; j++){
                board[i][j] = '.';
            }
        }
        placeQueen(board, 0);
    }
    
}