package esercizi_in_lezione.week3.day2;

public class Libro {
    String titolo;
    String autore;
    int annoPubblicazione;

    public Libro(String titoloParam, String autoreParam, int annoPubblicazioneParam) {
        this.titolo = titoloParam;
        this.autore = autoreParam;
        this.annoPubblicazione = annoPubblicazioneParam;
    }

    // public void mostraDettagli() {
    //     System.out.println("Titolo: " + titolo);
    //     System.out.println("Autore: " + autore);
    //     System.out.println("Anno di pubblicazione: " + annoPubblicazione);
    // }
    public String toString() {
        return "Libro{titolo='" + titolo + "', autore='" + autore + "', annoPubblicazione=" + annoPubblicazione + "}";
    }

    public static void main(String[] args) {
        Libro ilMioLibro = new Libro(
            "Il Signore degli Anelli",
            "J.R.R.",
            1954
        );
        // ilMioLibro.mostraDettagli();

        String ilMioTesto = "Qualcosa";
        double ilMioNumero = 5.4;
        System.out.println(ilMioTesto);
        System.out.println(ilMioNumero);
        System.out.println(ilMioLibro);
    }
}
