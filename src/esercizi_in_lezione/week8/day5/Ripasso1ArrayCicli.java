package esercizi_in_lezione.week8.day5;

import java.util.ArrayList;
import java.util.HashSet;

public class Ripasso1ArrayCicli {
    public static void main(String[] args) {
        int[] numeri = new int[5];
        numeri[0] = 1;
        numeri[1] = 2;
        numeri[2] = 3;
        numeri[3] = 4;
        numeri[4] = 5;

        stampaArray(numeri);

        int[] numeri2 = {1, 2, 3, 4, 5};
        stampaArray(numeri2);

        ArrayList<Integer> numeri3 = new ArrayList<>();
        numeri3.add(1);
        numeri3.add(2);
        numeri3.add(3);
        stampaArray(numeri3);

        HashSet<Integer> numeri4 = new HashSet<>();
        numeri4.add(1);
        numeri4.add(5);
        numeri4.add(3);
        System.out.println(numeri4);
        if (numeri4.contains(1)) {
            // per hashset la complessità computazionale per trovare un elemento è O(1)
            System.out.println("Trovato");
        }

        if (numeri3.contains(1)) {
            // per arraylist la complessità computazionale per trovare un elemento è O(n)
            System.out.println("Trovato");
        }

        // ordine di complessità computazionale
        // O(1) -> costante
        // O(logn) -> logaritmica
        // O(n) -> lineare
        // O(nlogn) -> n log n (es. quicksort)
        // O(n^2) -> quadratica (es. bubblesort)
        // O(2^n) -> esponenziale
    }

    public static void stampaArray(int[] array) {
        String numeri = "";
        for (int i = 0; i < array.length; i++) {
            numeri += array[i] + " ";
        }
        System.out.println(numeri);
    }

    public static void stampaArray(ArrayList<Integer> array) {
        System.out.println(array);
    }
}
