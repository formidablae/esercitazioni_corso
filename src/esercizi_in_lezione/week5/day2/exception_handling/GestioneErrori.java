package esercizi_in_lezione.week5.day2.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestioneErrori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserisci un numero");
            int numero1 = scanner.nextInt();
            System.out.println("Inserisci un secondo numero");
            int numero2 = scanner.nextInt();
            System.out.println("Il risultato della divisione è: " + (numero1 / numero2));
        } catch (ArithmeticException e) {
            System.out.println("Non puoi dividere per 0");
        } catch (InputMismatchException e) {
            System.out.println("Non hai inserito un numero");
        } catch (Exception e) {
            System.out.println("Errore generico");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
