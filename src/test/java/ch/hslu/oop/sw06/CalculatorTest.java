package ch.hslu.oop.sw06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  void testAdd(){
    Calculator calculator = new Calculator();
    assertEquals(10, calculator.getAdd(5, 5));
  }

  @Test
  void testSub(){
    Calculator calculator = new Calculator();
    assertEquals(10, calculator.getSub(12, 2));
  }

  @Test
  void testMulti(){
    Calculator calculator = new Calculator();
    assertEquals(10, calculator.getMulti(-1, -10));
  }

  @Test
  void testDiv(){
    Calculator calculator = new Calculator();
    assertEquals(10, calculator.getDiv(-40, -4));
  }

}
