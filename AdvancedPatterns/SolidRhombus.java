
package AdvancedPatterns;
import java.util.Scanner;;

/**
 * SolidRhombus
 */
public class SolidRhombus {
 
    public static void main(String[] args) {
        int rows;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        rows = S.nextInt();

        for(int i =0 ; i<rows ; i++){
            // spaces
            for(int j=1 ; j<rows-i ; j++){
                System.out.print("  ");
            }
            // stars
            for(int j = 0 ; j<rows ; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    
}
    