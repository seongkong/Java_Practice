import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[5];

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Enter the type of shape (rectangle, triangle, circle): ");
            String type = scanner.next();
            switch (type.toLowerCase()) {
                case "rectangle":
                    System.out.println("Enter width and height: ");
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    shapes[i] = new Rectangle(width, height);
                    break;
                case "triangle":
                    System.out.println("Enter base and height: ");
                    double base = scanner.nextDouble();
                    double triangleHeight = scanner.nextDouble();
                    shapes[i] = new Triangle(base, triangleHeight);
                    break;
                case "circle":
                    System.out.println("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shapes[i] = new Circle(radius);
                    break;
                default:
                    System.out.println("Invalid type, using a default circle with radius 1.");
                    shapes[i] = new Circle(1);
                    break;
            }
        }

        System.out.println("Printing all shapes:");
        for (Shape shape : shapes) {
            shape.printShape();
        }

        scanner.close();
    }
}
