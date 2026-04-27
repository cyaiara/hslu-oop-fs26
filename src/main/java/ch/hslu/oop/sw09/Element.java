package ch.hslu.oop.sw09;

public abstract class Element {
    protected String symbol;
    protected float schmelzpunkt;
    protected float siedepunkt;

    public Element(String symbol, float schmelzpunkt, float siedepunkt) {
        this.symbol = symbol;
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    public Aggregatszustand getAggregatszustand(float temperatur) {
        if (temperatur < schmelzpunkt) return Aggregatszustand.SOLID;
        if (temperatur < siedepunkt)   return Aggregatszustand.LIQUID;
        return Aggregatszustand.GAS;
    }

    @Override
    public String toString() {
        return  "Element{symbol='" + symbol +
                "', schmelzpunkt=" + schmelzpunkt +
                ", siedepunkt=" + siedepunkt + "}";
    }

    public String getZustandsBeschreibung(float temperatur) {
      return symbol + " ist bei " + temperatur + "°C " + getAggregatszustand(temperatur).getBezeichnung();
    }
}
