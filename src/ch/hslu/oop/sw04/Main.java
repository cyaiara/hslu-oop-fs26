package ch.hslu.oop.sw04;

public class Main {
  public static void main(String[] args) {
    Motor motor = new Motor(0);
    System.out.println(motor.isSwitchedOn());  // false
    motor.switchOn();
    System.out.println(motor.isSwitchedOn());  // true
    motor.switchOff();
    System.out.println(motor.isSwitchedOn());  // false
  }
}
