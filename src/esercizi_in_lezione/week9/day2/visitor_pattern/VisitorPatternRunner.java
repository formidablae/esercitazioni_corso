package esercizi_in_lezione.week9.day2.visitor_pattern;

public class VisitorPatternRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 5);
        Circle circle1 = new Circle(3);
        Triangle triangle1 = new Triangle(4, 6);
        Square square1 = new Square(5);
        Rectangle rectangle2 = new Rectangle(3, 5);
        Circle circle2 = new Circle(6);
        Triangle triangle2 = new Triangle(7, 6);
        Square square2 = new Square(3);

        AreaCalculator areaCalculator = new AreaCalculator();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();

        Shape[] shapes = {rectangle1, circle1, triangle1, square1, rectangle2, circle2, triangle2, square2};
        System.out.println("AreaCalculator: ");
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("PerimeterCalculator: ");
        for (Shape shape : shapes) {
            shape.accept(perimeterCalculator);
        }
    }
}
