package homework01_MainJavaClassesAndPackages;

public class Square extends Shape {
    private static final String name = "Квадрат";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side + side + side + side;
    }

    @Override
    public String getName() {
        return name;
    }
}
