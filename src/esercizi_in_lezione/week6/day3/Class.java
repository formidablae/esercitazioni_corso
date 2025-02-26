package esercizi_in_lezione.week6.day3;

import java.util.ArrayList;
import java.util.HashMap;

public class Class {
    ArrayList<Person> studenti;
    ArrayList<Person> docenti;
    HashMap<String, Integer> voti;

    public Class() {
        studenti = new ArrayList<>();
        docenti = new ArrayList<>();
        voti = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Class(\n" +
                "studenti: " + studenti + ",\n" +
                "docenti: " + docenti + ",\n" +
                "voti: " + voti + "\n" +
                ")";
    }
}
