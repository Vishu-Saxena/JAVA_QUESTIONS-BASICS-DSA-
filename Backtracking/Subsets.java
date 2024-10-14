package Backtracking;

public class Subsets {
    public static void subsets(String str , String ans , int indx){
        if(indx == str.length()){
            System.out.println(ans);
            return ;
        }
        // else do work to find subsets
        // for every character we have a choice whether to include it or not include in subsets
        // if choice is yes
        subsets(str, ans+str.charAt(indx), indx+1);
        // if choice is no
        subsets(str, ans, indx+1);

    }
    public static void main(String[] args) {
        subsets("abc", "", 0);
    }
}
