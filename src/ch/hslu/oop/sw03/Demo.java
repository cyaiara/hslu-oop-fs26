package ch.hslu.oop.sw03;

public class Demo {
  private int a = 111;
  private int b = 22;

  public Demo(int a, int b){
    this.a = a;
    this.b = b;
  }

  public Demo(){
    this(20, 12);
  }

  public int getMax2(int a, int b){
      if (a >= b){
        return a;
      } {
        return b;
      }
  }

  public int getMax3(int a, int b, int c){
    if (c >= a && c >= b) {
          return c;
    } else {
          return getMax2(a, b);
    }


  }






}
