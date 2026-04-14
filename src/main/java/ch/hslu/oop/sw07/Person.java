package ch.hslu.oop.sw07;

import java.util.Objects;

public class Person {
  private final long ID;
  private String Name;
  private String Firstname;

  public Person(final long ID, String Name, String Firstname){
    this.ID = ID;
    this.Name = Name;
    this.Firstname = Firstname;
  }

  public long getID(){
    return this.ID;
  }

  public String getName(){
    return this.Name;
  }

  public String getFirstname(){
    return this.Firstname;
  }

  @Override
  public String toString(){
    return "Person[ID=" + this.ID + ", Name=" + this.Name + ", Firstname=" + this.Firstname +"]";
  }

  /* Objektreferenzen identisch? */
  @Override
  public final boolean equals(final Object object){
    if (this == object) {
      return true;
    }
    if (!(object instanceof Person other)) {
      return false;
    }
    return (other.ID == this.ID);
  }

  @Override
  public final int hashCode() {
    return Objects.hash(this.ID);
  }

}
