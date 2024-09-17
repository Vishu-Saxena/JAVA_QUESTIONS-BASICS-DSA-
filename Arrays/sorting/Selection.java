package Arrays.sorting;

public class Selection {

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i =0 ; i<n-1 ; i++){
            int minPos = i;
            for(int j =i+1 ; j < n ; j++ ){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,8,1,9,3};
        selectionSort(arr);
        System.out.print("[ ");
        for(int i : arr){
           
            System.out.print(i+ " ");
           
        }
        System.out.print("]");

    }
}
