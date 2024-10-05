package Recursion2.assignment;

public class PairStar {
    public static String pairStar(String str){
        if(str.length() <=1){
            return str;
        }
        String res="";
        if(str.charAt(0)==str.charAt(1)){
            res  +=  str.charAt(0)+"*" + pairStar(str.substring(1));
        }else{
            res += str.charAt(0)+pairStar(str.substring(1));
        }
        
        return res;
    }
    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
    }
}
