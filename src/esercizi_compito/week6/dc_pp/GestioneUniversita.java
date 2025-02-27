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
