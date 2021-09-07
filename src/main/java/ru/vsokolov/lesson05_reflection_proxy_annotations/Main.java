package ru.vsokolov.lesson05_reflection_proxy_annotations;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.calc(3);


//        Calculator calculator1 = new PerformanceProxy();
        CalculatorImpl.metricTest(calculator);


        Child child = new Child();
        Constants constants = new Constants();


//        ReflectionAction.checkedPrintFields(constants);
//        ReflectionAction.checkedPrintFields_2(constants);
//        ReflectionAction.analyzeClass(constants);
//        ReflectionAction.getAllMethods(child);
//        ReflectionAction.showAllGetters(child);



    }
}
