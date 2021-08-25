package ru.vsokolov.lesson03_generics.task_1;

public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        int count;
        count = map.getCount(5);
        System.out.println(count);
        count = map.getCount(6);
        System.out.println(count);
        count = map.getCount(10);
        System.out.println(count);

    }
}
