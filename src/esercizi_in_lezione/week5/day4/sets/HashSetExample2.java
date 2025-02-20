package esercizi_in_lezione.week5.day4.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {
    public static void main(String[] args) {
        // hashset di numeri interi
        HashSet<Integer> numeri = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numeri.add(i);
        }

        System.out.println(numeri);

        // Stampa con for-each
        System.out.println("\nStampa con for-each loop:");
        for (Integer num : numeri) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Stampa con Iterator
        System.out.println("Stampa con Iterator:");
        Iterator<Integer> iteratore = numeri.iterator();
        while (iteratore.hasNext()) {
            System.out.print(iteratore.next() + " ");
        }
        System.out.println();
    }
}
