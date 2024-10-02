package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter aray lenght : ");
        int len = s.nextInt();
        s.nextLine();
        int arr[] = new int[len];
        int rightSum = 0;
        for(int i =0 ; i<len ; i++){
            arr[i] = s.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }
        
        int leftSum = 0 ;
        for(int i =0 ; i<len-1 ; i++){
            if(rightSum == leftSum){
                System.out.println(i);
                return;
            }else{
                rightSum -= arr[i+1];
                leftSum += arr[i];
            }
        }

        System.out.println("-1");

    }
}
