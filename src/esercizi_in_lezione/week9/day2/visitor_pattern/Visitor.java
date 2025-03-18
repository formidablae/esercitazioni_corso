package esercizi_in_lezione.week9.day2.visitor_pattern;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
    void visit(Square square);
}
