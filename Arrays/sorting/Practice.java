package Arrays.sorting;

public class Practice {

    // function to sort array in descending order using bubble sort;
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 1 ; i<n ; i++){
            for(int j = 0 ; j<n-i ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

     // function to sort array in descending order using selection sort;
     public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i<n-1 ; i++){
            int maxpos = i;
            for(int j= i+1; j<n ; j++){
                if(arr[maxpos] < arr[j]){
                    maxpos = j;
                }
            }

            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
        }
     }

     // function to sort array in descending order using insertion sort;
     public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i = 1 ; i<n ; i++){
            int prev = i-1;
            int key = arr[i];
            while (prev >=0 && key > arr[prev]) {
                arr[prev+1]  = arr[prev];
                prev--;
            }

            arr[prev+1] = key;

        }
     }

     // function to sort array in descending order using count sort;
     public static void countSort(int arrr[]){
        int n = arrr.length;
        int maxEle = Integer.MIN_VALUE;
        for(int i : arrr){
            maxEle = Math.max(i, maxEle);
        }
        int count[] = new int[maxEle+1];

        // creating count array
        for(int i : arrr){
            count[i]++;
        }

        int j = 0;
        for(int i = count.length-1 ; i>= 0 ; i--){
            while (count[i]>0) {
                arrr[j] = i;
                count[i]--;
                j++;
            }
        }
     }
    public static void main(String[] args) {
        int arr[] ={3,6,2,18,7,4,5,3,1};

        // bubbleSort(arr);

        // selectionSort(arr);

        // insertionSort(arr);

        countSort(arr);

        System.out.print("[ ");
        for(int i : arr){
           
            System.out.print(i+ " ");
           
        }
        System.out.print("]");
    }
}
