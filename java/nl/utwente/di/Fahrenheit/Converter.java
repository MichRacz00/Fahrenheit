package nl.utwente.di.Fahrenheit;

public class Converter {

    protected double convert(String c) {
        return Integer.parseInt(c) * 1.8 + 32;
    }
}
