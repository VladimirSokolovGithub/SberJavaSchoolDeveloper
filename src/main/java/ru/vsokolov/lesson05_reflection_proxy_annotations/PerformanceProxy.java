package ru.vsokolov.lesson05_reflection_proxy_annotations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceProxy implements InvocationHandler {

    private Calculator calculator;

    public PerformanceProxy(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.isAnnotationPresent(Metric.class)){
            long startTime = System.currentTimeMillis();
            Object result = method.invoke(calculator, args);
            System.out.println("Время выполнения метода " + method.getName() + ": " + (System.currentTimeMillis() - startTime) + " ms");
            return result;
        }
        return method.invoke(calculator,args);
    }
}
