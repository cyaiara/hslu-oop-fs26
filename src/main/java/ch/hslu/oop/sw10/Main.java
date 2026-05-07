package ch.hslu.oop.sw10;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    String input;
    Scanner scanner = new Scanner(System.in);
    do {
        IO.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
        input = scanner.next();
          try {
            float value = Float.valueOf(input);
            LOG.info("Temperaturwert: {}°C", value);
          } catch (NumberFormatException e) {
              if (!"exit".equals(input)) {
                IO.println("Invalid Input: please enter temperature in format 0.0");
                LOG.error("Invalid Input", e);
              }
          }
    } while (!"exit".equals(input));
    System.out.println("Programm beendet.");
  }

  // Temperatur t = new Temperatur(20);
  // --> geht nun aufgrund factory methoden nicht mehr --> neue temperatur nurnoch via factory methoden

}
