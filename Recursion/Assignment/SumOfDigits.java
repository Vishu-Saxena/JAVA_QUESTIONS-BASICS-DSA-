package Recursion.Assignment;

public class SumOfDigits {

    public static int sum(int num){
        if(num/10 == 0){
            return num;
        }
        return  num%10+ sum(num/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
}
