package ru.vsokolov.lesson05_reflection_proxy_annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.codehaus.groovy.ast.tools.GenericsUtils.getSuperClass;

public class ReflectionAction {

    public static boolean checkedPrintFields(Object object) throws IllegalAccessException {
        Class<? extends Object> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        String fieldName;
        String fieldValue;
        boolean checkedConstant = false;
        for (Field field : declaredFields) {
            field.setAccessible(true);
            fieldName = field.getName();
            fieldValue = (String) field.get(String.class);
            if (!fieldName.equals(fieldValue)) {
                checkedConstant = false;
                System.out.println(checkedConstant + " *** Имя String константы -" + fieldName + "- не соответствует значению = " + fieldValue);
            } else {
                checkedConstant = true;
                System.out.println(checkedConstant + " - Имя String константы -" + fieldName + " соответствует значению = " + fieldValue);
            }
        }
        System.out.println(checkedConstant);
        return checkedConstant;
    }

    public static void getAllMethods(Object object) {
        Class<? extends Object> clazz = object.getClass();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        System.out.println("****************");
        System.out.println("****************");

        Class<? extends Object> clazz1 = object.getClass().getSuperclass();
        Method[] SuperclassDeclaredMethods = clazz1.getDeclaredMethods();
        for (Method method : SuperclassDeclaredMethods) {
            System.out.println(method);
        }
    }

    public static void showAllGetters(Object object) {
        try {
            Class<? extends Object> clazz = object.getClass();
            Method[] methods = clazz.getDeclaredMethods();
            List<String> getters = new ArrayList<>();
            for (Method method : methods) {
                if (method.getName().startsWith("get")) {
                    getters.add(method.getName());
                }
            }
            System.out.println(getters.toString());
//            Iterator<String> iterator = getters.iterator();
//            while (iterator.hasNext()){
//                String text = iterator.next();
//                System.out.println(text);
//            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }


//    public static void checkedPrintFields_2(Object object) {
//        Class<? extends Object> clazz = object.getClass();
//        Field[] declaredFields = clazz.getDeclaredFields();
//        for (Field field : declaredFields) {
//            field.setAccessible(true);
//            System.out.println(field);
//
//        }
//    }


    public static void analyzeClass(Object object) {
        Class<? extends Object> clazz = object.getClass();
        System.out.println(clazz);
    }


}

