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
        this.docenti = new HashMap<>();
    }

    public Universita () {
        this.corsi = new HashMap<>();
        this.studenti = new HashMap<>();
        this.studentiInAttesa = new LinkedList<>();
        this.docenti = new HashMap<>();
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
        if (corso.studentiIscritti.size() >= corso.MAX_STUDENTI) {
            for (Corso altroCorso : corsi.values()) {
                if (altroCorso.studentiIscritti.size() < altroCorso.MAX_STUDENTI) {
                    studente.corsiIscritti.add(altroCorso);
                    altroCorso.studentiIscritti.add(studente);
                    System.out.println("Studente assegnato al corso " + altroCorso.nomeCorso);
                    return;
                }
            }
            System.out.println(studentiInAttesa.size());
            studentiInAttesa.add(studente);
            System.out.println(studentiInAttesa.size());
            System.out.println("Errore: raggiunto il numero massimo di studenti per il corso selezionato");
            return;
        }
        studente.corsiIscritti.add(corso);
        corso.studentiIscritti.add(studente);
    }

    public void rimuoviStudenteDaCorso(Studente studente, Corso corso) {
        studente.corsiIscritti.remove(corso);
        corso.studentiIscritti.remove(studente);
        if (studentiInAttesa.size() > 0) {
            aggiungiStudenteACorso(studentiInAttesa.getFirst(), corso);
            System.out.println("Studente assegnato al corso " + corso.nomeCorso);
            studentiInAttesa.removeFirst();
        }
    }

    public void stampaCorsiEDocenti() {
        for (Corso corso : corsi.values()) {
            System.out.println("Corso: " + corso.nomeCorso + " Docente: " + corso.docente.nome + " " + corso.docente.cognome);
        }
    }

    public void aggiungiDocente(Docente docente) {
        HashSet<Docente> docentiEsistenti = this.docenti.getOrDefault(docente.getDipartimentoDiAppartenenza(), new HashSet<>());
        docentiEsistenti.add(docente);
        docenti.put(docente.getDipartimentoDiAppartenenza(), docentiEsistenti);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Corsi: \n");
        for (Corso corso : corsi.values()) {
            sb.append(corso.toString()).append("\n");
        }
        sb.append("Studenti: \n");
        for (Studente studente : studenti.values()) {
            sb.append(studente.toString()).append("\n");
        }
        sb.append("Studenti in attesa: \n");
        for (Studente studente : studentiInAttesa) {
            sb.append(studente.toString()).append("\n");
        }
        sb.append("Docenti: \n");
        for (HashSet<Docente> docenti : docenti.values()) {
            for (Docente docente : docenti) {
                sb.append(docente.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
