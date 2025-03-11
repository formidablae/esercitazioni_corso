package esercizi_in_lezione.week8.day2.veicolo_factory;

import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tipo di veicolo (AUTO/MOTO): ");
        String tipoVeicolo = scanner.nextLine().toUpperCase();

        try {
            Veicolo veicolo = VeicoloFactory.getVeicolo(tipoVeicolo);
            veicolo.guida();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
