package ZeroKataGame;

public class Player {

    private String Name;
    private char symbol;
    protected Coordinate trackArr[] = new Coordinate[5] ;

    // constructor
    public Player(String Name , char sym){
        this.Name = Name;
        this.symbol = sym;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
