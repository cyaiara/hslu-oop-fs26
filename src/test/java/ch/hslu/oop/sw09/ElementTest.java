package ch.hslu.oop.sw09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElementTest {
  @Test
  void testGetAggregatszustand() {
    Lead lead = new Lead();
    assertEquals(Aggregatszustand.SOLID, lead.getAggregatszustand(22f));
  }

  @Test
  void testGetZustandsBeschreibung() {
    Lead lead = new Lead();
    assertEquals("Pb ist bei 22.0°C fest", lead.getZustandsBeschreibung(22f));
  }

  @Test
  void testToString() {
    Lead lead = new Lead();
    assertEquals("GIFTIGElement{symbol='Pb', schmelzpunkt=327.5, siedepunkt=1749.0, zustand bei raumtemperatur=SOLID}", lead.toString());
  }
}



