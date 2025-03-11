package esercizi_in_lezione.week8.day2.veicolo_factory;

public class VeicoloFactory {
    public static Veicolo getVeicolo(String tipo) {
        if (tipo.equalsIgnoreCase("AUTO")) {
            return new Auto();
        } else if (tipo.equalsIgnoreCase("MOTO")) {
            return new Moto();
        } else {
            throw new IllegalArgumentException("Tipo di veicolo non supportato.");
        }
    }
}
