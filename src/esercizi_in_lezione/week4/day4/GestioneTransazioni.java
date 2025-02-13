package esercizi_in_lezione.week4.day4;

class ContatoreTransazioni {
    private static int numeroTransazioni = 0;

    public static int getNumeroTransazioni() {
        return numeroTransazioni;
    }

    public static void resetNumeroTransazioni() {
        numeroTransazioni = 0;
    }

    public static void incrementaNumeroTransazioni() {
        numeroTransazioni++;
    }
}

class Transazione {
    private String idTransazione;
    private String dataTransazione;
    private double importoTransazione;
    private int visualizzazioniTransazione = 0;
    private static int visualizzazioniDiTutteLeTransazioni = 0;

    public Transazione(String dataTransazione, double importoTransazione) {
        ContatoreTransazioni.incrementaNumeroTransazioni();
        this.idTransazione = "trx" + ContatoreTransazioni.getNumeroTransazioni();
        this.dataTransazione = dataTransazione;
        this.importoTransazione = importoTransazione;
    }

    public int getVisualizzazioniTransazione() {
        return visualizzazioniTransazione;
    }

    public static int getVisualizzazioniDiTutteLeTransazioni() {
        return visualizzazioniDiTutteLeTransazioni;
    }

    public String toString() {
        visualizzazioniTransazione++;
        visualizzazioniDiTutteLeTransazioni++;
        return "Transazione{" +
                "idTransazione='" + idTransazione + '\'' +
                ", dataTransazione='" + dataTransazione + '\'' +
                ", importoTransazione=" + importoTransazione +
                '}';
    }
}

public class GestioneTransazioni {
    public static void main(String[] args) {
        System.out.println("Numero totale di transazioni: " + ContatoreTransazioni.getNumeroTransazioni());
        Transazione transazione1 = new Transazione("2024-03-20", 100.0);
        System.out.println("Numero totale di transazioni: " + ContatoreTransazioni.getNumeroTransazioni());
        Transazione transazione2 = new Transazione("2024-03-21", 200.0);
        System.out.println("Numero totale di transazioni: " + ContatoreTransazioni.getNumeroTransazioni());

        System.out.println(transazione1);
        System.out.println(transazione2);
        System.out.println("Numero totale di visualizzazioni della trx 2: " + transazione2.getVisualizzazioniTransazione());
        System.out.println(transazione2);
        System.out.println(transazione2);
        System.out.println("Numero totale di visualizzazioni della trx 2: " + transazione2.getVisualizzazioniTransazione());

        // crea 25 trx
        for (int i = 0; i < 25; i++) {
            Transazione trxI = new Transazione("2024-03-20", 100.0);
            System.out.println(trxI);
        }
        System.out.println("Numero totale di transazioni: " + ContatoreTransazioni.getNumeroTransazioni());
        System.out.println("Numero totale di visualizzazioni della trx 1: " + transazione1.getVisualizzazioniTransazione());
        System.out.println("Numero totale di visualizzazioni della trx 2: " + transazione2.getVisualizzazioniTransazione());
        System.out.println("Numero totale di visualizzazioni di tutte le transazioni: " + Transazione.getVisualizzazioniDiTutteLeTransazioni());

        Transazione transazione28 = new Transazione("2024-03-21", 200.0);
        System.out.println("Numero totale di visualizzazioni della trx 28: " + transazione28.getVisualizzazioniTransazione());
        System.out.println("Numero totale di visualizzazioni di tutte le transazioni: " + Transazione.getVisualizzazioniDiTutteLeTransazioni());
    }
}
