public class Under extends Student {
  public Under(String department, String name, String id, String email) {
      super(department, name, id, email);
  }

  @Override
  public void writeOutput() {
      System.out.println("Under, " + (department.equals("") ? "Not Yet Defined" : department) + ", " + "Name: " + name + ", " + "Under Student Number: " + id + ", " + email);
  }
}
