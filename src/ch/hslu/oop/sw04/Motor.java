package ch.hslu.oop.sw04;

public final class Motor implements Switchable {
  private int rpm;
  private int MAX_RPM = 15000;

  public Motor(int rpm){
    this.rpm = rpm;
  }

  @Override
  public void switchOn(){
    if (this.isSwitchedOff()) {
      this.rpm = MAX_RPM;
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




}
