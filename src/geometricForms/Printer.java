package geometricForms;

public class Printer {
    public static void main(String[] args) {
        GeometricForms circle = new Circle(23.6);
        GeometricForms square = new Square(9);


        System.out.println(circle.description() + "  Cerc cu raza:: " + ((Circle)circle).getRadius() + " cm.");
        System.out.println("      Perimetru:: " + circle.calculatePerimeter()+ " cm.");
        System.out.println("  Aria cercului:: " + circle.calculateAria()+ " cm.");

        System.out.println();

        System.out.println(square.description() + "  Patrat cu latura:: " + ((Square)square).getSide() + " cm.");
        System.out.println("        Perimetru:: " + square.calculatePerimeter()+ " cm.");
        System.out.println("  Aria patratului:: " + square.calculateAria()+ " cm.");
    }
}
