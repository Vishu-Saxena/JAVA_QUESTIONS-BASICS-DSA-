
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Practicefile {
    public static int power(int a , int n){
        // base case 
        if(n == 0){
            return 1;
        }
        return a*power(a, n-1);
    }
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }

    public static int numberOfdigits(int num){
        if(num <=9){
            return 1;
        }
        
        int count = 1+ numberOfdigits(num/10);
        return count;
    }
    public static int fibinaici(int n ){
        if(n ==1 || n ==2){
            // System.out.print(n + " ");
            return 1;
        }
        return fibinaici(n-1)+fibinaici(n-2);
    }

    // sum of array
    public static int sumofArr(int nums[] , int indx){
        if(indx == nums.length-1){
            return nums[indx];
        }

        return nums[indx] + sumofArr(nums, indx+1);
    }
    // check numbr in array
    public static boolean checkNum(int[] num , int indx , int target){
        if(indx == num.length){
            return false;
        }
        if(num[indx]== target){
            return true;
        }
        return checkNum(num, indx+1, target);
    }
    // all indices of an element present in array
    public static void allIndices(int[] num , int target , int indx){
        if(indx == num.length){
            return;
        }
        if(num[indx] == target){
            System.out.println(indx);
        }
        allIndices(num, target, indx+1);
    }
    // replace character recursively
    public static String replaceCharFn(String str , int si , String ans , char val){
        if(si == str.length()){
            return ans;
        }
        if(str.charAt(si) == val){
            ans += "X";
        }else{
            ans +=str.charAt(si);
        }
        return replaceCharFn(str, si+1, ans, val);
    }
    // remove duplicates recursively
    public static String removeDuplicate(String str , String ans, int si){
        if(si==str.length()){
            return ans;
        }
        if(!ans.contains( Character.toString(str.charAt(si)))){
            ans +=str.charAt(si);
        }
        return removeDuplicate(str, ans, si+1);

    }
    // check whether array is sorted or not
    public static boolean isSorted(int[]arr, int indx){
        if(indx==arr.length-1){
            return true;
        }
        if(arr[indx]>arr[indx+1]){
            return false;
        }
        return isSorted(arr, indx+1);

    }

    // return all the indices of target element
    public static ArrayList<Integer> allIndice(int[]arr , int indx , int target){
        ArrayList<Integer>list = new ArrayList<>();
        if(indx == arr.length){
            return list;
        }
        if(arr[indx] == target){
            list.add(indx);
        }
        ArrayList<Integer>temp = new ArrayList<>();
        temp =  allIndice(arr, indx+1, target);
        list.addAll(temp);
        return list;
    }

    // code fro binary search
    public static int binarySearch(int arr[] , int si , int ei , int target){
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid]>target){
            ei = mid-1;
        }else{
            si = mid+1;
        }
        return binarySearch(arr, si, ei, target);
    }

    // search in rotated array
    public static int search(int[]arr , int target , int si , int ei){
        if(si > ei){
            return -1;
        }
        // find mid
        int mid = (si+ei)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[si] <= arr[mid]){//left side of array is sorted
            // check whether target lies on sorted side or not
            if(target>=arr[si] && target<=arr[mid]){
                // if yes then run binary search for this part
                return binarySearch(arr, si, mid-1, target);
            }else{
                return search(arr, target, mid+1, ei);
            }
        }else{//left side of array is sorted 
            // check whether target lies on sorted side or not
            if(target>=arr[mid] && target<=arr[ei]){
                // if yes then run binary search for this part
                return binarySearch(arr, mid+1, ei, target);
            }else{
                return search(arr, target, si, mid-1);
            }
        }
    }

    // merge sort
    public static void divide(int[]arr , int si , int ei){
        if(si == ei){
            // System.out.println(arr[si]);
            return;
        }
        // divide
        int mid = (si+ei)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        // conquer
        conquer(arr, si, mid, ei);

    }
    // merging arrays
    public static void conquer(int[]arr , int si , int mid , int ei){
        int[] temp = new int[ei-si+1];
        int k =0;//iterator for temp[]
        int i =si;//iterator for left array
        int j = mid+1;//iterator right array
        while (i<=mid && j<=ei) {
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //incase some element left on left side of array
        while (i<=mid && k<temp.length) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        //incase some element left on right side of array
        while (j<=ei && k<temp.length) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        // copying the sorted array to arr
        for(k=0 , i = si; k<temp.length ; k++,i++){
            arr[i] = temp[k];
        }
    }


    // recursive function to find the subsequences
    static String[] subseq(String str){
        if(str.length()==0){
            String[] ans = {""};
            return ans;
        }
        //every element of string has two choice 1)to be the part of subsequence and 2)to not to be the part of subseq
        char c = str.charAt(0);
        String[]res1 = subseq(str.substring(1));
        String[]finalres = new String[res1.length*3];

        // copy all the element of res1 to finalres
        int k =0;
        for(int t = 0 ; t<res1.length; t++){
            finalres[k] = res1[t];
            k++;
        }
        // now append first character to all the elements of res1 and add it to finalres
        for(int t = 0 ; t<res1.length ; t++){
            finalres[k] = c+res1[t];
            k++;
        }
        // now append ASCII value of first character to all the elements of res1 and add it to finalres
        for(int t = 0 ; t<res1.length ; t++){
            int asci = c+0;
            finalres[k] = asci+res1[t];
            k++;
        }
        return finalres;
    }

   

    public static void main(String[] args) {
        // System.out.println(power(3, 4));.
        // printNum(4);
        // System.out.println(numberOfdigits(1298763));
        // System.out.println(fibinaici(5));
        // int num[] = {1,2,3,4};
        // System.out.println(sumofArr(num, 0));
        // System.out.println(checkNum(num, 0, 9));
        // allIndices(num, 3, 0);
        // String str = "aabcav";
        // // String ans = "";
        // System.out.println(removeDuplicate(str, "", 0));
        // int[] arr = {9,8,7,6,5,4,3,2,1};
        // // System.out.println(search(arr, 1, 0, 7));
        // divide(arr, 0, arr.length-1);
        // System.out.println( Arrays.toString(arr));
        String[]res = subseq("abc");
        System.out.println(Arrays.toString(res));
        
    }
}