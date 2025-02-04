package esercizi_compito.week3.rs;

import java.util.Arrays;
import java.util.Random;

/*
Scrivere un programma Java che esegua diverse operazioni su un array di numeri interi utilizzando cicli e condizioni.
Istruzioni:
 - Creare un array di 5 numeri casuali compresi tra 50 e 150.
 - Stampare l’array utilizzando un ciclo for.
 - Trovare e stampare:
    - La somma dei numeri dispari.
    - Il prodotto dei numeri pari
    - Il secondo numero più grande nell’array.
 - Contare e stampare quanti numeri sono multipli di 5.
 - Stampare l’array al contrario.
 */
public class AnalisiArray {
    public static void main(String[] args) {
        // Implementare qui la soluzione
        int[] arrayInput = arrayRandom(5, 10, 50);
        int lunghezza = arrayInput.length;
        int sommaDispari = 0;
        int prodottoPari = 1;
        int secNMax;
        int conta = 0;
        int[] arrayOut = new int[lunghezza];
        String arrayContrario = "";
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;


        for(int i=0 ; i<lunghezza; i++){

            System.out.print(", " + arrayInput[i]);

            if(arrayInput[i] % 2 != 0){
                 sommaDispari += arrayInput[i];

            }

            else {

                prodottoPari = prodottoPari*arrayInput[i];

            }

            if (arrayInput[i] % 5 == 0 ){

                conta = +1;
            }

            if (arrayInput[i] > max1) {
                max2 = max1;
                max1 = arrayInput[i];
            } else if (arrayInput[i] > max2 && arrayInput[i] < max1) {
                max2 = arrayInput[i];
            }

            arrayContrario += arrayInput[lunghezza-i-1] + ", ";

            arrayOut[i] = arrayInput[lunghezza-i-1];


        }

        System.out.println("\nLa somma dei numeri dispari è: " + sommaDispari);
        System.out.println("Il prodotto dei numeri pari è: " + prodottoPari);
        System.out.println("Sono presenti N° " + conta + " che sono multipli di 5");
        System.out.println("L'array al contrario è "+ arrayContrario);
        System.out.println("L'array out "+ Arrays.toString(arrayOut));
        System.out.println("Il secondo valore piu' alto è: " + max2);
    }

    public static int[] arrayRandom(int lunghezza, int minimo, int massimo) {
        int[] numbers = new int[lunghezza];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(massimo - minimo + 1) + minimo;
        }

        return numbers;
    }
}
