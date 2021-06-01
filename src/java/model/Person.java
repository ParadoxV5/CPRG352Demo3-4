package model;
public class Person implements java.io.Serializable {
  private static final long serialVersionUID = 1;
  
  private String name;
  public String getName() { return name; }
  public void setName(String name) { this.name = (name == null ? "" : name); }
  
  public Person() {
    name = "";
  }
  public Person(String name) {
    setName(name);
  }
}