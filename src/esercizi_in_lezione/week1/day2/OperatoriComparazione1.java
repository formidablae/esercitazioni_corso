package esercizi_in_lezione.week1.day2;

import java.util.Scanner;

public class OperatoriComparazione1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int x = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(x + " è maggiore di " + y);
        } else if (x < y) {
            System.out.println(x + " è minore di " + y);
        } else {
            System.out.println(x + " è uguale a " + y);
        }

        if (x >= y) {
            System.out.println(x + " è maggiore o uguale a " + y);
        } else {
            System.out.println(x + " è minore di " + y);
        }

        if (x <= y) {
            System.out.println(x + " è minore o uguale a " + y);
        } else {
            System.out.println(x + " è maggiore di " + y);
        }

        if (x == y) {
            System.out.println(x + " è uguale a " + y);
        } else {
            System.out.println(x + " è diverso da " + y);
        }

        // fai qualcosa0 qui

        // if (condizione1) {
            // fai qualcosa1 qui
        // } else if (condizione2) {
            // fai qualcosa2 qui
        // } else if (condizione3) {
            // fai qualcosa3 qui
        // } else {
            // fai qualcosa4 qui
        //     return
        // }

        // fai qualcosa5 qui

        scanner.close();

        String ilMioTesto = "Il mio testo da verificare";
        char laMiaLettera = 't';
        int posizione = trovaLaPosizioneDellaLett(ilMioTesto, laMiaLettera);
        System.out.println("posizione di " + laMiaLettera + " nel seguente testo: '" + ilMioTesto + "' è: " + posizione);
    }

    public static int trovaLaPosizioneDellaLett(String testo, char lettera) {
        for (int i = 0; i < testo.length(); i++) {
            char letteraAllaPosizioneI = testo.charAt(i);
            if (letteraAllaPosizioneI == lettera) {
                return i;
            }
        }

        return -1;
    }
}
