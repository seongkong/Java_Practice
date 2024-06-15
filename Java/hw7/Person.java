public abstract class Person implements Comparable<Person> {
  protected String name;
  protected String id;
  protected String email;
  protected String department;

  public Person(String name, String id, String email) {
      this.department = department;
      this.name = name;
      this.id = id;
      this.email = (email.isEmpty() ? "Not Yet Defined" : email);
  }

  @Override
public int compareTo(Person other) {
    int nameComparison = this.name.compareTo(other.name);
    if (nameComparison != 0) {
        return nameComparison;
    }

    if (this.department == null && other.department == null) {
        return 0;
    } else if (this.department == null) {
        return -1; 
    } else if (other.department == null) {
        return 1; 
    }
    return this.department.compareTo(other.department);
}

    public abstract void writeOutput();
}