package ru.vsokolov.lesson03_generics;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {
    Map<T, Integer> map = new HashMap<>();

    //добавляет элемент t типа T в этот контейнер
    @Override
    public void add(T t) {
        Integer count = map.get(t);
        if (count == null) {
            count = 0;
        }
        map.put(t, ++count);
    }

    //Возвращает количество добавлений элемента t типа T
    @Override
    public int getCount(T t) {
        return map.get(t);
    }

    //Удаляет элемент t типа T из контейнера и возвращает количество его добавлений (до удаления)
    @Override
    public int remove(T t) {
        return map.remove(t);
    }

    //количество разных элементов
    @Override
    public int size(T t) {
        return map.size();
    }

    //Добавить все элементы из source в текущий контейнер,
    // при совпадении ключей, суммировать значения
    @Override
    public void addAll(CountMap<T> source) {
        for (T key: source.toMap().keySet()){
            Integer count = map.get(key);
            if(count == null){
                count = 0;
            }
            map.put(key, source.getCount(key) + count);
        }
    }

    //Вернуть java.util.Map. ключ - добавленный элемент,
    //значение - количество его добавлений
    @Override
    public Map<T, Integer> toMap() {
        return map;
    }

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    @Override
    public void toMap(Map<T, Integer> destination) {
        for (T key : map.keySet()) {
            destination.put(key, map.get(key));
        }
    }

}
