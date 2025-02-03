package esercizi_in_lezione.week2.day3;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);

        // credenziali predefinite
        String usernamePredefinito = "admin";
        String passwordPredefinata = "1234";

        // input dell'utente
        System.out.print("Inserire nome utente: ");
        String usernameInserito = lettore.nextLine();

        System.out.print("Inserire password: ");
        String passwordInserita = lettore.nextLine();

        // verifica 1
        if (usernamePredefinito == usernameInserito && passwordPredefinata == passwordInserita) {
            System.out.println("== Accesso consentito");
        } else {
            System.out.println("== Accesso negato");
        }

        // verifica 2
        if (usernamePredefinito.equals(usernameInserito) && passwordPredefinata.equals(passwordInserita)) {
            System.out.println("equals Accesso consentito");
        } else {
            System.out.println("equals Accesso negato");
        }

        lettore.close();
    }
}
