package ch.hslu.oop.sw09;

public enum Aggregatszustand {
  SOLID("fest"), LIQUID("flüssig"), GAS("gasförmig");

  private final String bezeichnung;

  private Aggregatszustand(final String bezeichnung){
    this.bezeichnung = bezeichnung;
  }

  public String getBezeichnung(){
    return this.bezeichnung;
  }

  //Aggregatszustand condition = Aggregatszustand.SOLID;
}
