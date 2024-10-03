package Recursion.Assignment;

public class CountZeroes {

    public static int countZeroes(int num){
        if(num < 10){
            return 0;
        }
        if(num%10 == 0){
            return 1+countZeroes(num/10);
        }
        return 0+countZeroes(num/10);
    }
    public static void main(String[] args) {
        System.out.println(countZeroes(708000));
    }
}
