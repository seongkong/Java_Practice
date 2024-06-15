public class Triangle implements Shape {
  private double base;
  private double height;

  public Triangle(double base, double height) {
      this.base = base;
      this.height = height;
  }

  public String getName() {
      return "Triangle";
  }

  public double getArea() {
      return base * height / 2;
  }

  public double getPerimeter() {
      double hypotenuse = Math.sqrt(base * base + height * height);
      return base + height + hypotenuse;
  }
}
