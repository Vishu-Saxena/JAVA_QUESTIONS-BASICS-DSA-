package AdvancedPatterns;
import java.util.Scanner;;

public class Butterfly {
    public static void main(String[] args) {
        int rows;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        rows = S.nextInt();

        for(int i= 0 ; i<rows ; i++){
           for(int j =0 ; j< rows*2; j++){
            if(j <=i || j >=(rows*2-i-1)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
           System.err.println();
        }
        for(int i= rows-1 ; i>=0 ; i--){
           for(int j =0 ; j< rows*2; j++){
            if(j <=i || j >=(rows*2-i-1)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
           System.err.println();
        }
    }
}
