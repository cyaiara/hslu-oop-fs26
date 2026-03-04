package ch.hslu.oop.sw02;

public class Temperatur {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    //public Temperatur(){
      //this.celsius = celsius;
    //}

    public void setTempCelsius(double celsius){
      if (celsius > (- 273.15) && celsius < (726.85)){
        this.celsius = celsius;
      }
      else {
        System.out.println("Invalid Temperature");
      }
    }

    public double getTempCelsius(){
      return this.celsius;
    }

    public double getTempFahrenheit(){
      fahrenheit = ((celsius * (9d/5d)) + 32);
      return fahrenheit;
    }

    public double getTempKelvin(){
      kelvin = (celsius + 273.15);
      return kelvin;
    }

    public double setTempChangeCelsius(double celsius){
      if (celsius > (- 273.15) && celsius < (726.85)){
        this.celsius = celsius;
      }
      else {
        System.out.println("Invalid Temperature");
      }
      return this.celsius + celsius;
    }
}
