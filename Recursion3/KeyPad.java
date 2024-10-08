package Recursion3;

public class KeyPad {

    public static String[] singleDigitOptn(int n){

        if(n <= 1 || n>=10){
            System.exit(0);
            String oupt[]= {"1or0"};
            return oupt;
        }else if(n==2){
            String[] output = {"a" , "b" , "c"};
            return output;
        }else if(n==3){
            String[] output = {"d" , "e" , "f"};
            return output;
        }else if(n==4){
            String[] output = {"g" , "h" , "i"};
            return output;
        }else if(n==5){
            String[] output = {"j" , "k" , "l"};
            return output;
        }else if(n==6){
            String[] output = {"m" , "n" , "o"};
            return output;
        }else if(n==7){
            String[] output = {"p" , "q" , "r" , "s"};
            return output;
        }else if(n==8){
            String[] output = { "t" , "u" , "v"};
            return output;
        }else{
            String[] output = {"w" , "x" , "y" , "z"};
            return output;
        }
    }

    public static String[] keypad(int num){
        if(num < 10){
            return singleDigitOptn(num);
        }
        String[] smallAns = keypad(num/10);

        String[] optns  = singleDigitOptn(num%10);
        
        String[] finalArr = new String[smallAns.length * optns.length];
        int k=0;
        for(int i =0 ; i<smallAns.length;i++){
            for(int j =0 ; j<optns.length; j++){
                finalArr[k] = smallAns[i]+optns[j];
                k++;
            }
        }
        return finalArr;
    }
    public static void main(String[] args) {
        
        String[] seq = keypad(2235);
        System.out.println(seq.length);
        for(int i =0 ; i<seq.length ;i++){
            System.out.print(seq[i] + " ");
        }
        
    }

}
