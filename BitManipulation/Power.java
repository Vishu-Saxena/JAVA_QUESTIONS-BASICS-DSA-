package BitManipulation;

public class Power {
    // function to calculate the x raise to power y (x^y);

    private static void power(int base , int pwr){
        int ans = 1;
        int count = 1;
        while (pwr > 0) {
            if((pwr&1) == 1){
                ans *= Math.pow(base, count);
            }
            count *=2;
            pwr = pwr>>1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        power(3, 10);
    }
}
