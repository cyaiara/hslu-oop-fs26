package ch.hslu.oop.sw03;

public class Element {
  private String symbol;
  private float schmelzpunkt;
  private float siedepunkt;

  public Element(String symbol, float schmelzpunkt, float siedepunkt){
    this.symbol = symbol;
    this.schmelzpunkt = schmelzpunkt;
    this.siedepunkt = siedepunkt;
  }

  public Element(){
    this("Hg", -39f, 357f);
  }


}
