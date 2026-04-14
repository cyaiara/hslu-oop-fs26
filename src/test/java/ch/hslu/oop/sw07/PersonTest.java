package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class PersonTest {

  @Test
  void testGetFirstname() {
    Person person = new Person(433392, "Jemand", "Vielleicht");
    assertEquals("Vielleicht", person.getFirstname());
  }

  @Test
  void testGetID() {
    Person person = new Person(433392, "Jemand", "Vielleicht");
    assertEquals(433392, person.getID());
  }

  @Test
  void testGetName() {
    Person person = new Person(433392, "Jemand", "Vielleicht");
    assertEquals("Jemand", person.getName());
  }

  /* equals verifier */
  @Test
  void testEqualsContract() {
    EqualsVerifier.forClass(Person.class)
    .suppress(Warning.ALL_FIELDS_SHOULD_BE_USED)
    .verify();
  }

  @Test
  void testIdentity(){
    Person person1 = new Person(433392, "Stein", "Cya");
    Person person2 = new Person(433392, "Stein", "Cya");
    assertEquals(person1, person2);
  }

  @Test
  void testNoIdentity(){
    Person person1 = new Person(777221, "Muster", "Mike");
    Person person2 = new Person(999999, "Steiger", "Rein");
    assertNotEquals(person1, person2);
  }



}
