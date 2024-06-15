package Desktop.Java.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first radius: ");
        double radius1 = scanner.nextDouble();

        System.out.print("Enter the second radius: ");
        double radius2 = scanner.nextDouble();

        Circle circle1 = new Circle();
        circle1.setRadius(radius1);

        Circle circle2 = new Circle();
        circle2.setRadius(radius2);

        double area1 = circle1.calculateArea();
        double circumference1 = circle1.calculateCircumference();
        double area2 = circle2.calculateArea();
        double circumference2 = circle2.calculateCircumference();
        double areaRatio = circle1.calculateAreaRatio(circle2);

        System.out.printf("First circle: The area is %.2f and the circumference is %.2f.\n", area1, circumference1);
        System.out.printf("Second circle: The area is %.1f and the circumference is %.1f.\n", area2, circumference2);
        System.out.printf("The ratio of the areas is %.2f.\n", areaRatio);

        scanner.close();
    }
}