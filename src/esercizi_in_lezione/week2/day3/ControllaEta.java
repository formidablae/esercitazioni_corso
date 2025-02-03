package esercizi_in_lezione.week2.day3;

import java.util.Scanner;

public class ControllaEta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        if (eta < 18) {
            System.out.println("Accesso negato.");
        } else if (eta <= 65) {
            System.out.println("Accesso consentito.");
        } else {
            System.out.println("Attenzione: verifica età avanzata.");
        }

        scanner.close();
    }
}
