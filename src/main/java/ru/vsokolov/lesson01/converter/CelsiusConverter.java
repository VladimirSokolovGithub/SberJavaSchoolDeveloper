package ru.vsokolov.lesson01.converter;

public class CelsiusConverter {

    public double convertCelsiusToFahrenheit(double celsius) {
        if(celsius<273.15){
            System.out.println("warning: введена несуществующая температура");
        }
        double TF = (9 / 5) * celsius + 32;
        return TF;
    }

    public double convertCelsiusToKelvin(double celsius) {
        if(celsius<273.15){
            System.out.println("warning: введена несуществующая температура");
        }
        double tK = celsius + 273.15;
        return tK;
    }
}
