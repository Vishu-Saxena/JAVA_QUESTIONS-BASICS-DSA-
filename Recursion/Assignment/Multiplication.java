package Recursion.Assignment;

public class Multiplication {

    public static int multiply(int num1 , int num2){
        if(num2 == 0 || num1 ==0){
            return 0;
        }
        return num1 + multiply(num1, num2-1);
    }
    public static void main(String[] args) {
        System.out.println(multiply(0, 5));
    }
}
