package ch.hslu.oop.sw03;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y){
    x = this.x;
    y = this.y;
  }


  public String getQuadrant(int x, int y){
    if (x > 0 && y > 0){
      return ("1");
    } else if (x < 0 && y > 0){
      return ("2");
    } else if (x < 0 && y < 0){
      return ("3");
    } else if (x > 0 && y < 0){
      return ("4");
    } else if (x == 0){
      return ("on y axis");
    } else if (y == 0){
      return ("on x axis");
    } else if (x == 0 || y == 0){
      return ("0");
    }
    return "n.a.";
  }


}
