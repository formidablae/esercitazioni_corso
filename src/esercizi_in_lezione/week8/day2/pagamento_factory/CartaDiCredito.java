package esercizi_in_lezione.week8.day2.pagamento_factory;

public class CartaDiCredito implements MetodoPagamento {
    private String numeroCarta;

    public CartaDiCredito(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    @Override
    public void paga(double importo) {
        System.out.println("Pagamento di  €" + importo + " con carta di credito " + numeroCarta);
    }
}
