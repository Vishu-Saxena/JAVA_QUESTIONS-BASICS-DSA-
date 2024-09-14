package Arrays;

public class Reversing {

    public static void reverse(int arr[] ){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6};
        reverse(num);
        for(int i : num){
            System.out.println(i);
        }
    }
}
