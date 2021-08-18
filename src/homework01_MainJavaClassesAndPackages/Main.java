package homework01_MainJavaClassesAndPackages;

public class Main {

    public static void main(String[] args) {
// Сортировка пузырьком
        System.out.println("Задание №1 - Сортировка пузырьком");

        BubbleSort sort = new BubbleSort(10);
        sort.insertElement();
        sort.arraysSort();

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
        System.out.println("температура 40 градусов по Цельсию равна температуре " + celsiusConverter.convertCelsiusToFahrenheit(40) + "по Фаренгейту");
        System.out.println("температура 40 градусов по Цельсию равна температуре " + celsiusConverter.convertCelsiusToKelvin(40) + "по Кельвину");
    }
}
