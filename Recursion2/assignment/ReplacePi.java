package Recursion2.assignment;

public class ReplacePi {

    public static String replace(String str){
        if(str.length() <=1){
            return str;
        }
        String Ans = "";
        if(str.charAt(0)=='p'&& str.charAt(1)=='i'){
            Ans +="3.14";
            return Ans + replace(str.substring(2));
        }else{
            Ans += str.charAt(0);
            return Ans + replace(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(replace("pipipi"));
    }
}
