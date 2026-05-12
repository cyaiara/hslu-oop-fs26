package ch.hslu.oop.sw11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TemperaturVerlauf implements ITemperaturVerlauf{
  final Collection<Temperatur> verlauf = new ArrayList<>();
  private final List<ITemperaturListener> changeListeners = new ArrayList<>();

  public TemperaturVerlauf(){
  }
  // v1: event min wurde nicht gefeuert!
  // public void add(Temperatur temperatur){
  //   verlauf.add(temperatur);
  //   if (verlauf.size() == 1) {
  //       final TemperaturEvent eventi = new TemperaturEvent(this, temperatur, TemperaturEventType.MAX);
  //       final TemperaturEvent event = new TemperaturEvent(this, temperatur, TemperaturEventType.MIN);
  //       this.firePropertyChangeEvent(eventi);
  //       this.firePropertyChangeEvent(event);
  //   } else {
  //   if (temperatur.compareTo(getMax()) > 0) {
  //       // neue Temperatur ist grösser als aktuelles Max
  //       // feuere Event mit TemperaturEventType.MAX
  //       final TemperaturEvent event = new TemperaturEvent(this, temperatur, TemperaturEventType.MAX);
  //       this.firePropertyChangeEvent(event);
  //   }
  //   if (temperatur.compareTo(getMin()) < 0) {
  //       // neue Temperatur ist kleiner als aktuelles Min
  //       // feuere Event mit TemperaturEventType.MIN
  //       final TemperaturEvent event = new TemperaturEvent(this, temperatur, TemperaturEventType.MIN);
  //       this.firePropertyChangeEvent(event);
  //   }
  //   }
  // }

  //v2 damit listener min und max zuerst prüft und dann event sendet ; test via main
  public void add(Temperatur temperatur){
    if (verlauf.isEmpty()) {
        verlauf.add(temperatur);
        this.firePropertyChangeEvent(new TemperaturEvent(this, temperatur, TemperaturEventType.MAX));
        this.firePropertyChangeEvent(new TemperaturEvent(this, temperatur, TemperaturEventType.MIN));
    } else {
        boolean isNewMax = temperatur.compareTo(getMax()) > 0;
        boolean isNewMin = temperatur.compareTo(getMin()) < 0;
        verlauf.add(temperatur);
        if (isNewMax) {
            this.firePropertyChangeEvent(new TemperaturEvent(this, temperatur, TemperaturEventType.MAX));
        }
        if (isNewMin) {
            this.firePropertyChangeEvent(new TemperaturEvent(this, temperatur, TemperaturEventType.MIN));
        }
    }
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

  /**
  * Registriert einen TemperaturListener(-Objekt) auf der Quelle. * @param listener PropertyChangeListener.
  */
  public void addTemperaturListener(final ITemperaturListener listener) {
    if (listener != null)
      this.changeListeners.add(listener);
  }

  /**
  * Deregistriert einen TemperaturListener(-Objekt) von der Quelle. * @param listener PropertyChangeListener.
  */
  public void removeTemperaturListener(final ITemperaturListener listener) {
    if (listener != null)
      this.changeListeners.remove(listener);
  }

  /**
  * Informiert alle TemperaturListener über TemperaturEvent. * @param pcEvent PropertyChangeEvent.
  */
  private void firePropertyChangeEvent(final TemperaturEvent pcEvent) {
    for (final ITemperaturListener listener : this.changeListeners) {
      listener.temperaturChanged(pcEvent);
    }
  }
}
