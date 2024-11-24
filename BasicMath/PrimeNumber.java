package BasicMath;

public class PrimeNumber {
    // fucntion to find whether the given number is prime or not
    private static boolean isPrime(int n){
        if(n == 1 || n==2){
            return true;
        }
        int count = 0;
        for(int i =2; i <= (int)Math.floor(Math.sqrt(n)) ; i++){
            System.out.println(++count);
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(49));
    }
}
