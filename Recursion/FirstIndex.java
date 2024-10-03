package Recursion;

public class FirstIndex {
    public static int firstIndex(int arr[] , int key , int startIndex ){
        if(startIndex == arr.length-1 && arr[startIndex]!=key){
            return-1;
        }
        if(arr[startIndex] == key){
            return startIndex;
        }
        return firstIndex(arr, key, startIndex+1);
    }

    public static int firstIndex(int arr[], int key){
        return firstIndex(arr, key ,0);
    }

    // recursice funtion to find the last index of given element in array
    
    public static int lastIndex(int arr[] , int key , int lastIndx){
        if(lastIndx == 0 && arr[lastIndx]!=key){
            return-1;
        }
        if(arr[lastIndx] == key){
            return lastIndx;
        }
        return lastIndex(arr, key, lastIndx-1);
    }
    public static int lastIndex(int arr[], int key){
        return lastIndex(arr, key ,arr.length-1);
    }

    // function to print all the indices of given element in array
    public static void allIndex(int arr[] , int key , int startindex ){
        if(startindex == arr.length){
            return ;
        }

        if(arr[startindex] == key){
            System.out.print(startindex + " ");
        }
        allIndex(arr, key, startindex + 1);
    };
    public static void main(String[] args) {
        int arr[] = {9, 8, 4, 8};
        System.out.println(firstIndex(arr, 8 , 0));
        System.out.println(lastIndex(arr, 8));
        allIndex(arr, 8, 0);
        
    }
}
