package ch.hslu.oop.mep_preparation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.Warning;
import nl.jqno.equalsverifier.EqualsVerifier;


public class KaffeebohneTest {
  @Test
  void testGetGewicht() {
    Kaffeebohne kaffeebohne = new Kaffeebohne("Ethiopia");
    assertEquals(0, kaffeebohne.getGewicht());
  }

  @Test
  void testExceptionMessage(){
    Exception e = assertThrows(IllegalArgumentException.class, () -> {
      new Kaffeebohne("Ah");
    });
    assertEquals("Herkunftsangabe mit mindestens drei Buchstaben.", e.getMessage());
  }

  /* equals verifier */
  @Test
  void testEqualsContract() {
    EqualsVerifier.forClass(Kaffeebohne.class)
    .suppress(Warning.ALL_FIELDS_SHOULD_BE_USED)
    .verify();
  }

  @Test
  void testIdentity(){
    Kaffeebohne kaffeebohne = new Kaffeebohne("Ethiopia");
    Kaffeebohne kaffeebohne2 = new Kaffeebohne("Ethiopia");
    assertEquals(kaffeebohne, kaffeebohne2);
  }

  @Test
  void testNoIdentity(){
    Kaffeebohne kaffeebohne = new Kaffeebohne("Ethiopia");
    Kaffeebohne kaffeebohne2 = new Kaffeebohne("Colombia");
    assertNotEquals(kaffeebohne, kaffeebohne2);
  }

  @Test
  void testSameHashCode(){
    Kaffeebohne kaffeebohne = new Kaffeebohne("Ethiopia");
    Kaffeebohne kaffeebohne2 = new Kaffeebohne("Ethiopia");
    assertEquals(kaffeebohne.hashCode(), kaffeebohne2.hashCode());
  }

  @Test
  void testNotSameHashCode(){
    Kaffeebohne kaffeebohne = new Kaffeebohne("Ethiopia");
    Kaffeebohne kaffeebohne2 = new Kaffeebohne("Colombia");
    assertNotEquals(kaffeebohne.hashCode(), kaffeebohne2.hashCode());
  }

  // Variante 1: exakter Vergleich
  @Test
  void testToString() {
    Kaffeebohne kaffeebohne = new Kaffeebohne("Ethiopia");
    assertEquals("Kaffeebohne[herkunft=Ethiopia, gewicht=0]", kaffeebohne.toString());
  }

  // Variante 2: nur prüfen ob Werte enthalten sind (robuster)
  @Test
  void testToStringContainsHerkunft() {
    Kaffeebohne kaffeebohne = new Kaffeebohne("Ethiopia");
    assertTrue(kaffeebohne.toString().contains("Ethiopia"));
  }

  @Test
  void testAddCoffee() {
    Kaffeebohne kaffeebohne = new Kaffeebohne("Ethiopia");
    assertEquals(10, kaffeebohne.addCoffee(10));
  }

  @Test
  void testAddMoreCoffee() {
    Kaffeebohne kaffeebohne2 = new Kaffeebohne("Ethiopia");
    assertEquals(15, kaffeebohne2.addCoffee(15));
  }

  @Test
  void testTakeCoffee() {

  }

  @Test
  void testTakeEspresso() {

  }


}
