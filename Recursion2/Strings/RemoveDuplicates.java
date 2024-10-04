package Recursion2.Strings;

public class RemoveDuplicates {
    public static String removeCosecutiveDuplicate(String str){
        if(str.length() ==1){
            return str;
        }
        String ans = "";
        if(str.charAt(0) ==  str.charAt(1)){
            return ans + removeCosecutiveDuplicate(str.substring(1));
        }else{
            ans += Character.toString(str.charAt(0));
            return ans + removeCosecutiveDuplicate(str.substring(1));
        }
       
    }
    public static void main(String[] args) {
        System.out.println(removeCosecutiveDuplicate("aaabbddccd"));
    }
}
