package ch.hslu.oop.sw03;

public class Demo {
  private int a;
  private int b;

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

  public int arrMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
  }

  public int getMax4(int a, int b, int c, int d){
    int[] zahlen = {a, b, c, d};
    return arrMax(zahlen);
  }






}
