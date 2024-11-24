package CollectionFramework;

enum TracfficLight{
    RED("STOP") , BLUE("MOVE") , GREEN("MOVE") , YELLOW("SLOW DOWN");
    
    public String actions;
    private TracfficLight(String actions){
        this.actions = actions;
    }
}

public class Enums {
    public static void main(String[] args) {
        TracfficLight signal = TracfficLight.BLUE;
        System.out.println(signal.actions);
        TracfficLight currentSignal = TracfficLight.valueOf("RED");
        String colr = signal.toString();
        System.out.println(currentSignal);
        System.out.println(colr);
    }
}
