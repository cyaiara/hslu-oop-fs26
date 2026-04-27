package ch.hslu.oop.sw09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperaturVerlaufTest {

  @Test
  void testAdd(){
    TemperaturVerlauf verlauf = new TemperaturVerlauf();
    Temperatur temperatur1 = new Temperatur(27f);
    verlauf.add(temperatur1);
    Temperatur temperatur2 = new Temperatur(22.8f);
    verlauf.add(temperatur2);
    assertEquals(2, verlauf.getCount());
  }

  @Test
  void testClear(){
    TemperaturVerlauf verlauf = new TemperaturVerlauf();
    Temperatur temperatur1 = new Temperatur(27f);
    verlauf.add(temperatur1);
    Temperatur temperatur2 = new Temperatur(22.8f);
    verlauf.add(temperatur2);
    verlauf.clear();
    assertEquals(0, verlauf.getCount());
  }

  @Test
  void testGetCount(){
    TemperaturVerlauf verlauf = new TemperaturVerlauf();
    Temperatur temperatur1 = new Temperatur(27f);
    verlauf.add(temperatur1);
    assertEquals(1, verlauf.getCount());
    Temperatur temperatur2 = new Temperatur(22.8f);
    verlauf.add(temperatur2);
    assertEquals(2, verlauf.getCount());
    verlauf.clear();
    assertEquals(0, verlauf.getCount());
  }
}
