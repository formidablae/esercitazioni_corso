package esercizi_in_lezione.week8.day2.pagamento_factory;

public class PayPal implements MetodoPagamento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void paga(double importo) {
        System.out.println("Pagamento di €" + importo + " con PayPal " + email);
    }
}
