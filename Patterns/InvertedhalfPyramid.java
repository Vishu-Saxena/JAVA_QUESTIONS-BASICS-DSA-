package Patterns;

import java.util.Scanner;

public class InvertedhalfPyramid {
    public static void main(String[] args) {
        int rows , col;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        rows = S.nextInt();
        System.out.println("Enter no of coloumns : ");
        col = S.nextInt();

        for(int i =0 ; i<rows ; i++){
            for(int j =0 ; j < (col-i) ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
