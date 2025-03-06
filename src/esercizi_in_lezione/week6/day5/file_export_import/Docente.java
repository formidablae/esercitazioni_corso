package esercizi_in_lezione.week6.day5.file_export_import;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    private List<String> corsiInsegnati = new ArrayList<>();

    public Docente(String id, String nome, String cognome) {
        super(id, nome, cognome);
        this.tipo = "Docente";
    }

    public void assegnaCorso(String corsoId) {
        corsiInsegnati.add(corsoId);
    }

    @Override
    public String toCSV() {
        return String.format("%s,%s,%s,%s,%s", id, nome, cognome, tipo, String.join(";", corsiInsegnati));
    }

    @Override
    public String toString() {
        return "Docente{" +
            "id='" + id + '\'' +
            ", nome='" + nome + '\'' +
            ", cognome='" + cognome + '\'' +
            ", corsiInsegnati=" + corsiInsegnati +
            '}';
    }
}