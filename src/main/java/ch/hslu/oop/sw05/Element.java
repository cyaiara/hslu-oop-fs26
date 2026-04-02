package ch.hslu.oop.sw05;

public abstract class Element {
  private String symbol;
  private float schmelzpunkt;
  private float siedepunkt;

  public Element(String symbol, float schmelzpunkt, float siedepunkt){
    this.symbol = symbol;
    this.schmelzpunkt = schmelzpunkt;
    this.siedepunkt = siedepunkt;
  }

  public String getAggregatzustand(float temperatur) {
    if (temperatur < schmelzpunkt) return "fest";
    if (temperatur < siedepunkt)   return "flüssig";
    return "gasförmig";
  }

  public Element(){
    this("Hg", -39f, 357f);
  }


}
