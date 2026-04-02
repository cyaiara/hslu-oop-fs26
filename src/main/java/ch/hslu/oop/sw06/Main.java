package ch.hslu.oop.sw06;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4, 5, 10, 11);
    System.out.println(rectangle.getPerimeter());
    Circle circle = new Circle(4, 7, 11);
    System.out.println(circle.getPerimeter());
    Element e = new Mercury();
    System.out.println(e.getAggregatzustand(20f)); // flüssig
    Element e1 = new Lead();
    System.out.println(e1.getAggregatzustand(500f));
    Shape shape1 = new Circle(5, 6, 11); //statischer datentyp; wird vom compiler zur compilezeit bestimmt
    System.out.println(shape1.getPerimeter());
    Shape shape2 = new Rectangle(111, 22, 3, 44);
    System.out.println(shape2.getPerimeter());
    shape1.move(22, 1);
    shape2.move(-1, 222);
    Circle shape3 = new Circle(44, 222, 8); //typ des objekts zur laufzeit; wird erst zur laufzeit bestimmt
    shape3.getDiameter();
    System.out.println(shape3.getDiameter());

  }

}
