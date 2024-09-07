package Patterns;

import java.util.Scanner;

public class HNInvertedPyramid {
    public static void main(String[] args) {
        int rows ;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        rows = S.nextInt();

        for(int i = rows ; i > 0 ; i--){
            for(int k =1 ; k <= i ; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
