/*
Esercizio 2: Convertitore di voti
Obiettivo: Creare un programma che converta un voto numerico in una lettera (A, B, C, D, F) e fornisca un messaggio di feedback.

Requisiti:

Il programma deve chiedere all'utente di inserire un voto numerico (0-100) utilizzando Scanner(System.in).
Deve utilizzare una variabile double per il voto originale e una variabile int per il voto arrotondato (con casting esplicito).
Deve utilizzare una variabile String per il voto in formato lettera.
Deve avere una funzione public static String getLetterGrade(int grade) che converte il voto numerico in una lettera.
Deve utilizzare un'istruzione if-elseif-else per determinare il voto letterale.
Deve utilizzare un'istruzione switch per stampare un messaggio motivazionale in base alla lettera ottenuta.
Deve gestire eventuali inserimenti non validi.
*/

import java.util.Scanner;

public class Ese_2_Live {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un voto da 0 a 100: ");
        double votoOriginale = scanner.nextDouble();
        int votoArrotondato = (int)votoOriginale;
        String voto = getLetterGrade(votoArrotondato);
        switch (voto) {
            case "A": System.out.println("Bravissimo"); break;
            case "B": System.out.println("Molto bene"); break;
            case "C": System.out.println("Bravo"); break;
            case "D": System.out.println("Puoi fare meglio"); break;
            case "F": System.out.println("Impegnati di più"); break;
            default: System.out.println("Il voto inserito non è valido");
        }

    }
    //Metodo per avere voto letterale
    public static String getLetterGrade(int grade) {
        String votoLetterale = "";
        if (grade >= 85 && grade <= 100) {
            votoLetterale = "A";
        }
        else if (grade >= 70 && grade < 85) {
            votoLetterale = "B";
        }
        else if (grade >= 55 && grade < 70) {
            votoLetterale = "C";
        }
        else if (grade >= 40 && grade < 55) {
            votoLetterale = "D";
        }
        else if (grade >= 0 && grade < 40) {
            votoLetterale = "F";
        }
        return votoLetterale;
    }
}
