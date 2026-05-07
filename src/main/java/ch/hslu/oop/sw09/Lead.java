package ch.hslu.oop.sw09;

public class Lead extends Element {
    public Lead() {
        super("Pb", 327.5f, 1749f);
    }

    // @Override
    // public String toString(){
    //     return  "GIFTIG" +
    //             "Element{symbol='" + symbol +
    //             "', schmelzpunkt=" + schmelzpunkt +
    //             ", siedepunkt=" + siedepunkt +"}";
    // }


    @Override
    public String toString(){
        return  "GIFTIG" +
                "Element{symbol='" + symbol +
                "', schmelzpunkt=" + schmelzpunkt +
                ", siedepunkt=" + siedepunkt +
                ", zustand bei raumtemperatur=" + Aggregatszustand.SOLID +"}";
    }



    // @Override
    // public String toString(){
    //     return  "GIFTIG" +
    //             "Element{symbol='" + symbol +
    //             "', schmelzpunkt=" + schmelzpunkt +
    //             ", siedepunkt=" + siedepunkt +"}";
    // }
}
