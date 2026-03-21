package ch.hslu.oop.sw04;

public class Line {
  private Point startPoint;
  private Point endPoint;

  public Line(Point startPoint, Point endPoint){
    this.startPoint = startPoint;
    this.endPoint = endPoint;
  }

  public Point getStartPoint(){
    return startPoint;
  }

  public Point getEndPoint(){
    return endPoint;
  }

  public int getVectorX(){
    int vx = endPoint.x - startPoint.x;
    return vx;
  }

    public int getVectorY(){
    int vy = endPoint.y - startPoint.y;
    return vy;
  }
}
