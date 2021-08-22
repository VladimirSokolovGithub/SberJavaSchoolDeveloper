package ru.vsokolov.lesson02.car_list_for_type;

import ru.vsokolov.lesson02.car_list_for_type.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String modelLada = "Lada";
        String modelMercedes = "Mercedes";
        String modelBmw = "BMW";
        String modelFord = "Ford";
        String modelToyota = "Toyota";

        String typeSedan = "Sedan";
        String typeHatch_back = "Hatch_back";
        String typeCrossover = "Сrossover";


        List<Car> cars = new ArrayList<>();
        cars.add(new Car(modelLada, typeSedan));
        cars.add(new Car(modelMercedes, typeCrossover));
        cars.add(new Car(modelBmw, typeSedan));
        cars.add(new Car(modelFord, typeHatch_back));
        cars.add(new Car(modelToyota, typeCrossover));

        Map<String, List<Car>> groupedCars = new HashMap<>();

        for (Car car : cars) { //цикл по списку
            if(!groupedCars.containsKey(car.getType())){
                groupedCars.put(car.getType(),new ArrayList<>());
            }
            List<Car> listForType = groupedCars.get(car.getType()); // получили список для типа текущей машниы
//            if(listForType == null){
//                listForType = new ArrayList<>();
//                groupedCars.put(car.getType(),listForType);
//            }
            listForType.add(car);
        }

        for (String type : groupedCars.keySet()) {
            System.out.println("машины типа " + type + ": " + groupedCars.get(type));
        }


//        Map<CarModel, CarType> map = new HashMap<>();
//
//        CarModel lada = new CarModel("Lada");
//        CarModel audi = new CarModel("Audi");
//        CarModel bmv = new CarModel("BMW");
//        CarModel ford = new CarModel("Ford");
//        CarModel honda = new CarModel("Honda");
//        CarModel mazda = new CarModel("Mazda");
//        CarModel kia = new CarModel("Kia");
//        CarModel toyota = new CarModel("Toyota");
//
//        CarType sedan = new CarType("Sedan");
//        CarType coupe = new CarType("Coupe");
//        CarType hatch_back = new CarType("Hatch—back");
//        CarType crossover = new CarType("Сrossover");
//        CarType minivan = new CarType("Minivan");
//
//        map.put(lada, sedan);
//        map.put(audi, coupe);
//        map.put(bmv, sedan);
//        map.put(ford, hatch_back);
//        map.put(honda, minivan);
//        map.put(kia, hatch_back);
//        map.put(toyota, crossover);
//        map.put(mazda, crossover);
//
//        System.out.println(map);
//
//        List<Map.Entry<CarModel, CarType>> listSedan = new LinkedList<>();
//        List<Map.Entry<CarModel, CarType>> listCoupe = new LinkedList<>();
//        List<Map.Entry<CarModel, CarType>> listHatchBack = new LinkedList<>();
//        List<Map.Entry<CarModel, CarType>> listMinivan = new LinkedList<>();
//        List<Map.Entry<CarModel, CarType>> listCrossover = new LinkedList<>();
//
//        for (Map.Entry<CarModel, CarType> entry : map.entrySet()) {
//            //System.out.println(entry.getKey() + " : " + entry.getValue());
//
//            if (entry.getValue().equals(sedan)) {
//                listSedan.add(entry);
//            }
//            if (entry.getValue().equals(coupe)) {
//                listCoupe.add(entry);
//            }
//            if (entry.getValue().equals(hatch_back)) {
//                listHatchBack.add(entry);
//            }
//            if (entry.getValue().equals(minivan)) {
//                listMinivan.add(entry);
//            }
//            if (entry.getValue().equals(crossover)) {
//                listCrossover.add(entry);
//            }
//
//        }
//        System.out.println(listSedan);
//        System.out.println(listCoupe);
//        System.out.println(listHatchBack);
//        System.out.println(listMinivan);
//        System.out.println(listCrossover);

    }
}
