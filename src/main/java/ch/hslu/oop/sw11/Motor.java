package ch.hslu.oop.sw11;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public final class Motor implements Switchable {
  private int rpm;
  private int MAX_RPM = 15000;
  private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

  public Motor(int rpm){
    this.rpm = rpm;
  }

  // @Override
  // public void switchOn() {
  //   if (isSwitchedOff()) {
  //     this.state = MotorState.ON;
  //     final PropertyChangeEvent pcEvent =
  //       new PropertyChangeEvent(this, "state", MotorState.OFF, MotorState.ON);
  //     this.firePropertyChangeEvent(pcEvent);
  //   }
  // }

  @Override
  public void switchOn(){
    if (this.isSwitchedOff()) {
      this.rpm = MAX_RPM;
      final PropertyChangeEvent pcEvent =
        new PropertyChangeEvent(this, "rpm", 0, MAX_RPM);
      this.firePropertyChangeEvent(pcEvent);
    } else {
      if (this.isSwitchedOn()) {
        this.rpm = MAX_RPM;
        System.err.println("Already switched on.");
      }
    }
  }

  @Override
  public void switchOff() {
    if (this.isSwitchedOn()) {
      this.rpm = 0;
      final PropertyChangeEvent pcEvent =
        new PropertyChangeEvent(this, "rpm", MAX_RPM, 0);
      this.firePropertyChangeEvent(pcEvent);
    } else {
      if (this.isSwitchedOff()) {
        this.rpm = 0;
        System.err.println("Already switched off.");
      }
    }
  }

  @Override
  public boolean isSwitchedOn(){
      return this.rpm > 0;
  }

  @Override
  public boolean isSwitchedOff(){
    return this.rpm == 0;
  }

  /**
  * Registriert einen PropertyChangeListener(-Objekt) auf der Quelle. * @param listener PropertyChangeListener.
  */
  public void addPropertyChangeListener(final PropertyChangeListener listener) {
  this.changeListeners.add(listener);
  }

  /**
  * Deregistriert einen PropertyChangeListener(-Objekt) von der Quelle. * @param listener PropertyChangeListener.
  */
  public void removePropertyChangeListener(final PropertyChangeListener listener) {
  this.changeListeners.remove(listener);
  }

  /**
  * Informiert alle PropertyChangeListeners über PropertyChangeEvent. * @param pcEvent PropertyChangeEvent.
  */
  private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
    for (final PropertyChangeListener listener : this.changeListeners) {
      listener.propertyChange(pcEvent);
    }
  }




}
