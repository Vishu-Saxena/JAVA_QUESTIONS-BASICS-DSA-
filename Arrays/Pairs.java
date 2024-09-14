package Arrays;

public class Pairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        for(int i = 0; i<arr.length ; i++){
            for(int j=i+1 ; j < arr.length ; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")" );
            }
            System.out.println();
        }
        System.out.println("total number of pairs : " + (arr.length*(arr.length-1))/2);
    }
}
