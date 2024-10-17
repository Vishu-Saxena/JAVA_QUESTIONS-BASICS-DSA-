package Backtracking;

/**
 * Suduko
 */
public class Suduko {

    static boolean sudukuSolver(int[][]suduku , int row , int col){
        if(row == suduku.length){
            // print suduku
            printSudoku(suduku);
            return true;
        }
        // check whether the given cell is valid or not
        int nextRow = row,nextCol = col+1;
        if(col == 8){
            nextCol = 0;
            nextRow = row+1;
        }
        if(suduku[row][col] == 0){
            for(int num =1 ; num<10 ; num++){
                if(isValid(suduku, row, col , num)){
                    suduku[row][col] = num;
                    if(sudukuSolver(suduku, nextRow, nextCol)){
                        return true;
                    }
                    // backtrack in case no solution is found
                    suduku[row][col] = 0;
                }
            };     
        }else{
            if(sudukuSolver(suduku, nextRow, nextCol)){
                return true;
            }
            
        }
       
        return false;
    }
    static boolean isValid(int[][]sudoku, int i , int j , int num){
        int n = sudoku.length;
        if(i>=n || j>=n || i<0 || j<0 || sudoku[i][j]!=0){
            return false;
        }

        for (int k2 = 0; k2 < sudoku.length; k2++) {
            // check konsa number row mai plcase kiya ja sakata h ya nhi
            if(sudoku[i][k2] == num){
                return false;
            }
            // check konsa number col mai plcase kiya ja sakata h ya nhi
            if(sudoku[k2][j] == num){
                return false;
            }

        }

        // caculating the starting coloumn and row of grid to which the current cell belongs
        int startCol = (j/3)*3;
        int startRow = (i/3)*3;
        // check kro khi element grid mai present h ya nhi
        for (int k = startRow ; k < startRow+3; k++) {
            for (int k2 = startCol; k2 < startCol+3; k2++) {
                if(sudoku[k][k2] == num){
                    return false;
                }
            }
        }
        return true;
    }

    static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println(sudukuSolver(sudoku , 0 , 0));
    }
}