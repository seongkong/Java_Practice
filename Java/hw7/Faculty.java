public class Faculty extends Employee {
  public Faculty(String department, String name, String id, String email) {
      super(department, name, id, email);
  }

  @Override
  public void writeOutput() {
      System.out.println("Faculty, " + (department.equals("") ? "Not Yet Defined" : department) + ", " + "Name: " + name + ", " + "Faculty ID" + id + ", " + email);
  }
}
