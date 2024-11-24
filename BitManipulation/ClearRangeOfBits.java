package BitManipulation;

public class ClearRangeOfBits {

    private static int clearRangeOfBits(int num , int i , int j){
        System.out.println("Given binary number "+ Integer.toBinaryString(num));
        int bitMask  = ((-1)<<j) | (int)(Math.pow(2, i-1)-1);
        System.out.println(Integer.toBinaryString(bitMask));
        return (int)(num&bitMask);
    }
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(clearRangeOfBits(50, 2, 4)));
        // System.out.println((int)('z'));
        // System.out.println((char)( 'A'|' '));
    }
}
