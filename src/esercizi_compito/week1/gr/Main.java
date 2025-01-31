package esercizi_compito.week1.gr;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Esercizio 1: Classificazione dell'età
Obiettivo: Creare un programma che chieda all'utente il suo anno di nascita, calcoli la sua età e lo classifichi in una categoria di età utilizzando una dichiarazione switch.

Requisiti:

Il programma deve richiedere all'utente di inserire il proprio anno di nascita utilizzando Scanner(System.in).
Deve utilizzare una variabile primitiva di tipo int per memorizzare l'anno di nascita e calcolare l'età.
Deve utilizzare una variabile String per memorizzare la categoria di età dell'utente.
Deve eseguire un casting implicito o esplicito (se necessario).
Deve contenere una funzione public static String getAgeCategory(int age) che restituisce la categoria dell'età in base all'età calcolata.
Deve utilizzare un'istruzione if-elseif-else per determinare la categoria dell'utente.
Deve utilizzare un'istruzione switch per stampare un messaggio in base alla categoria dell'età.
Il programma deve gestire casi speciali, come inserimenti non validi (es. un anno maggiore del corrente).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);
        System.out.print("Inserisci il tuo anno di nascita: ");
        int anno = lettore.nextInt();
        int eta = 2025 - anno;
        String categoria = getAgeCategory(eta);
        switch (categoria){
            case "eta non valida":
                System.out.println("Hai inserito un eta non valida");
                break;
            default: System.out.println("Tu sei un "+ categoria);
        }
    }
    public static String getAgeCategory(int age){
        if (age>18){
            return  "adulto";
        }
        else if (age>=13) {
            return "adolescente";
        }
        else if (age>0) {
            return "bambino";
        }
        else{
            return "eta non valida";
        }
    }

}