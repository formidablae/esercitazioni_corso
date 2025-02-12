package esercizi_in_lezione.week4.day2.gestione_figure_geometriche;

public class Quadrato extends Rettangolo {
    private double lato;

    public Quadrato(double lato) {
        super(lato, lato);
        this.lato = lato;
    }

    public String toString() {
        return "Quadrato con lato: " + lato;
    }
}
