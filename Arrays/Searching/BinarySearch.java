package Arrays.Searching;

public class BinarySearch {

    public static int binarySearch(int num[] , int key){
        int start = 0;
        int end = num.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;
            }else if(num[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int binarySearch(int num[] , int key , int start ,int end){
        
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(num[mid] == key){
                return mid;
            }else if(num[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,8,10};
        int key = 10;
        int res = binarySearch(arr , key);
        System.out.println(res);
    }
}
