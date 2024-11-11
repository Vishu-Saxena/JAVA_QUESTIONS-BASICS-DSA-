package BitManipulation;

public class PowerOfTwo {

    // using rigth shift operator
    private static void powrOfTwo(int n){
        
        int count = 0;
        while (n>0 && count < 2) {
            int lastDigt = n&1;
            if(lastDigt == 1)count++;
            n = n>>1;
        } 
        if(count >1){
            System.out.println(false);
            return;
        }
        System.out.println(true);
    }

    // using only & operator
    private static void powrOfTwoBetter(int n){
        if(n == 0){
            System.out.println("false");
            return;
        }
        if( (n&(n-1)) == 0 ){
            System.out.println("true");
            return;
        }
        System.out.println(false);
    }
    public static void main(String[] args) {
        powrOfTwo(70);
        powrOfTwoBetter(64);
    }
}
