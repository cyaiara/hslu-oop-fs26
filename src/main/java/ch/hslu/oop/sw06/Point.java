package ch.hslu.oop.sw06;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  public void moveRelative(int x, int y){
    this.x += x;
    this.y += y;
  }

  public void moveRelative(Point vector) {
    this.moveRelative(vector.getX(), vector.getY());
  }

  public void moveRelativePolar(double angle, double betrag){
    x = (int) (betrag * Math.cos(angle));
    y = (int) (betrag * Math.sin(angle));
  }

  // copy constructor
  public Point(Point point){
    this.x = point.x;
    this.y = point.y;
  }



}
