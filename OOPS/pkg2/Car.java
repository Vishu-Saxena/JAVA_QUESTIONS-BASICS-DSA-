package OOPS.pkg2;



class Car1{
    private int seat;
    private int speed;
    
    public Car1(int speed, int seat){
        this.seat = seat;
        this.speed = speed;
        System.out.println("this is car");
    }
}

class Audi extends Car1{
    Audi(int speed , int seat){
        super(speed, seat);
        System.out.println("this is para audi");
    }

    void Audi(){
        System.out.println("this is def audi");
    }
}

public class Car {
    public static void main(String[] args) {
       Audi a = new Audi(100, 4);
       a.Audi();
       try {
        int num = 4/0;
       } catch (Exception e) {
            System.out.println("Exception caught");
       }catch (ArithmeticeException e) {
            System.out.println("Arithmatice exception caught");
       }
       finally{
        System.out.println("inside finally");
       }
    }
}
