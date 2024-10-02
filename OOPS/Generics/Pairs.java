package Generics;

public class Pairs<T , V> {
    V first;
    T second;
    public V getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
        // System.out.println(second);
    }

    public void setPair(V first , T sec){
        this.first = first;
        this.second = sec;
    }
    public void show(){
        System.out.println("( " + this.first+ " , "+ this.second +")");
    }
    public static void main(String[] args) {
        
    }
}
