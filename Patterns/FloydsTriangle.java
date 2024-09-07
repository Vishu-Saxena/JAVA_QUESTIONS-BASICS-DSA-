package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        int rows ;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        rows = S.nextInt();
        int couter = 1;
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(couter + " ");
                couter++;
            }
            System.out.println();
        }
    }
}
