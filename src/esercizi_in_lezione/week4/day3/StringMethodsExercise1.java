package esercizi_in_lezione.week4.day3;

import java.util.Scanner;

public class StringMethodsExercise1 {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);

        System.out.println("Inserisci una frase");
        String frase = lettore.nextLine();

        // conta il numero di parole
        String[] parole = frase.split(" ");
        System.out.println("Il numero di parole è: " + parole.length);

        // convertire in maiuscolo
        String fraseMaiuscolo = frase.toUpperCase();
        System.out.println("La frase in maiuscolo è: " + fraseMaiuscolo);

        // convertire in minuscolo
        String fraseMinuscolo = frase.toLowerCase();
        System.out.println("La frase in minuscolo è: " + fraseMinuscolo);

        // controllare se la frase è palindroma
        String fraseSenzaSpazi = frase.replaceAll(" ", "");
        String fraseInversa = "";
        for (int i = fraseSenzaSpazi.length() - 1; i >= 0; i--) {
            fraseInversa += fraseSenzaSpazi.charAt(i);
        }
        if (fraseSenzaSpazi.equals(fraseInversa)) {
            System.out.println("La frase è palindroma");
        } else {
            System.out.println("La frase non è palindroma");
        }

        // conta il numero di caratteri
        int numeroCaratteri = fraseSenzaSpazi.length();
        System.out.println("Il numero di caratteri è: " + numeroCaratteri);

        // prendi una sottostringa dalla posizione 3 alla posizione 7
        String sottostringa = frase.substring(3, 7);
        System.out.println("La sottostringa è: " + sottostringa);

        // controllare se la frase contiene la parola "ciao"
        if (frase.contains("ciao")) {
            System.out.println("La frase contiene la parola 'ciao'");
        } else {
            System.out.println("La frase non contiene la parola 'ciao'");
        }

        // trovare l'indice della prima occonenza della parola "mia"
        int indice = frase.indexOf("mia");
        if (indice != -1) {
            System.out.println("L'indice della prima occorrenza della parola 'mia' è: " + indice);
        } else {
            System.out.println("La frase non contiene la parola 'mia'");
        }
    }
}
