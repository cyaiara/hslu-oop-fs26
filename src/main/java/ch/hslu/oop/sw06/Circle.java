package ch.hslu.oop.sw06;

public final class Circle extends Shape {
  private int radius;

  public Circle(final int x, final int y, final int radius){
    super(x, y);
    this.radius = radius;
  }

  @Override
  public int getPerimeter() {
    return (int) Math.round(2 * this.radius * Math.PI);
  }

  public int getDiameter() {
    return (int) Math.round(2 * this.radius);
  }
}
