package esercizi_in_lezione.week5.day2.exception_handling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci l'età: ");
        try {
            int age = scanner.nextInt();
            checkAge(age);
            System.out.println("Accesso consentito");
        } catch (InvalidAgeException e) {
            System.out.println("Errore: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Errore generico");
        } finally {
            scanner.close();
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("L'età deve essere maggiore o uguale a 18");
        }
    }
}
