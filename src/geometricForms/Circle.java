package geometricForms;

public class Circle extends GeometricForms implements Form{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateAria() {
        return Math.PI * radius * radius;
    }
}
