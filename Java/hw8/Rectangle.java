public class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
  }

  public String getName() {
      return "Rectangle";
  }

  public double getArea() {
      return width * height;
  }

  public double getPerimeter() {
      return 2 * (width + height);
  }
}
