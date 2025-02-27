package esercizi_compito.week6.dc_pp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Universita {
    HashMap<String, Corso> corsi;
    HashMap<String, Studente> studenti;
    LinkedList<Studente> studentiInAttesa;
    HashMap<String, HashSet<Docente>> docenti;

    public Universita(HashMap<String, Corso> corsi, HashMap<String, Studente> studenti, LinkedList<Studente> studentiInAttesa) {
        this.corsi = corsi;
        this.studenti = studenti;
        this.studentiInAttesa = studentiInAttesa;

    }

    public Universita () {
        this.corsi = new HashMap<>();
        this.studenti = new HashMap<>();
        this.studentiInAttesa = new LinkedList<>();
    }

    public Studente cercaStudente(String matricola) {
        return studenti.get(matricola);
    }

    public Studente cercaStudente(String nome, String cognome) {
        for (Studente studente : studenti.values()) {
            if (studente.nome.equals(nome) && studente.cognome.equals(cognome)) {
                return studente;
            }
        }
        return null;
    }

    public void aggiungiStudenteACorso(Studente studente, Corso corso) {
        studente.corsiIscritti.add(corso);
        corso.studentiIscritti.add(studente);
    }

    public void rimuoviStudenteDaCorso(Studente studente, Corso corso) {
        studente.corsiIscritti.remove(corso);
        corso.studentiIscritti.remove(studente);
    }

    public void stampaCorsiEDocenti() {
        for (Corso corso : corsi.values()) {
            System.out.println("Corso: " + corso.nomeCorso + " Docente: " + corso.docente.nome + " " + corso.docente.cognome);
        }
    }
}
