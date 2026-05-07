package ch.hslu.oop.sw11;

/**
* Schalter:
* Methode einschalten switchOn
* Methode ausschalten switchOff
* Rückgabe True wenn isSwitchedOn
* Rückgabe True wenn isSwitchedOff
*/

public interface Switchable {

  void switchOn();

  void switchOff();

  boolean isSwitchedOn();

  boolean isSwitchedOff();

}
