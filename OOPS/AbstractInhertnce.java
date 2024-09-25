package OOPS;

abstract class Animal{
    abstract void eat();

    String color;

    // constructor
    public Animal(){
        color = "brown";
        System.out.println("inside animal constructor");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eat veg+nonveg");
    }
    // constructor
     public Dog(){
        System.out.println(this.color);
        System.out.println("inside Dog constructor");
    }
}

class GermerSheferd extends Dog{
    void eat(){
        System.out.println("eat non veg");
    }

    void changeColor(){
        color = "brown and black";
    }
    // constructor
    public GermerSheferd(){
        System.out.println("inside GS constructor");
    }
    
}

public class AbstractInhertnce {

    public static void main(String[] args) {
        GermerSheferd gs = new GermerSheferd();
        gs.changeColor();
        System.out.println(gs.color);

    }
}
