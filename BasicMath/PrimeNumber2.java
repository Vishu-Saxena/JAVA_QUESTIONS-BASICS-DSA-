package BasicMath;

public class PrimeNumber2 {

    // fucntion to find whether the given number is prime or not
    private static boolean isPrime(int n){
        if(n == 1 || n==2){
            return true;
        }
        int count = 0;
        for(int i =2; i <= (int)Math.floor(Math.sqrt(n)) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    // function to find all the prime number till given number
    private static void allPrimes(int num){
        // this array stores false for every prime number and true for every non-prime true;
        // initailly all index are false
        boolean[]primes = new boolean[num+1];
        for(int i=2; i<=(int) Math.floor(Math.sqrt(num)) ; i++){
            if(isPrime(i)){
                for(int j=2; j*i <= num; j++){
                    primes[i*j] = true;
                }
            }
        }

        // print the all prime number
        for(int i = 2; i<primes.length; i++){
            if(!primes[i])System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        allPrimes(200);
    }
}
