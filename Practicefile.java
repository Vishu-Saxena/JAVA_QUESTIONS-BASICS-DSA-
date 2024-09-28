import java.util.Scanner;
import OOPS.Practice;

/**
 * Practice
 */
public class Practicefile {
// function that calculates the Greatest Common Divisor of 2 numbers. 
    static void gc(int a , int b){
        while (a!=b) {
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }

        System.out.println(a);
        
    }
// program to print Fibonacci series of n terms

    static void Fibonacci(){
        Scanner s= new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = s.nextInt();

        int a = 0 ;
        int b = 1;

        for(int i = 0 ; i < num ; i++){
            System.out.print(b + " ");
            int c = a+b;
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mansi Saxena");
        StringBuilder sb2 = new StringBuilder("Mansi Saxena");
        System.out.println(sb.length());
        System.out.println(sb.charAt(4));
        System.out.println(sb.indexOf("an"));
        System.out.println(sb.capacity());
        System.out.println(sb.lastIndexOf("a"));
        System.out.println(sb.isEmpty());
        System.out.println(sb.compareTo(sb2));
        sb.setCharAt(5, 'y');
        System.out.println(sb);

       
    }
}