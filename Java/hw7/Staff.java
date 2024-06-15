public class Staff extends Employee {
  public Staff(String department, String name, String id, String email) {
      super(department, name, id, email);
  }

  @Override
  public void writeOutput() {
      System.out.println("Staff, " + (department.equals("") ? "Not Yet Defined" : department) + ", " + "Name: " + name + ", " + "Staff ID: " + id + ", " + email);
  }
}
