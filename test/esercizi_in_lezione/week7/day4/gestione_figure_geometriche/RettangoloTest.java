package esercizi_in_lezione.week7.day4.gestione_figure_geometriche;

import esercizi_in_lezione.week6.day5.record.Rettangolo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RettangoloTest {

    @Test
    void testArea() {
        // GIVEN: un rettangolo con larghezza 5 e altezza 3
        double larghezza = 5;
        double altezza = 3;
        Rettangolo rettangolo = new Rettangolo(larghezza, altezza);

        // WHEN: calcolo l'area del rettangolo
        double effectiveArea = rettangolo.area();

        // THEN: l'area del rettangolo è 15
        double expectedArea = 15;
        assertEquals(expectedArea, effectiveArea);
    }

}