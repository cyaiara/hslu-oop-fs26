package ch.hslu.oop.sw11;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Auto implements PropertyChangeListener {
  private final Motor motor;

  public Auto(){
    this.motor = new Motor(0);
    this.motor.addPropertyChangeListener(this);
  }

  public void switchOn() {
    this.motor.switchOn();
  }

  public void switchOff() {
    this.motor.switchOff();
  }

  @Override
  public void propertyChange(final PropertyChangeEvent event){
    System.out.println("Motor Status geändert: " + event.getNewValue());
  }


    // if (event.getSource() == this.motor) {
    //   this.handleMotorEvent("Motor", event);
    //   System.out.println("Status:", "event.getNewValue()");
    // }

    // if (event.getSource() == this.lightFrontLeft) {
    // this.handleLightEvent("Scheinwerfer Links", event); }
    // if (event.getSource() == this.lightFrontRight) {
    // this.handleLightEvent("Scheinwerfer Rechts", event); }
  // }



}
