package BasicMath;

public class Factors {
    private static void printfactors(int num){
        for(int i=1; i<= Math.floor(Math.sqrt(num)) ; i++){
            if(num%i==0)System.out.print(i + " "+ (num/i==i?"":num/i) + " ");
        }
    }
    public static void main(String[] args) {
        printfactors(81);
    }
}
