package Recursion3.assignment;

public class StairCaseEffiicient {
    public static int staircase(int stairs){
        if(stairs <0){
            return 0;
        }
        if(stairs ==0){
            return 1;
        }
        return staircase(stairs-1) + staircase(stairs-2)+staircase(stairs-3);


    }
    public static void main(String[] args) {
        System.out.println(staircase(5));
    }
}
