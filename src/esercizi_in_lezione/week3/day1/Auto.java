package esercizi_in_lezione.week3.day1;

// Veicolo
//    ^
//    |
//    |
//  Auto

public class Auto extends Veicolo {
    // String marca; ereditato da Veicolo
    // String modello; ereditato da Veicolo
    // int anno; ereditato da Veicolo
    int numeroPorte;

    public Auto(String marcaParam, String modelloParam, int annoParam, int numeroPorteParam) {
        // crea un istanza della classe da cui sto ereditando e assegna i valori ai campi ereditati
        super(marcaParam, modelloParam, annoParam);
        this.numeroPorte = numeroPorteParam;
    }

    public void sterza(boolean aSinistra) {
        if (aSinistra) {
            System.out.println("Giro a sinistra");
        } else {
            System.out.println("Giro a destra");
        }
    }

    public static void main(String[] args) {
        Auto laMiaAuto = new Auto("Ford", "Focus", 2022, 5);
        laMiaAuto.stampaDettagli();
        String ilModello = laMiaAuto.getModello();
        System.out.println("Il modello: " + ilModello);
        laMiaAuto.sterza(false);

        Veicolo ilMioVeicolo = new Veicolo("Mercedes", "Benz", 2000);
        // ilMioVeicolo.sterza();

        Veicolo ilMioVeicolo2 = new Auto("Ford", "Focus", 2022, 5);
        ilMioVeicolo2.stampaDettagli();
        // int ilNumeroDiPorte = ilMioVeicolo2.numeroPorte;

        // Auto ilMioVeicolo3 = new Veicolo("Ford", "Focus", 2022);
        // System.out.println("Il modello: " + ilMioVeicolo2.getModello());
    }
}
