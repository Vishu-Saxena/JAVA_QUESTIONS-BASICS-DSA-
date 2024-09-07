package Patterns;

import java.util.Scanner;

public class HalfNumberPyramid {
    public static void main(String[] args) {
        int rows ;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        rows = S.nextInt();

        for(int i =1 ; i<=rows ; i++){
            for(int j = 1 ;j <= i ; j++){
                System.out.print(j);
            }
            System.err.println();
        }
    }
}
