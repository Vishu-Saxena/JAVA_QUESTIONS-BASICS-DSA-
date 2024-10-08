import java.util.Scanner;

import String.StringBuilders;;
public class Practicefile {

    public static int tilling(int width){
        if(width==0 || width==1){
            return 1;
        }

        int totalWays;

        // for every tile we have two choices either place it verticaly or horizontaly
        int verticalWay = tilling(width-1);
        int horizontaly = tilling(width-2);
        totalWays = verticalWay + horizontaly;
        return totalWays;
    
    }

    public static String reverse(String str){
        if(str.length() == 0 || str.length() ==1){
            return str;
        }
        String result = str.charAt(str.length()-1)+reverse(str.substring(0 , str.length()-1));
        return result;
    } 

    public static String removeDuplicates(String str){
        if(str.length() == 0){
            return str;
        }
        
        String result = removeDuplicates(str.substring(1));
       if(!result.contains( Character.toString(str.charAt(0)))){
            result += str.charAt(0);
       }
             
       return result;
    }

    public static void main(String[] args) {
        // System.out.println(tilling(4));4
        // System.out.println(removeDuplicates(reverse("aababc")));
        // System.out.println(reverse("null"));

        int a  = 12;
        int b =5;
        int c = 10;
        int res = a>b ? (a<c ? a : b > c ? b : c) : b<c? b : a>c?a :c ;
        System.out.println(res);

    }
}