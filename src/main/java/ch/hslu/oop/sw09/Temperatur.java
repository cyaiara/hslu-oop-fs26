package ch.hslu.oop.sw09;

import java.util.Objects;

public final class Temperatur implements Comparable<Temperatur> {
    private float celsius; //this immer wenn zugriff auf attribut // wert kann auch hier sschon festgelegt werden
    public static final float KELVIN_OFFSET = 273.15f;

    public Temperatur(float celsius){
      this.celsius = celsius;
    }

    public Temperatur(final Temperatur temperatur){
      this.celsius = temperatur.getTempCelsius();
    }

    public Temperatur(){
      this(20);
    }

    public void setTempCelsius(float celsius){
      if (celsius > (- 273.15f) && celsius < (726.85f)){
        this.celsius = celsius;
      }
      else {
        System.out.println("Invalid Temperature");
      }
    }

    public static float convertKelvintoCelsius(float kelvin){
      return (float) kelvin - KELVIN_OFFSET;
    }

    public float getTempCelsius(){
      return this.celsius;
    }

    public float getTempFahrenheit(){
      return celsius * 1.8f + 32f;
    }

    public static float convertCelsiustoKelvin(float celsius){
      return (float) celsius + KELVIN_OFFSET;
    }

    public float getTempKelvin(){
      return Temperatur.convertCelsiustoKelvin(celsius);
    }

    public void changeTempCelsius(float value){
      celsius += value;
    }

    public void changeTempKelvin(float kelvin){
      changeTempCelsius(kelvin);
    }

    public String getAggregatzustand(String element){
      switch(element){
        case "N":
          if (celsius <= -195.8f) return "flüssig";
          if (celsius <= -210f) return "fest";
          return "gasförmig";
        case "Hg":
          if (celsius >= 357f) return "gasförmig";
          if (celsius <= -39f) return "fest";
          return "flüssig";
        case "Pb":
          if (celsius >= 1740f) return "gasförmig";
          if (celsius >= 327f) return "fest";
          return "flüssig";
      }
      return "Invalid Element";
    }

    public static void main(String[] args){
      System.out.println("Program started:");
    }

  @Override
  public final boolean equals(final Object object){
    if (this == object) {
      return true;
    }
    if (!(object instanceof Temperatur other)) {
      return false;
    }
    return Float.compare(this.celsius, other.celsius) == 0; //spezialfall wegen double und float
  }

  @Override
  public final int hashCode() {
    return Objects.hash(this.celsius);
  }

  @Override
  public int compareTo(Temperatur temperatur) {
    return Float.compare(this.celsius, temperatur.getTempCelsius());
    //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
  }

  @Override
  public String toString(){
    return "Temperatur[Celsius=" + this.celsius + ", Kelvin=" + getTempKelvin() + ", Fahrenheit=" + getTempFahrenheit() +"]";
  }


}
