package Arrays.Practice;
import java.util.*;;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the lenght of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i< n ; i++){
            System.out.print("enter " + i+1 + " element : ");
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)){
                System.out.println("true");
                return;
            }else{
                set.add(i);
            }
        }
        System.out.println("false");
    }
}
