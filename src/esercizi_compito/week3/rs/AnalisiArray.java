package esercizi_compito.week3.rs;

import java.util.Random;

/*
Scrivere un programma Java che esegua diverse operazioni su un array di numeri interi utilizzando cicli e condizioni.
Istruzioni:
 - Creare un array di 15 numeri casuali compresi tra 50 e 150.
 - Stampare l’array utilizzando un ciclo for.
 - Trovare e stampare:
    - La somma dei numeri dispari.
    - Il prodotto dei numeri pari (attenzione al rischio di overflow!).
    - Il secondo numero più grande nell’array.
 - Contare e stampare quanti numeri sono multipli di 5.
 - Stampare l’array al contrario.
 */
public class AnalisiArray {
    public static void main(String[] args) {
        // Implementare qui la soluzione
        int[] arrayInput = arrayRandom(10, 50, 150);
    }

    public static int[] arrayRandom(int lunghezza, int minimo, int massimo) {
        int[] numbers = new int[lunghezza]; // Array di 15 numeri
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(massimo - minimo + 1) + minimo;
        }

        return numbers;
    }
}
