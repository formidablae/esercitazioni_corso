package esercizi_in_lezione.week3.day4;

abstract class FiguraGeometrica {
    private String nome;

    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nuovoNome) {
        this.nome = nuovoNome;
    }

    public abstract double calcolaArea();

    public abstract double calcolaPerimetro();

    public abstract String toString();

    public void print() {
        System.out.println(this);
    }
}

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

public class GestioneCalcoliGeometrici {
    public static void main(String[] args) {
        // FiguraGeometrica figGeom = new FiguraGeometrica("Figura");
        Rettangolo ilMioRettangolo1 = new Rettangolo(5.0, 10.0);
        Rettangolo ilMioRettangolo2 = new Rettangolo(3.0, 6.0);
        Rettangolo ilMioRettangolo3 = new Rettangolo(7.0, 4.0);
        Cerchio ilMioCerchio1 = new Cerchio(4.0);
        Cerchio ilMioCerchio2 = new Cerchio(8.0);
        Cerchio ilMioCerchio3 = new Cerchio(5.0);

        FiguraGeometrica[] elencoFigureGeometriche = {ilMioRettangolo1, ilMioRettangolo2, ilMioRettangolo3, ilMioCerchio1, ilMioCerchio2, ilMioCerchio3};
        String elencoFigureGeometricheStr = getString(elencoFigureGeometriche);
        System.out.println("Le mie figure geometriche:\n" + elencoFigureGeometricheStr);

        double lAreaRett1 = ilMioRettangolo1.calcolaArea();
        System.out.println("lAreaRett1: " + lAreaRett1);

        double lAreaCerc1 = ilMioCerchio1.calcolaArea();
        System.out.println("lAreaCerc1: " + lAreaCerc1);

        double lAreaElemPos0 = elencoFigureGeometriche[0].calcolaArea();
        System.out.println("lAreaElemPos0: " + lAreaElemPos0);

        ((Rettangolo) elencoFigureGeometriche[0]).setLarghezza(6.0);
        ((Cerchio) elencoFigureGeometriche[3]).setRaggio(5.0);
        // ((Cerchio) elencoFigureGeometriche[1]).setRaggio(5.0);
    }

    public static String getString(FiguraGeometrica[] figGeo) {
        String res = "";
        for (int i = 0; i < figGeo.length; i++) {
            res += "  - " + figGeo[i] + "\n";
        }
        return res;
    }
}
