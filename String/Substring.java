package String;

public class Substring {

    public static String subString(String str , int start , int end){
        String substr = new String();
        for(int i = start ; i<end ; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String name = "Mansi Saxena";
        System.out.println(subString(name, 1, 7));
    }
}
