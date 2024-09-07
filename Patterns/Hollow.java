package Patterns;

import java.util.Scanner;

public class Hollow {
    public static void main(String[] args) {
        int rows , col;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        rows = S.nextInt();
        System.out.println("Enter no of coloumns : ");
        col = S.nextInt();

        for(int i=0 ; i<rows ; i++){
            for(int j =0 ; j <col ; j++){
                if(i ==0 || i ==(rows-1) || j==0 || j== (col-1)){
                    System.out.print("* ");
                }else{
                   System.out.print("  ");
                }
            }
            System.out.println();
           
        }
    }
}
