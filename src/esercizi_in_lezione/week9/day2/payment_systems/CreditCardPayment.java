package esercizi_in_lezione.week9.day2.payment_systems;

public class CreditCardPayment implements IPaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento di €" + amount + " con carta di credito");
    }
}
