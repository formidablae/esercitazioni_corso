package esercizi_compito.week6.dc_pp;

import java.util.HashSet;

public class Corso {
    String codice;
    String nomeCorso;
    HashSet<Studente> studentiIscritti;
    Docente docente;
    final int MAX_STUDENTI = 3;

    public Corso(String codice, String nomeCorso, Docente docente) {
        this.codice = codice;
        this.nomeCorso = nomeCorso;
        this.studentiIscritti = new HashSet<>();
        this.docente = docente;
        docente.aggiungiCorso(this);

    }

    public void assegnaDocente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Corso{" +
                "codice='" + codice + '\n' +
                ", nomeCorso='" + nomeCorso + '\n' +
                ", studentiIscritti=" + studentiIscritti + '\n' +
                ", docente=" + docente + '\n' +
                '}';
    }
}
