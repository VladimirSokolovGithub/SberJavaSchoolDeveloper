package ru.vsokolov.lesson02.car_list;

import java.util.*;

public class MainCarFleet {
    public static void main(String[] args) {


        CarGarage lada = new CarGarage("Lada", "Sedan");
        CarGarage audi = new CarGarage("Audi", "Sedan");
        CarGarage bmv = new CarGarage("BMW", "Sedan");
        CarGarage ford = new CarGarage("Ford", "Sedan");
        CarGarage honda = new CarGarage("Honda", "Sedan");

        Map<CarModel, CarType> map = new HashMap<>();

//        CarModel lada = new CarModel("Lada");
//        CarModel audi = new CarModel("Audi");
//        CarModel bmv = new CarModel("BMW");
//        CarModel ford = new CarModel("Ford");
//        CarModel honda = new CarModel("Honda");
        CarModel mazda = new CarModel("Mazda");
        CarModel kia = new CarModel("Kia");
        CarModel toyota = new CarModel("Toyota");

        CarType sedan = new CarType("Sedan");
        CarType coupe = new CarType("Coupe");
        CarType hatch_back = new CarType("Hatch—back");
        CarType crossover = new CarType("Сrossover");
        CarType minivan = new CarType("Minivan");

//        map.put(lada, sedan);
//        map.put(audi, coupe);
//        map.put(bmv, sedan);
//        map.put(ford, hatch_back);
//        map.put(honda, minivan);
        map.put(kia, hatch_back);
        map.put(toyota, crossover);
        map.put(mazda, crossover);

        System.out.println(map);

        List<Map.Entry<CarModel, CarType>> listSedan = new LinkedList<>();
        List<Map.Entry<CarModel, CarType>> listCoupe = new LinkedList<>();
        List<Map.Entry<CarModel, CarType>> listHatchBack = new LinkedList<>();
        List<Map.Entry<CarModel, CarType>> listMinivan = new LinkedList<>();
        List<Map.Entry<CarModel, CarType>> listCrossover = new LinkedList<>();

        for (Map.Entry<CarModel, CarType> entry : map.entrySet()) {
            //System.out.println(entry.getKey() + " : " + entry.getValue());

            if (entry.getValue().equals(sedan)) {
                listSedan.add(entry);
            }
            if (entry.getValue().equals(coupe)) {
                listCoupe.add(entry);
            }
            if (entry.getValue().equals(hatch_back)) {
                listHatchBack.add(entry);
            }
            if (entry.getValue().equals(minivan)) {
                listMinivan.add(entry);
            }
            if (entry.getValue().equals(crossover)) {
                listCrossover.add(entry);
            }

        }
        System.out.println(listSedan);
        System.out.println(listCoupe);
        System.out.println(listHatchBack);
        System.out.println(listMinivan);
        System.out.println(listCrossover);

    }
}
