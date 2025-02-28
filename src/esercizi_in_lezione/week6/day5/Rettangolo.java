package esercizi_in_lezione.week6.day5;

public record Rettangolo(double base, double altezza) {
    public double area() {
        return base * altezza;
    }

    public  double perimetro() {
        return 2 * (base + altezza);
    }
}

class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        System.out.println(rettangolo.area());
        System.out.println(rettangolo.perimetro());
    }
}
