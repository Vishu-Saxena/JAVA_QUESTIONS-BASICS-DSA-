package Arrays.sorting;

public class Insertion {

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i =1 ; i <n ; i++){
            int cur = arr[i];
            int prevIndx = i-1;

            while (prevIndx >= 0 && cur < arr[prevIndx]) {
                arr[prevIndx+1]= arr[prevIndx];
                prevIndx--;
            }
            arr[prevIndx+1] = cur;
         }
    }
    public static void main(String[] args) {
        int arr[] = {1,24,5,2,90 , 3};
        insertionSort(arr);
        System.out.print("[ ");
        for(int i : arr){
           
            System.out.print(i+ " ");
           
        }
        System.out.print("]");
    }
}
