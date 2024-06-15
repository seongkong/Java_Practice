public class Grad extends Student {
  public Grad(String department, String name, String id, String email) {
      super(department, name, id, email);
  }

  @Override
  public void writeOutput() {
      System.out.println("Grad, " + (department.equals("") ? "Not Yet Defined" : department) + ", " + "Name: " + name + ", " + "Grad Student Number: " + id + ", " + email);
  }
}
