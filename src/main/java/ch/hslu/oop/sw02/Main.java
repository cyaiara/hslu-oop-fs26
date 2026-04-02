package ch.hslu.oop.sw02;

public class Main {
    public static void main(String[] args) {
        Temperatur t = new Temperatur();

        System.out.println("Celsius:    " + t.getTempCelsius());
        System.out.println("Fahrenheit: " + t.getTempFahrenheit());
        System.out.println("Kelvin:     " + t.getTempKelvin());

        t.setTempCelsius(10);
        System.out.println("\nNach setzen auf 10:");
        System.out.println("Fahrenheit: " + t.getTempFahrenheit());
        System.out.println("Kelvin:     " + t.getTempKelvin());
    }
}
