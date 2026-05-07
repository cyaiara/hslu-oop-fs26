package ch.hslu.oop.sw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TemperaturTest {
  @Test
  void testUngueltigeTemperatur(){
    assertThrows(IllegalArgumentException.class, () -> {
      Temperatur.createFromCelsius(-273.16f);
    });
  }

  @Test
  void testGueltigeTemperatur(){
    assertDoesNotThrow(() -> {
      Temperatur.createFromCelsius(-273.14f);
    });
  }

  @Test
  void testExceptionMessage(){
    Exception e = assertThrows(IllegalArgumentException.class, () -> {
      Temperatur.createFromCelsius(-500f);
    });
    assertEquals("Invalid Temperature", e.getMessage());
  }



  @Test
  void testCompareTo() {

  }

  @Test
  void testConvertCelsiustoKelvin() {

  }

  @Test
  void testConvertKelvintoCelsius() {

  }

  @Test
  void testCreateFromCelsius() {

  }

  @Test
  void testCreateFromKelvin() {

  }

  @Test
  void testEquals() {

  }

  @Test
  void testGetAggregatzustand() {

  }

  @Test
  void testGetTempCelsius() {

  }

  @Test
  void testGetTempFahrenheit() {

  }

  @Test
  void testGetTempKelvin() {

  }

  @Test
  void testHashCode() {

  }

  @Test
  void testMain() {

  }

  @Test
  void testToString() {

  }
}
