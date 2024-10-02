package ZeroKataGame;
import java.util.*;;
public class TicTac {
    private static Player p1;
    private static Player p2;
    private static Board board;

    public static void startGame(){
        Scanner sc = new Scanner(System.in);
        p1 = new Player("Mansi Saxena", 'X');
        int p1Moves = 0;
        int p2Moves = 0;
        p2 = new Player("Vishu Saxena", 'O');
        board = new Board('X', 'O');
        boolean player1Turn = true;
        int x , y;
        while (board.count < 9) {
            if(player1Turn == true){
                System.out.println("player 1 turn");
                System.out.print("Enter x coordinate : ");
                x= sc.nextInt();
                System.out.print("Enter Y coordinate : ");
                y = sc.nextInt();

                if(board.getVal(x, y) !=' ' || x > 2 || y > 2){
                     System.out.println("invalid move");
                     continue;
                }

        

                for(int i =0 ; i<5 ; i++){
                    if(p1.trackArr[i] == null){
                        p1.trackArr[i] = new Coordinate(x, y);
                        ++p1Moves;
                        board.count++;
                     }
                  }
                        // checking wether player win or not
                        if(p1Moves >= 3){
                            for(int j = 0 ; j < p1Moves-2 ; j++){
                                if((p1.trackArr[j].x == p1.trackArr[j+1].x && p1.trackArr[j+1].x == p1.trackArr[j+2].x ) || ( p1.trackArr[j].y == p1.trackArr[j+1].y && p1.trackArr[j+1].y == p1.trackArr[j+2].y) || ( p1.trackArr[j].x == p1.trackArr[j].y && p1.trackArr[j+1].y == p1.trackArr[j+1].x && p1.trackArr[j+2].y == p1.trackArr[j+2].x) ){
                                    System.out.println("Player 1 won");
                                    return;
                                }
                            }
                        }
                        player1Turn = false;
                        
                    }
                    else{
                System.out.println("player 2 turn");
                System.out.print("Enter x coordinate : ");
                x= sc.nextInt();
                System.out.print("Enter Y coordinate : ");
                y = sc.nextInt();

                if(board.getVal(x, y) !=' ' || x > 2 || y > 2){
                    System.out.println("invalid move");
                    continue;
               }


               for(int i =0 ; i<5 ; i++){
                if(p2.trackArr[i] == null){
                    p2.trackArr[i] = new Coordinate(x, y);
                    ++p2Moves;
                    board.count++;
                    // checking wether player win or not
                    if(p2Moves >= 3){
                        for(int j = 0 ; j < p2Moves-2 ; j++){
                            if(p2.trackArr[j].x == p2.trackArr[j+1].x && p2.trackArr[j+1].x == p2.trackArr[j+2].x && p2.trackArr[j].y == p2.trackArr[j+1].y && p2.trackArr[j+1].y == p2.trackArr[j+2].y || ( p2.trackArr[j].x == p2.trackArr[j].y && p2.trackArr[j+1].y == p2.trackArr[j+1].x && p2.trackArr[j+2].y == p2.trackArr[j+2].x)  ){
                                System.out.println("Player 2 won");
                                return;
                            }
                        }
                    }
                    player1Turn = true;
                    
                }
            }

            }
            board.count++;
        }

    }

    public static void main(String[] args) {
        startGame();
    }

}
