package Arrays.sorting;

public class Bubble {

    public static void bubbleSort(int arr[]){
        // BUBBLE SORT WITH O(N^2) TIME COMPLEXITY IN ALL CASES
        int n = arr.length;
        for(int i = 1 ; i<n ; i++){
            for(int j = 0 ; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void optimisedBubbleSort(int arr[]){
        // BUBBLE SORT WITH O(N) TIME COMPLEXITY IN BEST CASE
        int n = arr.length;
        for(int i = 1 ; i<n ; i++){
            int swap = 0;
            for(int j = 0 ; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            // if in first complete iteration the swap remains 0 then this means that array is sorted and we can simply return
            if(swap == 0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={4,2,8,1,0};
        // bubbleSort(arr);
        optimisedBubbleSort(arr);

        System.out.print("[ ");
        for(int i : arr){
           
            System.out.print(i+ " ");
           
        }
        System.out.print("]");
    }
}
