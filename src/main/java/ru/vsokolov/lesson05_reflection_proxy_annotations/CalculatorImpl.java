package ru.vsokolov.lesson05_reflection_proxy_annotations;


import java.lang.reflect.Proxy;

public class CalculatorImpl implements Calculator {


    //Метод, который вычисляет факториал натурального числа.
    //факториал числа n — это произведение всех натуральных чисел от 1 до n включительно.
    @Override
    public int calc(int number) {
        System.out.println("Вызван calc:" + number);
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + number + " = " + result);
        return result;
    }

    public static void metricTest(Calculator calculator){
        PerformanceProxy performanceProxy = new PerformanceProxy(calculator);

        Calculator calculatorMetric = (Calculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(),
                calculator.getClass().getInterfaces(), performanceProxy);

        System.out.println(calculatorMetric.calc(3));

    }

}
