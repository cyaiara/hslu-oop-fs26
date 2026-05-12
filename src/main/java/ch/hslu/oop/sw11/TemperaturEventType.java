package ch.hslu.oop.sw11;

public enum TemperaturEventType {
  MIN("minimum"), MAX("maximum");

  private final String bezeichnung;

  private TemperaturEventType(final String bezeichnung){
    this.bezeichnung = bezeichnung;
  }

  public String getBezeichnung(){
    return this.bezeichnung;
  }

}
