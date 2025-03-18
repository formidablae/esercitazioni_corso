package esercizi_in_lezione.week9.day2.visitor_pattern;

public class AreaCalculator implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = (triangle.getBase() * triangle.getHeight()) / 2;
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    public void visit(Square square) {
        double area = square.getSide() * square.getSide();
        System.out.println("Area of Square: " + area);
    }
}
