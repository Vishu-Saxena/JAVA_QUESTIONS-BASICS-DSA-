package Recursion2.assignment;

public class StringToInt {

    public static int strToInt(String str){
        if(str.length()==0){
            return 0;
        }
        if(str.length()==1){
            return (int)str.charAt(0)-48;
        }
        int res =(int)(((int)str.charAt(0) - 48)*Math.pow(10, str.length()-1)) + strToInt(str.substring(1)) ;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(strToInt("1234"));
        }
}
