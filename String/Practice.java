package String;

import java.util.*;;

public class Practice {
    public static void lowercaseVowel(String str){
        int count = 0;
        for(int i =0 ; i<str.length() ; i++){
            if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='o' || str.charAt(i) =='u' || str.charAt(i) =='i' ){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void anagram(String str1 , String str2){
        if(str1.length() == str2.length()){
            for(int i = 0 ; i<str1.length() ; i++){
                boolean check = false;
                for(int j = 0 ; j < str2.length() ; j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        check = true;
                    }
                }
                if(check == false){
                    System.out.println(check);
                    return;
                }
            }
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
    public static void optimisedAnagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            System.out.println("false");
            return;
        }
        char charArr[] = s1.toLowerCase().toCharArray();
        char charArr2[] = s2.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        Arrays.sort(charArr2);
        boolean result = Arrays.equals(charArr, charArr2);
        if(result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
    public static void main(String[] args) {
        String name = "Mansi saxenA";
        lowercaseVowel(name);
        // anagram("race", "caor");
        optimisedAnagram("race", "tare");
    }
}
