package esercizi_in_lezione.week5.day4.sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample3 {
    public static void main(String[] args) {
        // creiamo due hashset di interi
        HashSet<Integer> numeri1 = new HashSet<>();
        HashSet<Integer> numeri2 = new HashSet<>();

        // aggiungiamo elementi ai due hashset
        numeri1.add(1);
        numeri1.add(2);
        numeri1.add(3);
        numeri2.add(2);
        numeri2.add(7);
        numeri2.add(9);
        System.out.println("numeri1: " + numeri1);
        System.out.println("numeri2: " + numeri2);

        // unione dei due hashset
        HashSet<Integer> unione = new HashSet<>(numeri1);
        unione.addAll(numeri2);

        System.out.println("Unione: " + unione);

        // intersezione dei due hashset
        HashSet<Integer> intersect = new HashSet<>(numeri1);
        intersect.retainAll(numeri2);

        System.out.println("Intersezione: " + intersect);

        // Differenza (elementi presenti in numeri1 ma non in numeri2)
        HashSet<Integer> differenza = new HashSet<>(numeri1);
        differenza.removeAll(numeri2);
        System.out.println("Differenza (numeri1 - numeri2): " + differenza);

        HashSet<Integer> differenza2 = new HashSet<>(numeri2);
        differenza2.removeAll(numeri1);
        System.out.println("Differenza (numeri2 - numeri1): " + differenza2);
    }
}
