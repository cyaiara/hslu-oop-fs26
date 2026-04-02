package ch.hslu.oop.sw05;

public final class Square extends Shape{
  private int length;
  private int width;

  public Square(final int x, final int y, final int length, final int width){
    super (x, y);
    this.length = length;
    this.width = width;
  }

  @Override
  public int getPerimeter(){
    return (int) (length * width * 2);
  }

}
