package String;
import java.util.*;;

public class Paplindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String ");
        String str = sc.nextLine();
        // code to check whether it is palindrome or not
        int start = 0;
        int end = str.length()-1;
        boolean palindrome = true;
        while (start<=end) {
            if(str.charAt(start) != str.charAt(end)){
                palindrome = false;
                System.out.println("not a Palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("palindrome");
    }
}
