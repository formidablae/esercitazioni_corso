package esercizi_in_lezione.week3.day4;

class Cerchio extends FiguraGeometrica {
    private double raggio;

    public Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double nuovoRaggio) {
        if (nuovoRaggio > 0) {
            System.out.println("Raggio era: " + this.raggio + ", diventa: " + nuovoRaggio);
            this.raggio = nuovoRaggio;
        }
        else System.out.println("Errore: Il raggio deve essere positivo");
    }

    public String toString() {
        return "Cerchio con raggio: " + raggio;
    }
}