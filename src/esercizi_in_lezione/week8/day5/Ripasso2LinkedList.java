package esercizi_in_lezione.week8.day5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ripasso2LinkedList {
    public static void main(String[] args) {
        // TODO: scrivere una struttura dati con la catena alimentare:
        // uccello -> serpente -> topo -> erba
        // Stampa la catena alimentare
        List<String> catenaAlimentare = Arrays.asList("uccello", "serpente", "topo", "erba");
        System.out.println(catenaAlimentare);
        List<String> linkedCatenaAlimentare = new LinkedList<>(catenaAlimentare);

        // TODO: inserire un nuovo elemento in cima alla catena alimentare ad esempio: lupo
        linkedCatenaAlimentare.addFirst("lupo");

        // TODO: inserire un nuovo elemento tra topo e erba ad esempio: formica
        linkedCatenaAlimentare.add(4, "formica");
        System.out.println(linkedCatenaAlimentare);
    }
}
