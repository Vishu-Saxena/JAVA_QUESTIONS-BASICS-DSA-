package Recursion3;

public class Subseq {

    public static String[] subseq(String str){
        // base is when string is emplty then return a string array with empty string
        if(str.length() ==0){
            String ans[] = {""};
            return ans;
        }

        // running recursion on smaller problem
        String[] smallAns = subseq(str.substring(1));
        String ans[] = new String[smallAns.length*2];

        // copying all the element of smallAns to new ans array
        int k =0;
        for(int i =0; i<smallAns.length ; i++){
            ans[k] = smallAns[i];
            k++;
        }
        // now appending the first character of string to ans []
        for(int i =0 ; i<smallAns.length ; i++){
            ans[k] = str.charAt(0)+smallAns[i];
            k++;
        }
        return ans;
    }

    public static void printArr(String[]arr){
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr= subseq("xyz");
        printArr(arr);

    }
    
}