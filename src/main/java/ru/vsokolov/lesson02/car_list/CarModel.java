package ru.vsokolov.lesson02.car_list;

import java.util.Objects;

public class CarModel {
    final private String carModel;

    public CarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "CarModel-" +
                "'" + carModel + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel1 = (CarModel) o;
        return Objects.equals(carModel, carModel1.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel);
    }
}
