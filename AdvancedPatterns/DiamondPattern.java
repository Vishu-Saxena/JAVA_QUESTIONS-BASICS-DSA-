package AdvancedPatterns;
import java.util.Scanner;;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int row = s.nextInt();

        for(int i =0; i<row; i++){

            // loop for upper spaces
            for(int j = 1 ; j<row-i ; j++){
                System.out.print(" ");
            }

            // loop for upper stars
            for(int j = 0 ; j<=i*2 ; j++ ){
                System.out.print("*");
            }

            System.err.println();
        }
        for(int i =0; i<row; i++){

             // loop for lower spaces
             for(int j = 0 ; j<i ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j < row*2-(2*i) ; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
