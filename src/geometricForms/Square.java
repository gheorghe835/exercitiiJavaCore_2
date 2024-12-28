package geometricForms;

public class Square extends GeometricForms implements Form{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateAria() {
        return side * side;
    }
}
