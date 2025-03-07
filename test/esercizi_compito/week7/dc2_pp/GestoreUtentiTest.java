package esercizi_compito.week7.dc2_pp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
dc2
Scrivere dei test per verificare che:
- un utente venga aggiunto correttamente.
- un utente venga rimosso correttamente.
- un utente inesistente non venga rimosso.
- la verificaEsistenzaUtente di un utente esistente ritorni true.
- la verificaEsistenzaUtente di un utente non esistente ritorni false.
- quando aggiungo 3 utenti diversi, la lista degli utenti deve contenere 3 utenti diversi.
- quando aggiungo 3 utenti di cui 2 sono unici, la lista degli utenti deve contenere 2 utenti diversi.

pp
Scrivere dei test per verificare che:
- se aggiornaUtente viene chiamato Maria con Mario, Maria viene rimossa e Mario viene aggiunto.
- se aggiornaUtente viene chiamato Mario con Mario, Mario non viene rimosso e non viene aggiunto.
- se aggiornaUtente viene chiamato Maria con Mario ma Mario esiste già elenco, Maria non viene rimossa e Mario rimane in elenco.
- se ho in elenco Mario, Maria e Giuseppe, utenteConNomePiuLungo deve restituire Giuseppe.
- se ho in elenco Mario, Maria e Luca, utenteConNomePiuLungo deve restituire Mario o Maria.
- se chiamo formattaNome con "mario" deve restituire "Mario".
- se chiamo formattaNome con "mario rossi" deve restituire "Mario Rossi".
- se chiamo formattaNome con "mario rossi bianchi" deve restituire "Mario Rossi Bianchi".
- se chiamo formattaNome con "mAriO" deve restituire "Mario".
- se aggiungoUtente con "mario", viene aggiunto un utente "Mario". (scrivere questo test dopo testAggiungiUtente)
 */

class GestoreUtentiTest {
    // implementare qui i test

    private final GestoreUtenti gestoreUtenti = new GestoreUtenti();

    @Test
    void testAggiungiUtente() {
        assertFalse(gestoreUtenti.getUtenti().contains("Mario"));
        gestoreUtenti.aggiungiUtente("Mario");
        assertTrue(gestoreUtenti.getUtenti().contains("Mario"));
    }

    @Test
    void testRimuoviUtente() {
        // dato: gestoreUtenti con Mario tra gli utenti
        gestoreUtenti.aggiungiUtente("Mario");
        assertTrue(gestoreUtenti.getUtenti().contains("Mario"));

        // quando: rimuovo Mario dagli utenti
        gestoreUtenti.rimuoviUtente("Mario");

        // allora: Mario non deve essere tra gli utenti
        assertFalse(gestoreUtenti.getUtenti().contains("Mario"));
    }

    @Test
    void testRimuoviUtenteNonEsistente() {
        // dato: gestoreUtenti senza utenti
        assertFalse(gestoreUtenti.getUtenti().contains("Mario"));

        // quando: rimuovo Mario dagli utenti
        gestoreUtenti.rimuoviUtente("Mario");

        // allora: Mario non deve essere tra gli utenti
        assertFalse(gestoreUtenti.getUtenti().contains("Mario"));
    }

    @Test
    void testVerificaEsistenzaUtente() {
        // dato: gestoreUtenti con Mario tra gli utenti
        gestoreUtenti.aggiungiUtente("Mario");

        // quando: verifico che Mario esista
        boolean esiste = gestoreUtenti.verificaEsistenzaUtente("Mario");

        // allora: Mario deve esistere
        assertTrue(esiste);
    }

    @Test
    void testVerificaEsistenzaUtenteNonEsistente() {
        // dato: gestoreUtenti senza utenti
        assertFalse(gestoreUtenti.getUtenti().contains("Laura"));

        // quando: verifico che Laura esista
        boolean esiste = gestoreUtenti.verificaEsistenzaUtente("Laura");

        // allora: Laura non deve esistere
        assertFalse(esiste);
    }

    @Test
    void testVerificaTreUtentiDiversi() {
        // dato: gestoreUtenti senza utenti
        assertEquals(0, gestoreUtenti.getUtenti().size());

        // quando: aggiungo Mario, Luca e Giuseppe
        gestoreUtenti.aggiungiUtente("Mario");
        gestoreUtenti.aggiungiUtente("Laura");
        gestoreUtenti.aggiungiUtente("Giuseppe");

        // allora: la lista degli utenti deve contenere 3 utenti diversi
        assertEquals(3, gestoreUtenti.getUtenti().size());
    }

    @Test
    void testVerificaTreUtentiDiversiDueDuplicati() {
        // dato: gestoreUtenti senza utenti
        assertEquals(0, gestoreUtenti.getUtenti().size());

        // quando: aggiungo Mario due volte e Giuseppe
        gestoreUtenti.aggiungiUtente("Mario");
        gestoreUtenti.aggiungiUtente("Mario");
        gestoreUtenti.aggiungiUtente("Giuseppe");

        // allora: la lista degli utenti deve contenere 2 utenti diversi
        assertEquals(2, gestoreUtenti.getUtenti().size());
    }

}