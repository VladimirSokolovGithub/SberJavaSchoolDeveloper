package ru.vsokolov.lesson01.shape;

public class Rectangle extends Shape {
    private static final String name = "Прямоугольник";

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getSquare() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String getName() {
        return name;
    }

}
