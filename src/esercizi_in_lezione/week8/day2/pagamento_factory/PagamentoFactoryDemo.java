package esercizi_in_lezione.week8.day2.pagamento_factory;

import java.util.Scanner;

public class PagamentoFactoryDemo {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = MetodoPagamentoFactory.getMetodoPagamento("PayPal", "a.b@c.com");
        metodoPagamento.paga(100.0);
        metodoPagamento = MetodoPagamentoFactory.getMetodoPagamento("Bonifico", "IT1234567890123456789012345");
        metodoPagamento.paga(200.0);
        metodoPagamento = MetodoPagamentoFactory.getMetodoPagamento("Carta", "1234-5678-9012-3456");
        metodoPagamento.paga(300.0);

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tipo di metodo di pagamento: ");
        String tipo = scanner.nextLine();
        System.out.print("Inserisci le informazioni del metodo di pagamento: ");
        String info = scanner.nextLine();
        MetodoPagamento metodoPagamento2 = MetodoPagamentoFactory.getMetodoPagamento(tipo, info);
        metodoPagamento2.paga(400.0);
        scanner.close();
    }
}
