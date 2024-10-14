package Recursion3.assignment;
import java.util.HashSet;

public class Permutations {
    public static String[] permutations(String str ){
        if(str.length() ==0){
            String[] ans = {""};
            return ans;
        }
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<str.length() ; i++){
            char curChar = str.charAt(i);
            String[] tempRes = permutations(str.substring(0, i) + str.substring(i+1));
            for(int k =0 ; k<tempRes.length; k++){
                set.add(curChar+tempRes[k]);
            }
        }
        String[] finalRes = set.toArray(new String[set.size()]);
        return finalRes;
        
    }
    public static void main(String[] args) {
        String[] palinAns = permutations("abac");
        for(int i =0 ; i<palinAns.length ; i++){
            System.out.println(palinAns[i]);
        }
    }

}
