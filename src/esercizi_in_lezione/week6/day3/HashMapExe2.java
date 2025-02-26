package esercizi_in_lezione.week6.day3;

import java.util.HashMap;

public class HashMapExe2 {
    public static void main(String[] args) {
        HashMap<String, Integer> prodotti = new HashMap<>();

        prodotti.put("Laptop", 1000);
        prodotti.put("Tablet", 300);
        prodotti.put("Telefono", 500);
        prodotti.put("Laptop", 200);

        System.out.println(prodotti);
        System.out.println("Prezzo tablet: " + prodotti.get("Tablet"));  // O(1)

        String maxProdotto = "";
        int maxPrezzo = Integer.MIN_VALUE;

        for (String prodotto : prodotti.keySet()) {
            if (prodotti.get(prodotto) > maxPrezzo) {
                maxPrezzo = prodotti.get(prodotto);
                maxProdotto = prodotto;
            }
        }
        System.out.println("Il prodotto più costoso è " + maxProdotto + " con un prezzo di " + maxPrezzo + " euro");

        // array tradizionali
        // ArrayList
        // HashSet
        // LinkedList
        // HashMap
        // Classi custom
    }
}
