package String;

public class Capitalise {

    public static void toCapitalise(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "mansi saxena";
        toCapitalise(str);
    }
}
