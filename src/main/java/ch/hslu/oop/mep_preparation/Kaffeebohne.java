package ch.hslu.oop.mep_preparation;
import java.util.Objects;

/**
 * Modelliert eine Kaffeebohne mit Herkunft und Gewicht.
 *
 * <p>Gleichheit: Diese Klasse nutzt Wertegleichheit auf dem Attribut 'herkunft',
 * weil zwei Kaffeebohnen-Einträge mit derselben Herkunft dieselbe
 * Sorte repräsentieren und im Magazin eindeutig identifiziert werden.</p>
 *
 * @author Chiara Steindl
 */

public final class Kaffeebohne {
  private final String herkunft;
  private int gewicht = 0;

  public Kaffeebohne(final String herkunft){
    if (herkunft == null) {
      throw new IllegalArgumentException("Bitte Herkunft angeben.");
    }
    if (herkunft.length() < 3) {
      throw new IllegalArgumentException("Herkunftsangabe mit mindestens drei Buchstaben.");
    }
    this.herkunft = herkunft;
  }

  public String getHerkunft(){
    return this.herkunft;
  }

  public int getGewicht(){
    return this.gewicht;
  }

  public int addCoffee(int gewicht){
    return this.gewicht += gewicht;
  }

  public int takeCoffee(int gewicht){
    if (this.gewicht >= gewicht) {
        this.gewicht -= gewicht;
        return gewicht;
    }
    return 0;
  }

  // Überladung von takeCoffee Methode - hier ohne Parameter, deshalb gültig
  public int takeCoffee(){
    return takeCoffee(7);
  }

  @Override
  public final boolean equals(final Object o) {
    if (this == o) return true;
    if (!(o instanceof Kaffeebohne other)) return false;
    return Objects.equals(herkunft, other.herkunft);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(this.herkunft);
  }


  @Override
  public String toString(){
    return "Kaffeebohne[herkunft=" + this.herkunft + ", gewicht=" + this.gewicht +"]";
  }
}
