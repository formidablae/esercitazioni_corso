package esercizi_compito.week7.dc2;

import java.util.HashSet;

public class GestoreUtenti {
    private HashSet<String> utenti;

    public GestoreUtenti() {
        utenti = new HashSet<>();
    }

    public void aggiungiUtente(String nome) {
        utenti.add(nome);
    }

    public HashSet<String> getUtenti() {
        return utenti;
    }

    public void rimuoviUtente(String nome) {
        utenti.remove(nome);
    }

    public boolean verificaEsistenzaUtente(String nome) {
        return utenti.contains(nome);
    }
}
