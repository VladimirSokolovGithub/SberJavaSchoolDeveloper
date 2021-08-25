package ru.vsokolov.lesson03_generics.task_1;

import java.util.Map;

//Задание/Параметризовать CountMap и реализовать его.

public interface CountMap <T> {
    // добавляет элемент в этот контейнер.
    void add(T t);

    //Возвращает количество добавлений данного элемента
    int getCount(T t);

    //Удаляет элемент из контейнера и возвращает количество его добавлений (до удаления)
    int remove(T t);

    //количество разных элементов
    int size(T t);

    //Добавить все элементы из source в текущий контейнер,
    // при совпадении ключей,     суммировать значения
    void addAll(CountMap <T> source);

    //Вернуть java.util.Map. ключ - добавленный элемент,
    // значение - количество его добавлений
    Map<T, Integer> toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map<T, Integer> destination);
}
