package esercizi_compito.week2.gg;


import java.util.Scanner;

/*
Esercizio 3: Calcolatrice Semplice
Obiettivo: Creare un programma che esegua operazioni matematiche (addizione, sottrazione, moltiplicazione, divisione) in base all'input dell'utente.

Requisiti:

Il programma deve richiedere due numeri in input utilizzando Scanner(System.in).
Deve utilizzare due variabili primitive double per memorizzare i numeri inseriti.
Deve utilizzare una variabile String per memorizzare l'operatore scelto (+, -, *, /).
Deve avere una funzione public static double calculate(double a, double b, String op) che esegue il calcolo richiesto.
Deve utilizzare un'istruzione if-elseif-else o un operatore ternario per gestire la divisione per zero.
Deve utilizzare un'istruzione switch per eseguire l'operazione matematica richiesta.
Deve stampare il risultato finale a schermo.
Deve gestire eventuali inserimenti errati o operatori non validi.
 */
public class Esercizio_1 {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);
        // Richiesta utente
        System.out.print("Inserisci il primo numero ");
        double n1 = lettore.nextDouble();
        // seconda richiesta
        System.out.print("Inserisci il secondo numero ");
        double n2 = lettore.nextDouble();

        // terza richiesta
        System.out.print("Inserisci l'operatore (+, -, *, /) ");
        String op = lettore.next();

        // Variabile che richiama la funzione di controllo
        double result = calculate(n1, n2, op);

        // verifiva se il secondo numero sia uguale a 0
        if(op.equals("/") && n2 == 0){
            System.out.println("Errore: Divisione per zero");
        }
        else{
            System.out.println("Il risultato è "+ result);
        }

    }
    // Funzione per il calcolo
    public static double calculate(double a, double b, String op){

        // Operaotore Switch per assegnare e controllare le operazione
        switch (op){
            case "+": return a + b;
            case "-": return a - b;
            case "/": if(b != 0) {return a / b;}
            case "*": return a * b;
            default:
                System.out.println("Operatore non presente tra quelli accettati");
                return 0;
        }
    }
}
