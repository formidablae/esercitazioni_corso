package esercizi_in_lezione.week8.day2.forma_factory;

import java.util.Scanner;

public class FactoryPatternFormeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tipo di forma (CERCHIO/RETTANGOLO/TRIANGOLO): ");
        String tipoForma = scanner.nextLine().toUpperCase();

        try {
            Forma forma = FormaFactory.getForma(tipoForma);
            forma.disegna();
            ((Cerchio) forma).getRaggio();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
