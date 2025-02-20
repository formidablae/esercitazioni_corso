package esercizi_in_lezione.week5.day4.autoboxing_unboxing;

public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println("a == b? " + (a == b));  // True (valori nella cache di Integer [-128, 127])
        System.out.println("c == d? " + (c == d));  // False (fuori dalla cache)
        System.out.println("a.equals(b)? " + (a.equals(b)));
        System.out.println("c.equals(d)? " + (c.equals(d)));
    }
}
