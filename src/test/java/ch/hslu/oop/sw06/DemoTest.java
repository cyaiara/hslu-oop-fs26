package ch.hslu.oop.sw06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class DemoTest {
  @Test
  void testGetMax3() {
    Demo demo = new Demo();
    assertEquals(11, demo.getMax3(1, 3, 11));
  }

  @Test
  void test2GetMax3() {
    Demo demo = new Demo();
    assertEquals(-1, demo.getMax3(-22, -44444444, -1));
  }

  @Test
  void test3GetMax3() {
    Demo demo = new Demo();
    assertEquals(0, demo.getMax3(0, 0, 0));
  }

  @Test
  void test4GetMax3() {
    Demo demo = new Demo();
    assertEquals(0, demo.getMax3(-1, -3, 0));
  }

  @Test
  void test5GetMax3() {
    Demo demo = new Demo();
    assertEquals(11, demo.getMax3(11, -11, 0));
  }

  @Test
  void testGetMax4() {
    Demo demo = new Demo();
    assertEquals(22, demo.getMax4(9, 5, 13,22));
  }



}
