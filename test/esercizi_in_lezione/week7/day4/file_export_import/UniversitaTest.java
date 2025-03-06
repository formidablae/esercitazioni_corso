package esercizi_in_lezione.week7.day4.file_export_import;

import esercizi_in_lezione.week6.day5.file_export_import.Corso;
import esercizi_in_lezione.week6.day5.file_export_import.Studente;
import esercizi_in_lezione.week6.day5.file_export_import.Universita;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniversitaTest {

    private Universita universita;

    @BeforeEach
    void setUp() {
        universita = new Universita("PoliTo");
    }

    @Test
    void testAggiungiPersona() {
        Studente studente = new Studente("1", "Mario", "Rossi");
        universita.aggiungiPersona(studente);
        assertEquals(studente, universita.getPersona("1"));
    }

    @Test
    void testAggiungiCorso() {
        // GIVEN: a course with id "9" and name "Matematica"
        Corso corso = new Corso("9", "Matematica");

        // WHEN: adding the course to the university
        universita.aggiungiCorso(corso);

        // THEN: the course is effectively added
        assertEquals(corso, universita.getCorso("9"));
    }

    @Test
    void testSalvaDati() throws IOException {
        // GIVEN: a university with a student and a course
        Universita universitaExpected = universita;
        Studente studente = new Studente("1", "Mario", "Rossi");
        universitaExpected.aggiungiPersona(studente);
        Corso corso = new Corso("9", "Matematica");
        universitaExpected.aggiungiCorso(corso);

        // WHEN: saving the university data
        universitaExpected.salvaDati();

        // THEN: the data is effectively saved
        // qui chiamiamo caricaDati nel costruttore di Universita
        Universita universitaEffective = new Universita("PoliTo");

        assertEquals(universitaExpected.getPersone().size(), universitaEffective.getPersone().size());
        assertEquals(universitaExpected.getCorsi().size(), universitaEffective.getCorsi().size());
        assertEquals(universitaExpected.getNome(), universitaEffective.getNome());

        for (int i = 0; i < universitaExpected.getPersone().size(); i++) {
            assertEquals(universitaExpected.getPersone().get(i).getId(), universitaEffective.getPersone().get(i).getId());
        }

        for (int i = 0; i < universitaExpected.getCorsi().size(); i++) {
            assertEquals(universitaExpected.getCorsi().get(i).getId(), universitaEffective.getCorsi().get(i).getId());
        }
    }

    @Test
    void testMostraInformazioni() {
        // GIVEN: a university with a student and a course
        Studente studente = new Studente("1", "Mario", "Rossi");
        universita.aggiungiPersona(studente);
        Corso corso = new Corso("9", "Matematica");
        universita.aggiungiCorso(corso);

        // WHEN: showing the university information
        universita.mostraInformazioni();

        // THEN: the expected information is shown
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        universita.mostraInformazioni();
        String output = outputStream.toString();
        String expectedOutput = "Università: PoliTo\n" +
            "\n--- Persone ---\n" +
            "Studente{id='1', nome='Mario', cognome='Rossi', corsiIscritti=[]}\n" +
            "\n--- Corsi ---\n" +
            "Corso [id=9, nome=Matematica]\n";

        assertEquals(expectedOutput, output);
        System.setOut(System.out);
    }
}