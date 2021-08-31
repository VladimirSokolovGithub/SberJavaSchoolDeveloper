package collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();

        Student st1 = new Student("Vladimir", "Sokolov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);

        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);

        System.out.println(map);

        Student st4 = new Student("Vladimir", "Sokolov", 3);
        Student st5 = new Student("Vitaliiy", "Kniyga", 4);
//        boolean result = map.containsKey(st4);
//        System.out.println("result = " + result);
//        System.out.println(st1.equals(st4));

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

        for(Map.Entry<Student, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<Integer, Student> map2 = new HashMap<>(16,0.75f);/*Два параметра которые влияют на производительность это
        initialCapacity (начальный размер массива) и loadFactor(коэф-т того, насколько массив должен быть заполнен
        после чего его размер будет увеличин в двое) Дефолтные значения это - 16 для initialCapacity и 0,75 для loadFactor */

        /* Так же очень Важно в качестве ключа использовать immutable объекты - т.е.
        объекты которые мы не можем изсенить. Это достигается за счёт установки Final полей у класса,
        а также сам класс можно сделать как Final*/

        Map<Student, Double> map3 = new HashMap<>();

        Student st11 = new Student("Vladimir", "Sokolov", 3);
        Student st12 = new Student("Mariya", "Ivanova", 1);
        Student st13 = new Student("Sergey", "Petrov", 4);

        map3.put(st11, 7.5);
        map3.put(st12, 8.7);
        map3.put(st13, 9.2);

        System.out.println(map3);
        System.out.println(map3.containsKey(st11));
        System.out.println(st11.hashCode());
    //    st11.course = 4; // так как наши поля стали final, то соответсвенно объект мы уже изменить не сможем и хэш код будет одинаковый
        System.out.println(map3.containsKey(st11));
        System.out.println(st11.hashCode());


    }

}

final class Student {
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    //Сравнение в HashMap сначало происходит по hashCode а потом по equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    //пишем свою реализацию hashCode

//    @Override
//    public int hashCode() {
//        return name.length()*7 + surname.length()*11 + course*53;
//    }
}