package homework01_MainJavaClassesAndPackages;

public class CelsiusConverter {

    public double convertCelsiusToFahrenheit(double celsius) {
        double TF = (9 / 5) * celsius + 32;
        return TF;
    }

    public double convertCelsiusToKelvin(double celsius) {
        double TK = celsius + 273.15;
        return TK;
    }
}
