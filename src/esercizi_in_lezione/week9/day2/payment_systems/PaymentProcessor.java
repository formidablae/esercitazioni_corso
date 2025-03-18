package esercizi_in_lezione.week9.day2.payment_systems;

public class PaymentProcessor {
    public static void processPayment(PaymentTypeEnum type, double amount) {
        IPaymentMethod paymentMethod;

        switch (type) {
            case CREDIT_CARD:
                paymentMethod = new CreditCardPayment();
                break;
            case PAYPAL:
                paymentMethod = new PayPalPayment();
                break;
            case BANK_TRANSFER:
                paymentMethod = new BankTransferPayment();
                break;
            default:
                throw new IllegalArgumentException("Tipo di pagamento non supportato");
        }

        paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        processPayment(PaymentTypeEnum.CREDIT_CARD, 100.0);
        processPayment(PaymentTypeEnum.PAYPAL, 50.0);
        processPayment(PaymentTypeEnum.BANK_TRANSFER, 200.0);
    }
}
