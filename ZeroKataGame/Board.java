package ZeroKataGame;

public class Board {
    private char board[][];
    final int boardSize = 3;
    protected char p1Symbol , p2Symbol;
    protected int count;
    public Board(char s1 , char s2){
        this.p1Symbol = s1;
        this.p2Symbol = s2;
        board = new char[boardSize][boardSize];
        for(int i = 0;  i<3 ; i++){
            for(int j = 0; j<3;j++){
                board[i][j] = ' ';
            }
        }
    }

    // function to get the value at particular index of a board
    public char getVal(int row , int col){
        return board[row][col];
    }
}
