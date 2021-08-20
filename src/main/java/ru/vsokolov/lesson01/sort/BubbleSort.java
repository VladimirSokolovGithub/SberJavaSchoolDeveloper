package ru.vsokolov.lesson01.sort;

import java.util.Arrays;

public class BubbleSort {
//    private int[] array; // объявляю массив array

//    public BubbleSort(int size) { // создаю конструктор класса
//        this.array = new int[size]; // выделяю под массив array память на количество size элементов
//    }


    public static void insertElement(int[] array){ // метод вставки случайно сгенерированных элементов в массив с помощью Math.random()
        for(int i = 0; i < array.length; i++){
            array[i] = (int) ((Math.random() * (100-1)) + 1);
        }
        System.out.println("original- " + Arrays.toString(array));
    }

    public static void arraysSort(int[] array) { // метод сортировки пузырьком

        int[] reference = Arrays.copyOf(array,array.length);
        Arrays.sort(reference);
        System.out.println("reference-"+Arrays.toString(reference));

        boolean isSorted = false; // создал переменную флаг isSorted которая будет нам говорить отсортирован массив или нет
        int temp; // создал временную переменную для запоминания обмениваемого значения

        while (!isSorted) { // создал цикл в цикле для обхода массива и попарного сравнения элементов
            isSorted = true; // если массив отсортирован то будет выполнен обход элементов и программа завершит работу
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("result-   " + Arrays.toString(array));
    }
}
