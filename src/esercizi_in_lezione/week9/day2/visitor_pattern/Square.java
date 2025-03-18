package esercizi_in_lezione.week9.day2.visitor_pattern;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return width;
    }
}
