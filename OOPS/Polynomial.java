package OOPS;
import OOPS.DynamicArray;

public class Polynomial {

    private int polyArr[] = new int[5];
    private int pointer;

    // default constructor
    public Polynomial(){
        polyArr = new int[5];
    }
    // parametrized constructor
    private Polynomial(int newSize){
        int temp[] = polyArr;
        polyArr = new int[newSize];
        for(int i =0; i<newSize ; i++){
            polyArr[i] = temp[i];
            pointer++;
        }
    }
    // function to find the size of polyarray
    public int size(){
        int count =0;
        return 0;
    }
    // function to set degree and coefficients
    public void setPoly(int deg  ,  int coefficients){
        if(deg+1 > this.polyArr.length){
            new Polynomial(deg+1);
        }
        this.polyArr[deg] = coefficients;
        this.pointer = deg+1;

    }

    // function to get add two polynomial
    public static Polynomial add(Polynomial p1, Polynomial p2){

        int maxlen = Math.max(p1.pointer, p2.pointer);

        Polynomial p3 = new Polynomial();

        for(int i =0 ; i<maxlen ; i++){
            p3.setPoly(i, p1.polyArr[i]  + p2.polyArr[i] );
        }
        return p3;
    }
    // function to get multiply two polynomial
    public static Polynomial multiply(Polynomial p1, Polynomial p2){
        //calculating last index of p3 which is equal to the sum of highest degree of p1 and p2
        int lastIndex = p1.pointer +p2.pointer;
        System.out.println("last index" + lastIndex);
        Polynomial p3 = new Polynomial(lastIndex+1);
        

        for(int i = 0 ; i < p1.pointer ; i++){
           for(int j = 0; j<p2.pointer ; j++){
             int res = p1.polyArr[i]*p2.polyArr[j];
             System.out.println(res + " " + "index " + (int)(i+j));
            // //  incase if there is already an entry at that index then add it to new entry and then store
            if(p3.polyArr[i+j] != 0){
                res += p3.polyArr[i+j];
            }
             p3.setPoly(i+j, res);
             
           }
        }
        return p3;
    }

    // function to print polynomial
    public void print(){
        for(int i = 0 ; i<pointer ; i++){
            System.out.print(polyArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Polynomial p = new Polynomial();
        p.setPoly(0, 3);
        p.setPoly(1, 4);
        p.setPoly(3, 1);
        p.print();
        Polynomial p2 = new Polynomial();
        p2.setPoly(0, 3);
        p2.setPoly(1, 4);
        p2.setPoly(2, 1);
        p2.print();

        Polynomial p3 = Polynomial.add(p, p2);
        Polynomial p4 = Polynomial.multiply(p, p2);
        p3.print();
        p4.print();
        
    }
}
