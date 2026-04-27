package ch.hslu.oop.sw09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TemperaturVerlauf implements ITemperaturVerlauf{
  final Collection<Temperatur> verlauf = new ArrayList<>();

  public TemperaturVerlauf(){
  }

  public void add(Temperatur temperatur){
    verlauf.add(temperatur);
  }

  public void clear() {
    verlauf.clear();
  }

  public int getCount(){
    return verlauf.size();
  }

  public Temperatur getMax(){
    if (verlauf.isEmpty()){
      throw new IllegalStateException("Verlauf is empty.");
    }
    return Collections.max(verlauf);
  }

  public Temperatur getMin(){
    if (verlauf.isEmpty()){
      throw new IllegalStateException("Verlauf is empty.");
    }
    return Collections.min(verlauf);
  }

  public float getAverage(){
    if (verlauf.isEmpty()){
      throw new IllegalStateException("Verlauf is empty.");
    }
    float total = 0;
    for (Temperatur t : verlauf) {
      total += t.getTempCelsius();
      }
        return (total/getCount());
  }
}
