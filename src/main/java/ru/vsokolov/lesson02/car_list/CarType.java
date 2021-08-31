package ru.vsokolov.lesson02.car_list;

import java.util.Objects;

public class CarType {
    final private String carType;

    public CarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "CarType-" +
                "'" + carType + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarType carType1 = (CarType) o;
        return Objects.equals(carType, carType1.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carType);
    }
}
