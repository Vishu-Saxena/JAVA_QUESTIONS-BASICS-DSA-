package BitManipulation;

public class MazicNum {
    private static void magicNumber(int n){
        int result = 0;
        int count = 1;
        while (n>0) {
            int lastDigt = n&1;
            result += lastDigt*Math.pow(5, count++);
            n =n>>1;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        magicNumber(1);
    }
}
