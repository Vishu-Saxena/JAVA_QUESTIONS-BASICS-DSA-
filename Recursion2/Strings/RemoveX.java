package Recursion2.Strings;

public class RemoveX {

    public static String removeX(String str){
        if(str.length() == 0){
            return str;
        }

        String ans = "";
        if(str.charAt(0) != 'x'){
            ans +=str.charAt(0);
        }
        return ans + removeX(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(removeX("xxx"));
    }
}
