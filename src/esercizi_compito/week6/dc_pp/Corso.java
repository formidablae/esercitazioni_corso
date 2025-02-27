package esercizi_compito.week6.dc_pp;

import java.util.HashSet;

public class Corso {
    String codice;
    String nomeCorso;
    HashSet<Studente> studentiIscritti;

    public Corso(String codice, String nomeCorso) {
        this.codice = codice;
        this.nomeCorso = nomeCorso;
        this.studentiIscritti = new HashSet<>();
    }
}
