package esercizi_compito.week6.dc_pp;


import java.util.ArrayList;

/*
dc
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

pp
12. Creare una nuova classe Docente che eredita da Persona.
13. Ogni docente deve avere un dipartimento di appartenenza.
14. Un docente può insegnare più corsi.
15. Aggiungere un riferimento a un docente nella classe Corso.
16. Implementare un metodo per assegnare un docente a un corso.
17. Un docente può insegnare a più corsi, ma ogni corso deve avere un solo docente.
18. Implementare un metodo che mostri per ogni corso il docente assegnato.
19. Espandere la ricerca degli studenti, consentendo di cercare per nome e cognome, oltre che per matricola.
20. Impostare un limite massimo di studenti che si possono iscrivere a un corso.
21. Quando uno studente viene rimosso dalla coda (che sono in attesa), deve essere automaticamente iscritto a un corso disponibile.
22. Se un corso non ha posti disponibili, lo studente deve rimanere in coda.
23. In main creare dei corsi, creare docenti, studenti, assegnare i docenti ai corsi e iscrivere gli studenti ai corsi.
    Corso("CS101", "Programmazione");
    Corso("CS102", "Algoritmi");
    Corso("CS103", "Reti");

    Docente("Mario", "Rossi", "Informatica");
    Docente("Giovanni", "Bianchi", "Ingegneria");

    Studente("Marco", "Rossi", "1001");
    Studente("Luca", "Bianchi", "1002");
    Studente("Anna", "Verdi", "1003");
24. In main "giocare" con l'elenco degli studenti in attesa
 */
public class GestioneUniversita {
    public static void main(String[] args) {
        Universita universita = new Universita();
        Docente docente1 = new Docente("Mario", "Rossi", "Informatica");
        Docente docente2 = new Docente("Giovanni", "Bianchi", "Ingegneria");

        universita.aggiungiDocente(docente1);
        //System.out.println(universita);
        universita.aggiungiDocente(docente2);
        //System.out.println(universita);

        Corso c1 = new Corso("CS100", "Informatica", docente1);
        Corso c2 = new Corso("CS101", "Algoritmi", docente1);
        Corso c3 = new Corso("CS102", "Reti", docente2);


        universita.corsi.put(c1.codice, c1);
        // universita.corsi.put(c2.codice, c2);
        // universita.corsi.put(c3.codice, c3);

        Studente studente1 = new Studente("Mario", "Rossi", "1001", new ArrayList<Corso>());
        Studente studente2 = new Studente("Luca", "Bianchi", "1002", new ArrayList<Corso>());
        Studente studente3 = new Studente("Anna", "Verdi", "1003", new ArrayList<Corso>());

        universita.studenti.put(studente1.matricola, studente1);
        universita.studenti.put(studente2.matricola, studente2);
        universita.studenti.put(studente3.matricola, studente3);

        universita.aggiungiStudenteACorso(studente1, c1);
        universita.aggiungiStudenteACorso(studente2, c1);
        universita.aggiungiStudenteACorso(studente3, c1);
        // universita.aggiungiStudenteACorso(studente1, c2);
        // universita.aggiungiStudenteACorso(studente3, c3);

        //System.out.println(universita);

        System.out.println(c1.studentiIscritti);

        universita.rimuoviStudenteDaCorso(studente1, c1);
        System.out.println(c1.studentiIscritti);

        //cercare uno studente per matricola
        Studente studenteTrovato = universita.cercaStudente("1001");
        System.out.println(studenteTrovato);

        System.out.println(universita);

        Studente studente4 = new Studente("Anna", "Verdi", "1004", new ArrayList<Corso>());
        Studente studente5 = new Studente("Anna", "Verdi", "1005", new ArrayList<Corso>());

        universita.studenti.put(studente4.matricola, studente4);
        universita.studenti.put(studente5.matricola, studente5);

        universita.aggiungiStudenteACorso(studente4, c1);
        universita.aggiungiStudenteACorso(studente5, c1);

        System.out.println(universita);

        universita.rimuoviStudenteDaCorso(studente2, c1);

        System.out.println(universita);
    }
}
