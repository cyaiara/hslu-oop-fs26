package ch.hslu.oop.sw04;

public class Main {
  public static void main(String[] args) {
    Motor motor = new Motor(0);
    System.out.println(motor.isSwitchedOn());  // false
    motor.switchOn();
    System.out.println(motor.isSwitchedOn());  // true
    motor.switchOff();
    System.out.println(motor.isSwitchedOn());  // false
    Point startPoint = new Point(0, 0);
    Point endPoint = new Point(3, 4);
    Line line = new Line(startPoint, endPoint);
    System.out.println(line.getVectorX());
    System.out.println(line.getStartPoint());
    System.out.println(line.getEndPoint());


  }
}
