package Recursion3.assignment;

public class CheckABB {

    public static boolean check(String str){
        if(str.length() ==0){
            return true;
        }
        if(str.charAt(0) == 'a'){
            if(str.length()>=3 && str.substring(1, 3).equals("bb")){
                return check(str.substring(3));
            }else{
               return check(str.substring(1));
            }
        }else{
            return false;
        } 
    }
    public static void main(String[] args) {
        System.out.println(check("abbabbb"));
    }
}
