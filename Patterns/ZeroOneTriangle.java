package Patterns;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int rows ;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        rows = S.nextInt();
        for(int i =1 ; i <= rows ; i++){
            int couter;
            if(i%2 == 0){
                couter =0;
            }else{
                couter = 1;
            }

            for(int j=0 ; j < i ; j++){
                System.out.print(couter);
                if(couter == 0){
                    couter =1;
                }else{
                    couter = 0;
                }
            }
            System.out.println();
        }
    }
}
