package ch.hslu.oop.sw05;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4, 5, 10, 11);
    System.out.println(rectangle.getPerimeter());
    Circle circle = new Circle(4, 7, 11);
    System.out.println(circle.getPerimeter());
    Square square = new Square(3, 3, 3, 3);
    System.out.println(square.getPerimeter());
    Element e = new Mercury();
    System.out.println(e.getAggregatzustand(20f)); // flüssig
  }
}
