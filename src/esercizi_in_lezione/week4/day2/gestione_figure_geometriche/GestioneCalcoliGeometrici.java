package esercizi_in_lezione.week4.day2.gestione_figure_geometriche;

import java.util.Arrays;

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
        System.out.println("Le mie figure geometriche:\n" + Arrays.toString(elencoFigureGeometriche)
            .replace("[", "[\n  ")
            .replace(", ", ",\n  ")
            .replace("]", "\n]"));

        double lAreaRett1 = ilMioRettangolo1.calcolaArea();
        System.out.println("lAreaRett1: " + lAreaRett1);

        double lAreaCerc1 = ilMioCerchio1.calcolaArea();
        System.out.println("lAreaCerc1: " + lAreaCerc1);

        double lAreaElemPos0 = elencoFigureGeometriche[0].calcolaArea();
        System.out.println("lAreaElemPos0: " + lAreaElemPos0);

        ((Rettangolo) elencoFigureGeometriche[0]).setLarghezza(6.0);
        ((Cerchio) elencoFigureGeometriche[3]).setRaggio(5.0);
        // ((Cerchio) elencoFigureGeometriche[1]).setRaggio(5.0);

        System.out.println("\nprint()");
        elencoFigureGeometriche[0].print();
        elencoFigureGeometriche[3].print();
    }
}
