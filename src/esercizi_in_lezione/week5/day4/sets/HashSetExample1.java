package esercizi_in_lezione.week5.day4.sets;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        ArrayList<String> nomiArr = new ArrayList<>();
        nomiArr.add("Marco");
        nomiArr.add("Luca");
        nomiArr.add("Andrea");
        nomiArr.add("Marco");
        System.out.println("ArrayList: " + nomiArr);
        System.out.println("Luca è presente? " + nomiArr.contains("Luca"));  // nel caso peggiore 1 ciclo intero, O(n)

        HashSet<String> nomiHs = new HashSet<>();
        nomiHs.add("Marco");
        nomiHs.add("Luca");
        nomiHs.add("Andrea");
        nomiHs.add("Marco");
        System.out.println("HashSet: " + nomiHs);

        System.out.println("Marco è presente? " + nomiHs.contains("Marco"));  // O(1)
        System.out.println("Luca è presente? " + nomiHs.contains("Luca"));

        // crea un arraylist di 10000 elementi
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arr.add(i);
        }

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            hs.add(i);
        }

        // salva il tempo prima di iniziare a cercare
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arr.contains(i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo di ricerca in ArrayList: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            hs.contains(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("Tempo di ricerca in HashSet: " + (endTime - startTime) + " ms");
    }
}
