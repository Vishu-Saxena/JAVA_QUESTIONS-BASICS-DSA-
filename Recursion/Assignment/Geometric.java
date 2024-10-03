package Recursion.Assignment;

public class Geometric {

    public static double sum(int k){
        if(k == 0){
            return 1;
        }
        double tempSum = 1/(Math.pow(2, k)) + sum(k-1);
        return tempSum;
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
