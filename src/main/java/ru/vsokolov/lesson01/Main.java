package ru.vsokolov.lesson01;

import ru.vsokolov.lesson01.converter.CelsiusConverter;
import ru.vsokolov.lesson01.shape.*;
import ru.vsokolov.lesson01.sort.BubbleSort;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
// Сортировка пузырьком
        System.out.println("Задание №1 - Сортировка пузырьком");

        int[] array = new int[10];

        BubbleSort.insertElement(array);
        BubbleSort.arraysSort(array);

// Иерархия объектов Circle, Rectangle, Triangle, Square
        System.out.println();
        System.out.println("Задание №2 - Иерархия объектов Circle, Rectangle, Triangle, Square");
        System.out.println();

        Shape[] shapes = {new Circle(5), new Triangle(5, 8, 5), new Rectangle(4, 8), new Square(4)};

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + ": периметр = " + shape.getPerimeter() + "; площадь = " + shape.getSquare());
        }
        System.out.println();

/* Реализовать конвертеры температуры. Считаем, что значения будут поступать по шкале Цельсия,
конвертеры должны преобразовывать значение в свою шкалу */
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        int temp = -300;
        System.out.println("температура " + temp + " градусов по Цельсию равна температуре " + celsiusConverter.convertCelsiusToFahrenheit(temp) + " по Фаренгейту");
        System.out.println("температура " + temp + " градусов по Цельсию равна температуре " + celsiusConverter.convertCelsiusToKelvin(temp) + " по Кельвину");
    }
}
