package ru.vsokolov.lesson03_generics.task_2;

import java.util.*;


public class CollectionTestUtil {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    //    public static List newArrayList() {
//    }
    public static <T> List newArrayList() {
        return new ArrayList<T>();
    }

    //    public static int indexOf(List source, Object o) {
//    }
    public static <T> int indexOf(List<T> source, T t) {
        return source.indexOf(t);
    }

    //    public static List limit(List source, int size) {
//    }
    public static <T> List limit(List<T> source, int size) {

        if (source != null && size < 15) {
            source.get(size);
        }
        return limit(source, size);
    }

    //    public static void add(List source, Object o) {
//    }
    public static <T> void add(List<T> source, T t) {
        source.add(t);
    }

    //    public static void removeAll(List removeFrom, List c2) {
//    }
    public static <T> void removeAll(List<T> removeFrom, List<T> c2) {
        removeFrom.removeAll(c2);
    }

    //    public static boolean containsAll(List c1, List c2) {
//    }
//true если первый лист содержит все элементы второго
    public static <T> boolean containsAll(List<T> c1, List<T> c2) {
        return c1.containsAll(c2);
    }

    //    public static boolean containsAny(List c1, List c2) {
//    }
//true если первый лист содержит хотя-бы 1 второго
    public static <T> boolean containsAny(List<T> c1, List<T> c2) {
        for (T t : c2) {
            if (c1.contains(t)) {
                return true;
            }
        }
        return false;
    }


//    public static List range(List list, Object min, Object max) {
//    }
//Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
// Элементы сравнивать через Comparable.
// Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}

//    public static <T extends Comparable<T>> List<T> range(List<T> list, T min, T max) {
//        List<T> tList = newArrayList();
//        for (T t : list) {
//            if (t.compareTo(min) <= 0 && t.compareTo(max) >= 0) {
//                tList.add(t);
//            }
//        }
//        tList.sort(Comparator.naturalOrder());
//        return tList;
//    }


//    public static List range(List list, Object min, Object max, Comparator comparator) {
//    }

//Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
// Элементы сравнивать через Comparable.
// Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
//    public static <T> List<T> range(List<T> list, T min, T max, Comparator<T> comparator) {
//        List<T> result = newArrayList();
//        for (T t : list) {
//            if (comparator.compare(t, min) >= 0 && comparator.compare(t, max) <= 0) {
//                result.add(t);
//            }
//        }
//        result.sort(comparator);
//        return result;
//    }

}







