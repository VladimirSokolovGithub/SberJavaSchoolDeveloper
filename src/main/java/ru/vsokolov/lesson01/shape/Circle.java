package ru.vsokolov.lesson01.shape;

public class Circle extends Shape {
    private static final String name = "Круг";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return name;
    }
}
