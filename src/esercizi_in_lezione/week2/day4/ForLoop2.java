package esercizi_in_lezione.week2.day4;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        System.out.println("Prima del ciclo for");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una lettera: ");
        char lettera = scanner.next().charAt(0);
        System.out.print("Inserisci una parola: ");
        String parola = scanner.next();
        int indice = -1;
        for (int i = 0; i < parola.length(); i++) {
            System.out.println("Durante il ciclo for. i = " + i);
            char letteraDaControllare = parola.charAt(i);
            System.out.println("Lettera da controllare in questa iterazione: " + letteraDaControllare);
            if (lettera == letteraDaControllare) {
                indice = i;
                break;
            }
        }
        System.out.println("Sono uscito dal ciclo for");
        if (indice >= 0) System.out.println("La lettera " + lettera + " è presente nella parola '" + parola + "' nella posizione: " + indice);
        else System.out.println("La lettera " + lettera + " non è presente nella parola '" + parola + "'");
    }
}
