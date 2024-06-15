public abstract class Employee extends Person {
  protected String department;

  public Employee(String department, String name, String id, String email) {
      super(name, id, email);
      this.department = (department.isEmpty() ? "Not Yet Defined" : department);
  }
}
