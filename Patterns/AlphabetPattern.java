package Patterns;
import java.util.Scanner;;
public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows : ");
        int row = sc.nextInt();
        // for(int i =0 ; i<row ; i++){
        //     char alpha = 'A';
        //     for(int j=0 ; j<row ; j++ ){
        //         System.out.print(alpha++);
        //     }
        //     System.out.println();
        // }

        int alpha = 'A';
        for(int i =0 ; i < row ; i++){
            for(int j = 0 ; j<row ; j++){
                System.out.print((char)(alpha+j));
            }
            System.out.println();
            alpha++;
        }
    }
}
