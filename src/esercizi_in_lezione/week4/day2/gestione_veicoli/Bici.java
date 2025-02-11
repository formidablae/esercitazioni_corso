package esercizi_in_lezione.week4.day2.gestione_veicoli;

public class Bici extends Veicolo {
    public Bici(String marcaParam, String modelloParam, int annoParam) {
        super(marcaParam, modelloParam, annoParam);
    }

    public void accelera() {
        System.out.println("La bici sta accelerando");
    }

    public void frena() {
        System.out.println("La bici sta frenando");
    }

    public void sterza(boolean aSinistra) {
        if (aSinistra) {
            System.out.println("La bici gira a sinistra");
        } else {
            System.out.println("La bici gira a destra");
        }
    }
}
