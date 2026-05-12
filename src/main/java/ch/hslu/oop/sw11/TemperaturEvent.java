package ch.hslu.oop.sw11;

import java.util.EventObject;

public class TemperaturEvent extends EventObject{
  private TemperaturEventType temperaturEventType;
  private Temperatur celsius;

  public TemperaturEvent(Object source, Temperatur celsius, TemperaturEventType temperaturEventType) {
    super(source);
    this.celsius = celsius;
    this.temperaturEventType = temperaturEventType;
  }

  public Temperatur getTemperatur() {
    return this.celsius;
  }

  public TemperaturEventType getTemperaturEventType() {
    return this.temperaturEventType;
  }

}
