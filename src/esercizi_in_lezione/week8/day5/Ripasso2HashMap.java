package esercizi_in_lezione.week8.day5;

import java.util.HashMap;

public class Ripasso2HashMap {
    public static void main(String[] args) {
        // TODO: Inserire in una struttura dati i seguenti dati:
        HashMap<String, HashMap<String, String>> risultati = new HashMap<>();

        HashMap<String, String> gara1 = new HashMap<>();
        gara1.put("PrimoPosto", "Max Verstappen");
        gara1.put("SecondoPosto", "Lewis Hamilton");
        gara1.put("TerzoPosto", "Valtteri Bottas");

        HashMap<String, String> gara2 = new HashMap<>();
        gara2.put("PrimoPosto", "Charles Leclerc");
        gara2.put("SecondoPosto", "Carlos Sainz");
        gara2.put("TerzoPosto", "Lando Norris");

        HashMap<String, String> gara3 = new HashMap<>();
        gara3.put("PrimoPosto", "Sebastian Vettel");
        gara3.put("SecondoPosto", "Lance Stroll");
        gara3.put("TerzoPosto", "Fernando Alonso");

        risultati.put("RisulatoGara1", gara1);
        risultati.put("RisulatoGara2", gara2);
        risultati.put("RisulatoGara3", gara3);

        System.out.println(risultati);
        // "Gara1":
        //    - "PrimoPosto": "Max Verstappen"
        //    - "SecondoPosto": "Lewis Hamilton"
        //    - "TerzoPosto": "Valtteri Bottas"
        // "Gara2":
        //    - "PrimoPosto": "Charles Leclerc"
        //    - "SecondoPosto": "Carlos Sainz"
        //    - "TerzoPosto": "Lando Norris"
        // "Gara3":
        //    - "PrimoPosto": "Sebastian Vettel"
        //    - "SecondoPosto": "Lance Stroll"
        //    - "TerzoPosto": "Fernando Alonso"

        // TODO: creare una struttura dati per memorizzare i punteggi dei piloti
        HashMap<String, Integer> punteggi = new HashMap<>();
        punteggi.put("Max Verstappen", 100);
        punteggi.put("Charles Leclerc", 80);
        punteggi.put("Lando Norris", 75);
        punteggi.put("Lewis Hamilton", 50);

        System.out.println(punteggi);
        // "Max Verstappen": 100
        // "Charles Leclerc": 80
        // "Lando Norris": 75
        // "Lewis Hamilton": 50
    }
}
