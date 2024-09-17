package Arrays.sorting;

public class Count {
     public static void countSort(int arr[]){
        int n = arr.length;
        // finding the max element of array
        int maxEle = Integer.MIN_VALUE;
        for(int i = 0; i<n ; i++){
            maxEle = Math.max(maxEle, arr[i]);
        }

        // creating count arr
        int count[] = new int[maxEle+1]; // maxEle+1 beacause if maxelement is 4 then we have to form an array from index 0 to 4 means total 5 elements
        // storing frequency of element stored is given array to index equal to it's value
        for(int i : arr){
            count[i]++;
        }

        // sorting the given array using count array
        int j = 0;
        for(int i = 0 ; i<count.length ; i++){
            while (count[i]>0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
     }
    

    public static void main(String[] args) {

        int arr[] = {4,4,2,3,5,2,1,5};
        countSort(arr);
        System.out.print("[ ");
        for(int i : arr){
           
            System.out.print(i+ " ");
           
        }
        System.out.print("]");
        
    }
}
