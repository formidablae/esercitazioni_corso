package esercizi_in_lezione.week5.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Inserisci un numero intero: ");
            int numero = scanner.nextInt();
            System.out.println("Hai inserito: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Errore: Devi inserire un numero intero!");
        } finally {
            scanner.close();
            System.out.println("Scanner chiuso.");
        }
    }
}

