package Recursion2.Strings;

public class ReplaceChar {
    public static String replaceChar(String str , char toReplace , char replaceWith){
        if(str.length() == 0){
            return str;
        }
        StringBuilder sb= new StringBuilder("");
        if(str.charAt(0) == toReplace){
            sb.append(replaceWith);
        }else{
            sb.append(str.charAt(0));
        }
        return sb + replaceChar(str.substring(1), toReplace, replaceWith);
    }
    public static void main(String[] args) {
        System.out.println(replaceChar("mansisaxena" , 'a' , 'b'));
    }
}
