package esercizi_in_lezione.week8.day2.pagamento_factory;

public class MetodoPagamentoFactory {
    public static MetodoPagamento getMetodoPagamento(String tipo, String info) {
        switch (tipo.toUpperCase()) {
            case "CARTA":
                return new CartaDiCredito(info);
            case "PAYPAL":
                return new PayPal(info);
            case "BONIFICO":
                return new BonificoBancario(info);
            default:
                throw new IllegalArgumentException("Tipo di metodo di pagamento non supportato.");
        }
    }
}
