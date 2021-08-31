package collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1  =new HashMap<>();
        map1.put(1000, "Vladimir Sokolov");// номер паспорта и имя, фамилия человека
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.put(98745, "Nikolay Petrov");
        map1.put(1000, "Oleg Ivanov");//ключи должны быть уникальными, при добавлении новой пары с одинаковым ключём,
                                     // ключ остается а значение перезатирается

        map1.put(null, "Sergey Petrov");
        map1.put(85214, null);
        map1.putIfAbsent (3568, "Olga Ivanova");//метод putIfAbsent добавляет значение если такого ключа еще нет в кантейнере,
                                               // если ключ есть то не добавляет
        System.out.println(map1);

//        System.out.println(map1.get(1000)); //метод get() возвращает значение по ключу

        map1.remove(15879); //метод remove() удаляет элемент из коллекции по ключу

        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov")); //метод containsValue() возвращает true если элемент есть в колекции
                                                              // и false если элемента нет

        System.out.println(map1.containsKey(300)); //метод containsKey() возвращает true если ключ есть в коллекции
                                                   // и false если ключа нет

        System.out.println(map1.keySet()); //метод keySet() возвращает множество всех ключей которые есчть в нашем HashMap

        System.out.println(map1.values());//метод values() возвращает множество значений в нашем контейнере HashMap

        System.out.println(map1.entrySet());//Так же есть метод entrySet() который разберем немного позже

        Map<String, String> map2  =new HashMap<>(); /*Ключи и значения могут быть как разных типов, так и одинаковых типов
                                                    либо значением может быть какой-то созданнй нами клас*/
        map2.put("Sasha", "Dobriy");
        map2.put("Misha", "Umniy");
        System.out.println(map2);

    }
}
