package esercizi_in_lezione.week9.day2.visitor_pattern;

public class Triangle implements Shape  {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
