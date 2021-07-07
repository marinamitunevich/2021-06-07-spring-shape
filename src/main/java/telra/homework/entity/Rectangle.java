package telra.homework.entity;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(char symbol, int width, int height) {
        super(symbol);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {

        System.out.println("Rectangle:");
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    System.out.print(super.getSymbol() + " ");
                else
                    System.out.print("  ");

            }
            System.out.println();

        }
    }
}
