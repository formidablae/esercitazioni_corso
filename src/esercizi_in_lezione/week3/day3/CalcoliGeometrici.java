package esercizi_in_lezione.week3.day3;

class Rettangolo {
    private double larghezza;
    private double altezza;

    public Rettangolo(double largh, double alt) {
        this.larghezza = largh;
        this.altezza = alt;
    }

    public double getLarghezza(){
        return larghezza;
    }

    public double getAltezza(){
        return altezza;
    }

    public void setLarghezza(double larghezza) {
        if (larghezza > 0) {
            this.larghezza = larghezza;
        } else {
            System.out.println("Errore: la larghezza deve essere positiva.");
        }
    }

    public void setAltezza(double altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("Errore: l'altezza deve essere positiva.");
        }
    }

    public double calcolaArea() {
        return larghezza * altezza;
    }

    public double calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }

    public double getLatoCorto() {
        if (larghezza < altezza) {
            return larghezza;
        }
        return altezza;
    }

    public String toString() {
        return "Rettangolo con dimensioni: " + larghezza + "x" + altezza;
    }

    public void print() {
        System.out.println(this);
    }
}

public class CalcoliGeometrici {

    public static void main(String[] args) {
        Rettangolo[] rettangoli = {
            new Rettangolo(4.0, 3.0),
            new Rettangolo(5.0, 2.0),
            new Rettangolo(6.5, 7.0),
            new Rettangolo(8.0, 4.0),
        };

        Rettangolo rettAreaMagg = rettangoli[0];
        Rettangolo rettPeriMagg = rettangoli[0];
        Rettangolo rettLatoCort = rettangoli[0];
        String elencoRettStr = "Questo è l'elenco dei rettangoli:\n";
        for (int i = 0; i < rettangoli.length; i++) {
            elencoRettStr += rettangoli[i] + "\n";
            if(rettangoli[i].calcolaArea() > rettAreaMagg.calcolaArea()) {
                rettAreaMagg = rettangoli[i];
            }

            if (rettangoli[i].calcolaPerimetro() > rettPeriMagg.calcolaPerimetro()) {
                rettPeriMagg = rettangoli[i];
            }

            if (rettangoli[i].getLatoCorto() < rettLatoCort.getLatoCorto()) {
                rettLatoCort = rettangoli[i];
            }
        }
        System.out.println(elencoRettStr);
        System.out.println("Il rettangolo con l'area maggiore è: " + rettAreaMagg + " ed corrisponde a: " + rettAreaMagg.calcolaArea());
        System.out.println("Il rettangolo con il perimetro più grande è: " + rettPeriMagg + " ed corrisponde a: " + rettPeriMagg.calcolaPerimetro());
        System.out.println("Il rettangolo con il lato più corto è: " + rettLatoCort + " ed corrisponde a: " + rettLatoCort.getLatoCorto());
    }
}
