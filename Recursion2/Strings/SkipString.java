package Recursion2.Strings;

public class SkipString {

    static String skipStr(String str ,  String strToskip){
        // base condition
        if(str.length()==0 || str.length() < strToskip.length() || !str.contains(strToskip)){
         
            return str;
        }
        // find the index of strtoskip present in str
        if(str.substring(0, strToskip.length()).equals(strToskip)){
            return skipStr(str.substring(strToskip.length()), strToskip); 
        }else{
            return str.substring(0,1) + skipStr(str.substring(1), strToskip);
        }
    }
    public static void main(String[] args) {
        String str = "Mansian";
        System.out.println(skipStr(str, "an"));
    }
}
