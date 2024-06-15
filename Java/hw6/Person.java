public abstract class Person {
  protected String name;
  protected String id;
  protected String email;

  public Person(String name, String id, String email) {
      this.name = name;
      this.id = id;
      this.email = (email.isEmpty() ? "Not Yet Defined" : email);
  }

  public abstract void writeOutput();
}
