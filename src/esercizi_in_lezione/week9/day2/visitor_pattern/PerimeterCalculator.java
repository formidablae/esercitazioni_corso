package esercizi_in_lezione.week9.day2.visitor_pattern;

public class PerimeterCalculator implements  Visitor {
    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    @Override
    public void visit(Triangle triangle) {
        double side = Math.sqrt(Math.pow(triangle.getBase(), 2) + Math.pow(triangle.getHeight(), 2));
        double perimeter = triangle.getBase() + triangle.getHeight() + side;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }

    @Override
    public void visit(Square square) {
        double perimeter = square.getSide() * 4;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}
