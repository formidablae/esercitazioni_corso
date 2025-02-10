package esercizi_in_lezione.week3.day4;

class Rettangolo extends FiguraGeometrica {
    private double larghezza;
    private double altezza;

    public Rettangolo(double larghezza, double altezza) {
        super("Rettangolo");
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public double getLarghezza(){
        return larghezza;
    }

    public double getAltezza(){
        return altezza;
    }

    public void setLarghezza(double nuovaLarghezza) {
        if (nuovaLarghezza > 0) {
            System.out.println("Larghezza era: " + this.larghezza + ", diventa: " + nuovaLarghezza);
            this.larghezza = nuovaLarghezza;
        } else {
            System.out.println("Errore: la larghezza deve essere positiva.");
        }
    }

    public void setAltezza(double nuovaAltezza) {
        if (nuovaAltezza > 0) {
            System.out.println("Altezza era: " + this.altezza + ", diventa: " + nuovaAltezza);
            this.altezza = nuovaAltezza;
        } else {
            System.out.println("Errore: l'altezza deve essere positiva.");
        }
    }

    @Override
    public double calcolaArea() {
        return larghezza * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }

    public String toString() {
        return "Rettangolo con dimensioni: " + larghezza + "x" + altezza;
    }
}