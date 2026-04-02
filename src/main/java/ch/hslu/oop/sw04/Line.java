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
    int vx = endPoint.getX() - startPoint.getX();
    return vx;
  }

  public int getVectorY(){
    int vy = endPoint.getY() - startPoint.getY();
    return vy;
  }

  public void setStartPoint(Point startPoint){
    this.startPoint = startPoint;
  }

  public void setEndPoint(Point endPoint){
    this.endPoint = endPoint;
  }

}
