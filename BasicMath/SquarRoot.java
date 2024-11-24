package BasicMath;

public class SquarRoot {

    // function that finds the root of proper square numbers
    private static int root(int num){
        int s = 0;
        int e = num;
        int mid = 0;
        while(s<=e){
            mid = (s+e)/2;
            if(mid*mid == num){
                return mid;
            }else if(mid*mid > num){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        System.out.println("Not a perfect square");
        return 0;
    }

    // function to finf the square root any number with given precision
    private static double precisionRoot(int num , int precision){
        int s = 0;
        int e = num;
        int mid = 0;
        while(s<=e){
            mid = (s+e)/2;
            if(mid*mid == num){
                return mid;
            }else if(mid*mid > num){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }

        if(mid*mid > num)mid--;

        double root = mid;
        double incre = 0.1;
        for(int prec = 0; prec<precision; prec++){

            
            while(root*root <=  num){
                
                root += incre;
            }

            root-=incre;
            incre/=10;

        }
        return root;
    }
    public static void main(String[] args) {
        // System.out.println(root(45));
        System.out.println( precisionRoot(49 ,3));
    }
}
