package Desktop.Java.HW3;

class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    public double calculateAreaRatio(Circle otherCircle) {
        return calculateArea() / otherCircle.calculateArea();
    }
}