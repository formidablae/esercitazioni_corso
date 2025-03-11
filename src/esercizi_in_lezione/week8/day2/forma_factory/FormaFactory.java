package esercizi_in_lezione.week8.day2.forma_factory;

public class FormaFactory {
    public static Forma getForma(String tipo) {
        if (tipo.equalsIgnoreCase("CERCHIO")) {
            return new Cerchio();
        } else if (tipo.equalsIgnoreCase("RETTANGOLO")) {
            return new Rettangolo();
        } else if (tipo.equalsIgnoreCase("TRIANGOLO")) {
            return new Triangolo();
        } else {
            throw new IllegalArgumentException("Tipo di forma non supportato.");
        }
    }
}
