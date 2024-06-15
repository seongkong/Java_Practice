public abstract class Student extends Person {
  protected String department;

  public Student(String department, String name, String id, String email) {
      super(name, id, email);
      this.department = department;
  }
}
