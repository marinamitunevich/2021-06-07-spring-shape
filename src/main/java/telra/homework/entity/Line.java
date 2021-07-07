package telra.homework.entity;

public class Line extends Shape{
    private int length;

    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    @Override
    public void draw(){

        System.out.println("Line: ");
        for (int i = 0; i < length; i++) {

            System.out.print(super.getSymbol() + " ");

        }
        System.out.println();

    }
}
