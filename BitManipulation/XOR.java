package BitManipulation;

public class XOR {

    private static int xor(int n){
        if(n%4 == 0){
            return n;
        }else if(n%4 == 1){
            return 1;
        }else if(n%4 == 2){
            return n+1;
        }else{
            return 0;
        }
    }

    // function to find the xor of all number between a nad b

    private static int xorBetween(int a , int b){
        return xor(b)^xor(a-1);
    }

    public static void main(String[] args) {
        System.out.println(xor(0));
        System.out.println(xorBetween(3, 9));
    }
}