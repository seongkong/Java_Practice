public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
      this.radius = radius;
  }

  public String getName() {
      return "Circle";
  }

  public double getArea() {
      return Math.PI * radius * radius;
  }

  public double getPerimeter() {
      return 2 * Math.PI * radius;
  }
}
