package esercizi_compito.week6.dc_pp;


import java.util.ArrayList;

/*
1. Creare una classe Persona con attributi nome e cognome.
2. Creare una sottoclasse Studente che estende Persona e aggiunge matricola e corsiIscritti (lista di corsi, scegliere il tipo che si ritiene più opportuno).
3. Creare una classe Corso con codice, nomeCorso e un HashSet di studenti iscritti.
4. Usare un HashSet per evitare la duplicazione degli studenti in un corso.
5. Usare un HashMap<String, Studente> per ricercare rapidamente gli studenti per matricola.
6. Usare ArrayList per mantenere l'ordine di iscrizione ai corsi.
7. Usare LinkedList per gestire una coda di studenti in attesa di approvazione ai corsi.
Nel main:
8. Aggiungere uno studente a un corso.
9. Rimuovere uno studente da un corso.
10. Visualizzare tutti gli studenti iscritti a un corso.
11. Cercare uno studente per matricola.
 */
public class GestioneUniversita {
    public static void main(String[] args) {
        Universita universita = new Universita();
        Corso corso = new Corso("1", "Informatica");

        universita.corsi.put(corso.codice, corso);
        Studente studente = new Studente("Mario", "Rossi", "123", new ArrayList<Corso>());
        universita.studenti.put(studente.matricola, studente);
        universita.aggiungiStudenteACorso(studente, corso);
        System.out.println(corso.studentiIscritti);

        universita.rimuoviStudenteDaCorso(studente, corso);
        System.out.println(corso.studentiIscritti);

        //cercare uno studente per matricola
        Studente studenteTrovato = universita.cercaStudente("123");
        System.out.println(studenteTrovato);








    }
}
