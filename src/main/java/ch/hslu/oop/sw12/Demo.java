package ch.hslu.oop.sw12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {

    Person p1 = new Person(377728, "Muster", "Zax");
    Person p2 = new Person(111111, "Jemand", "Vielleicht");
    Person p3 = new Person(12223, "Jemand", "Save");

    ArrayList<Person> personList = new ArrayList<>();

    personList.add(p1);
    personList.add(p2);
    personList.add(p3);
    System.out.println(personList);

    Collections.sort(personList, (pers1, pers2) -> pers1.getName().compareTo(pers2.getName()));
    System.out.println(personList);

    // Vergleich Nachname
    Comparator<Person> nameComp = (pers1, pers2) -> pers1.getName().compareTo(pers2.getName());
    Collections.sort(personList, nameComp);
    System.out.println(personList);

    // Vergleich Vorname
    Comparator<Person> firstnameComp = (pers1, pers2) -> pers1.getFirstname().compareTo(pers2.getFirstname());
    Collections.sort(personList, firstnameComp);
    System.out.println(personList);

    // Vergleich Nachname, dann Vorname
    Collections.sort(personList, nameComp.thenComparing(firstnameComp));
    System.out.println(personList);

    Collections.sort(personList, nameComp.reversed());
    System.out.println(personList);

    // alte möglichkeit jedes element der liste auszugeben
    for (Person p : personList) {
    System.out.println(p);
    }

    // stream und lambda möglichkeit jedes element der liste auszugeben
    personList.stream().forEach (p -> System.out.println(p));

    // oder noch kürzer:
    personList.stream().forEach(System.out::println);

    // alle mit Anfangsbuchstaben M:
    personList.stream()
          .filter(p -> p.getName().startsWith("M"))
          .forEach(System.out::println);

    // Ausgabe des alphabetisch ersten Namen aus der Liste (via nameComp Comparator):
    personList.stream()
          .min(nameComp)
          .ifPresent(System.out::println);

    // Anzahl Personen die mit M beginnen:
    long count = personList.stream()
          .filter(p -> p.getName().startsWith("M"))
          .count();
    System.out.println(count);




    }

}
