package Recursion3.assignment;

public class BinarySearch {

    public static int binarySearch(int arr[] , int si , int li , int key){
        // incase no element doesnot exist
        if(si > li){
            return -1;
        }
        int mid =( si+li)/2;
        // System.out.println(mid);
        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] < key){
            return binarySearch(arr, mid+1, li, key);
        }else{
           return binarySearch(arr, si, mid-1, key);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int a = binarySearch(arr, 0, arr.length-1, 5);
        System.out.println(a);
    }
}
