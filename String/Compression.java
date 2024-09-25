package String;

public class Compression {
    public static void strCompression(String str){
        StringBuilder sb = new StringBuilder("");
        int count = 1 ;
        
        for(int i = 0 ; i<str.length() ; i++){
           while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
           }
           if(count > 1){
            sb.append(str.charAt(i) + ""+count);
            count = 1;
           }else{
            sb.append(str.charAt(i));
           }
           
        }
        
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "aaabbbbcccdbbc";
        strCompression(str);
    }
}
