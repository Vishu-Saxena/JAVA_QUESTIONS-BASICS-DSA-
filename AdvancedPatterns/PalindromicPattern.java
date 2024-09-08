package AdvancedPatterns;

import java.util.Scanner;;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt(); ;
        // loop for spaces
        for(int i =1 ; i <=rows ; i++ ){
            for(int j =0 ; j < rows-i ; j++){
                System.out.print(" ");
            }

            // for numbers on left side
            for(int j = i ; j>0 ; j--){
                System.out.print(j);
            }

            // for numbrers on right side
            for(int j = 2 ; j <=i ; j++){
                System.out.print(j);
            }

            System.out.println();

        }

    }
}
