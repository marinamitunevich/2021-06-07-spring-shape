package telra.homework.entity;

public abstract class Shape {

    private char symbol;

    public Shape(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void draw(){
        System.out.println(symbol);
    }
}
