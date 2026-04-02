package ch.hslu.oop.sw06;

public abstract class Element {
    protected String symbol;
    protected float schmelzpunkt;
    protected float siedepunkt;

    public Element(String symbol, float schmelzpunkt, float siedepunkt) {
        this.symbol = symbol;
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    public String getAggregatzustand(float temperatur) {
        if (temperatur < schmelzpunkt) return "fest";
        if (temperatur < siedepunkt)   return "flüssig";
        return "gasförmig";
    }

    @Override
    public String toString() {
        return  "Element{symbol='" + symbol +
                "', schmelzpunkt=" + schmelzpunkt +
                ", siedepunkt=" + siedepunkt + "}";
    }
}
