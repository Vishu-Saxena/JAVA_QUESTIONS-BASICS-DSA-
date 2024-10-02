package Generics;

public class Methods {

    public static <T> void printArray(T arr[]){
        for(T i : arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Integer num[] = {1,2,3,4,5,6,7,8};
        printArray(num);
    }
}
