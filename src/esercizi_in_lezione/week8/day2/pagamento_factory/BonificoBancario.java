package esercizi_in_lezione.week8.day2.pagamento_factory;

public class BonificoBancario implements MetodoPagamento {
    private String iban;

    public BonificoBancario(String iban) {
        this.iban = iban;
    }

    @Override
    public void paga(double importo) {
        System.out.println("Pagamento di  €" + importo + " con bonifico bancario " + iban);
    }
}
