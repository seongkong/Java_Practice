public interface Shape {
  String getName();
  double getArea();
  double getPerimeter();
  default void printShape() {
      System.out.printf("%s: Area = %.2f, Perimeter = %.2f%n", getName(), getArea(), getPerimeter());
  }
}
