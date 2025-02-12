package esercizi_in_lezione.week4.day2.gestione_veicoli;

public class Auto extends Veicolo implements ICarrozzeria {
    // String marca; ereditato da Veicolo
    // String modello; ereditato da Veicolo
    // int anno; ereditato da Veicolo
    int numeroPorte;

    public Auto(String marcaParam, String modelloParam, int annoParam, int numeroPorteParam) {
        // crea un istanza della classe da cui sto ereditando e assegna i valori ai campi ereditati
        super(marcaParam, modelloParam, annoParam);
        this.numeroPorte = numeroPorteParam;
    }

    public void accelera() {
        System.out.println("L'auto sta accelerando");
    }

    public void frena() {
        System.out.println("L'auto sta frenando");
    }

    public void sterza(boolean aSinistra) {
        if (aSinistra) {
            System.out.println("L'auto gira a sinistra");
        } else {
            System.out.println("L'auto gira a destra");
        }
    }

    public void mostraAllestimento() {
        System.out.println("L'auto ha " + numeroPorte + " porte");
    }
}
