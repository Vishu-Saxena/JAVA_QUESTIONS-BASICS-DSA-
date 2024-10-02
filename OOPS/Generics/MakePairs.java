package Generics;

public class MakePairs {

    public static <T> void printArray(T arr[]){
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Pairs<Integer , Integer> p1 = new Pairs<>();
        Pairs<Integer , Integer> p3 = new Pairs<>();
        p1.setPair(3, 5);
        p3.setPair(4, 6);
        // p1.show();
        Pairs<Pairs<Integer , Integer> , Integer> p4 = new Pairs<>();
        p4.setPair(8, p3);
        System.out.println(p4.getFirst());
        System.out.println(p4.getSecond().getFirst());
        System.out.println(p4.getSecond().getSecond());
        // Pairs <Integer , Integer>  =  p4.getSecond();
        Pairs<String , String> p2 = new Pairs<>();
        p2.setPair("mansi", "Saxena");
        p2.show();

        Integer num[] = new Integer[10];
        for(int i =0; i<10 ; i++){
            num[i] = i+1;
        }
        String s[] = new String[5];
        for(int i =0; i<5 ; i++){
            s[i] = "mansi";
        }
        Pairs p[] = {p1 , p2 , p3};
        printArray(p);
        printArray(num);
        printArray(s);
    }
}
