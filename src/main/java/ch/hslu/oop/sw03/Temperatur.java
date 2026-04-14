package ch.hslu.oop.sw03;

public class Temperatur {
    private float celsius; //this immer wenn zugriff auf attribut // wert kann auch hier sschon festgelegt werden
    private float fahrenheit;
    private float kelvin;

    public Temperatur(float celsius){
      this.celsius = celsius;
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

    public float getTempCelsius(){
      return this.celsius;
    }

    public float getTempFahrenheit(){
      return celsius * 1.8f + 32f;
    }

    public float getTempKelvin(){
      return (float) celsius + 273.15f;
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
}
