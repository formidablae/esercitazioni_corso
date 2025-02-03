package esercizi_compito.week2.dc;

//Esercizio sviluppato da DC

/*Esercizio 5: Verificatore di numeri pari o dispari
Obiettivo: Creare un programma che determini se un numero è pari o dispari e lo classifichi in una fascia di valori (negativo, piccolo, medio, grande).

Requisiti:

Il programma deve chiedere all'utente di inserire un numero intero utilizzando Scanner(System.in).
1- Deve utilizzare una variabile primitiva int per memorizzare il numero inserito.
2- Deve utilizzare una variabile boolean per determinare se il numero è pari o dispari.
3- Deve utilizzare una variabile String per memorizzare la classificazione della fascia di valori.
4- Deve avere una funzione public static String classifyRange(int num) che determina la fascia del numero.
5- Deve utilizzare un'istruzione if-elseif-else per classificare il numero nelle seguenti categorie:
"Negativo" (se < 0)
"Piccolo" (0-10)
"Medio" (11-100)
"Grande" (>100)
Deve utilizzare un'istruzione switch per stampare un messaggio appropriato in base alla fascia.
Deve stampare se il numero è pari o dispari e la sua fascia di appartenenza.*/


import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        boolean numPari = numero % 2 == 0;
        System.out.println("Il numero inserito è pari? " + numPari);

        String classNum = classifyRange(numero);

        switch (classNum) {
            default:
                System.out.println("Il numero che hai inserito è " + classNum);
        }
    }

    public static String classifyRange(int num) {
        if (num < 0) return "Negativo";
        else if (num <= 10) return "Piccolo";
        else if (num <= 100) return "Medio";
        else return "Grande";
    }
}