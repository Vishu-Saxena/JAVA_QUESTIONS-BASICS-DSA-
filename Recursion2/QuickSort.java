package Recursion2;

public class QuickSort {

    public static void quickSort(int arr[] , int si , int ei){
        // base condtn
        if(si >= ei){
            return;
        }
        // otherwise
        int pivotPosition = partision(arr , si , ei);
        quickSort(arr, si, pivotPosition-1);
        quickSort(arr, pivotPosition+1, ei);
    }
    public static int partision(int arr[] , int si , int ei){
        int pivot = arr[si];
        // count the number of elements greater than pivot
        int count = 0;
        for(int i = si+1 ; i<=ei;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotPosition = si+count;
        // put the pivot at it right place
        int temp = arr[si];
        arr[si] = arr[pivotPosition];
        arr[pivotPosition] = temp;
        // now bring all the element smller than pivot to it's left side and greater to it's right side
        int i = si;
        int j = ei;
        while (i<pivotPosition && j>pivotPosition) {
            if(arr[i]>arr[pivotPosition] && arr[j]<arr[pivotPosition]){
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
                j--;
                i++;
            }else if(arr[i]<=arr[pivotPosition]){
                i++;
            }else if(arr[j] >= arr[pivotPosition]){
                j--;
            }
        }
        return pivotPosition;
    }

    // print arr
    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,2,5,5,4,1};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
