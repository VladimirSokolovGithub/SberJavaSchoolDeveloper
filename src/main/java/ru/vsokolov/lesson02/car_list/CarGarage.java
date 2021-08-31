package ru.vsokolov.lesson02.car_list;

import java.util.*;

public class CarGarage {
    final private String carModel;
    final private String carType;

    public CarGarage(String carModel, String carType) {
        this.carModel = carModel;
        this.carType = carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "СarFleet{" +
                "carModel='" + carModel + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarGarage сarFleet = (CarGarage) o;
        return Objects.equals(carModel, сarFleet.carModel) && Objects.equals(carType, сarFleet.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel, carType);
    }
}


