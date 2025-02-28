package esercizi_in_lezione.week6.day5;

public class TestSconti {
    public static void main(String[] args) {
        ProdottoScontato prodotto = new ProdottoScontato("Prodotto 1", 1000);
        double prezzoScontato = prodotto.calcolaSconto(10);
        System.out.println("Prezzo scontato: " + prezzoScontato);
    }
}
