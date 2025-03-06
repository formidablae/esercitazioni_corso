package esercizi_in_lezione.week7.day4.file_export_import;

import esercizi_in_lezione.week6.day5.file_export_import.Corso;
import esercizi_in_lezione.week6.day5.file_export_import.Docente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocenteTest {

    @Test
    void toCSV() {
        // GIVEN: a teacher with id "1", name "Mario" and surname "Rossi"
        //   AND: a course with id "1" and name "Java"
        //   AND: the teacher is assigned to the course
        Corso corso = new Corso("1", "Java");
        Docente docente = new Docente("1", "Mario", "Rossi");
        docente.assegnaCorso(corso.getId());

        // WHEN: the teacher is converted to CSV format
        String csv = docente.toCSV();

        // THEN: the CSV string is "1,Mario,Rossi,1"
        assertEquals("1,Mario,Rossi,Docente,1", csv);
    }
}