package esercizi_compito.week5.gr;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionComparison {
    public static void main(String[] args) {
        // 10, 20, 30, 40, 50, 10, 25, 50
        // 1. creare un hashset composto da questi numeri
        // 2. creare un arraylist composto da questi numeri
        // 3. dire cosa ci aspettiamo di avere nel risultato di ciascuno
        // 4. stampare le due strutture dati e verificare i risultati
        int[] elencoNumeri = new int[]{10, 20, 30, 40, 50, 10, 25, 50};
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < elencoNumeri.length; i++) {
            arrayList.add(elencoNumeri[i]);
            hashSet.add(elencoNumeri[i]);
        }
        // Nell'arrayList ci saranno questi numeri 10, 20, 30, 40, 50, 10, 25, 50.
        // Nell'hashSet ci saranno questi numeri 10, 20, 30, 40, 50, 25; non necessariamente in questo ordine.
        System.out.println("Questo è l'ArrayList: "+ arrayList);
        System.out.println("Questo è l'Hashset: "+ hashSet);
        // 5. eliminare dal hashset e dall'arraylist il numero 50
        hashSet.remove(50);
        // elimina tutti i valori 50 con Integer usando un metodo di arraylist
        arrayList.removeIf(n -> n == 50);
        System.out.println("Questo è l'ArrayList: "+ arrayList);
        System.out.println("Questo è l'Hashset: "+ hashSet);
        // creare un arraylist di stringhe
        ArrayList<String> stringhe = new ArrayList<>();
        stringhe.add("ciao");
        stringhe.add("hello");
        stringhe.add("hola");
        System.out.println("stringhe: " + stringhe);
        stringhe.remove("hello");
        System.out.println("stringhe: " + stringhe);
    }
}