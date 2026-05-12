package ch.hslu.oop.sw11;

public class Main {
    public static void main(String[] args) {
      // Auto auto = new Auto();
      // auto.switchOn();
      // auto.switchOff();

      TemperaturVerlauf verlauf = new TemperaturVerlauf();
      verlauf.addTemperaturListener(new ITemperaturListener() {
        @Override
        public void temperaturChanged(TemperaturEvent event) {
          System.out.println("Neues " + event.getTemperaturEventType() + ": " + event.getTemperatur());
        }
      });
      Temperatur temperatur1 = Temperatur.createFromCelsius(27f);
      verlauf.add(temperatur1);
      Temperatur temperatur2 = Temperatur.createFromCelsius(22.8f);
      verlauf.add(temperatur2);


    }


}
