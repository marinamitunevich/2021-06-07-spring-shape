package telra.homework.entity;

import java.util.List;

public class Picture extends Shape{

    private List<Shape> shapeList;

    public Picture(char symbol, List<Shape> shapeList) {
        super(symbol);
        this.shapeList = shapeList;
    }

    @Override
    public void draw(){

        System.out.println("           Picture:");

        for (int i = 0; i < 30; i++) {
            System.out.print(super.getSymbol() + " ");
        }
        System.out.println();

        for (Shape a : shapeList) {
            a.draw();
        }

        for (int i = 0; i < 30; i++) {
            System.out.print(super.getSymbol() + " ");
        }
        System.out.println();
    }
}
