package Recursion2;

public class MergeSort{

    public static void merge(int arr[] , int si , int mid , int ei){
        System.out.println("length of array : " + arr.length);
        System.out.println("starting index : " +  si);
        System.out.println("ending index : " +  ei);
        System.out.println("mid index : " +  mid);
        int temp[] = new int[ei-si+1]; //making a temp array 
        int i =si ;//iterator for left array
        int j =mid+1; //iterator for right array
        int k=0; // iterator for temp array
        
        while (i<=mid && j<=ei ) {
            if(arr[i] > arr[j]){
                temp[k] = arr[j];
                j++;
            }else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        // incase some element left in left side of array
        while (i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        // incase some element left in right side of array
        while (j<=ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copying temp to original array
        for(k=0 , i = si ; k<temp.length ; k++ , i++){
            arr[i] = temp[k];
        }
        printArr(temp);

    }

    public static void mergeSort(int arr[] , int si , int ei){
        if(si >= ei){
            // System.out.print(arr[si]);
            return;
        }
        int mid = si + (ei - si) / 2; 
        mergeSort(arr , si , mid );
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    
    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,8,3};
        mergeSort(arr, 0, arr.length-1);
        // printArr(arr);
    }
}
