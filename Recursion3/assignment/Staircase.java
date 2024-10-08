package Recursion3.assignment;

public class Staircase {

    public static int stairs(int stairNUm){
        // there are three possibl base case
        if(stairNUm == 1){
            return 1;
        }
        if(stairNUm == 2){
            return 2;
        }
        if(stairNUm == 3){
            return 3;
        }
        int x = stairs(stairNUm-1);
        int y = stairs(stairNUm-2);
        int z = stairs(stairNUm-3);
        return x+y+z+1;
    }
    public static void main(String[] args) {
        System.out.println(stairs(5));
    }
}
