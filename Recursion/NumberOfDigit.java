package Recursion;

public class NumberOfDigit {

    public static int numberOfdigits(int num){
        if(num/10 == 0){
            return 1;
        }
        return 1 + numberOfdigits(num/10);
    }
    public static void main(String[] args) {
        
        System.out.println(numberOfdigits(1234));
        // System.out.println(2/10);
    }
}
