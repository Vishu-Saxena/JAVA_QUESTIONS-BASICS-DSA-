package Patterns;

import java.util.Scanner;

public class FlippedInvertedPyramid {
    public static void main(String[] args) {
        int rows ;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        rows = S.nextInt();

        for(int i = 1 ; i<=rows ; i++){
            for(int j = 0; j < rows-i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
