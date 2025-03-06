package esercizi_in_lezione.week6.day5.file_export_import;

import java.util.ArrayList;
import java.util.List;

public class Studente extends Persona {
    private List<String> corsiIscritti = new ArrayList<>();

    public Studente(String id, String nome, String cognome) {
        super(id, nome, cognome);
        this.tipo = "Studente";
    }

    public void iscriviCorso(String corsoId) {
        corsiIscritti.add(corsoId);
    }

    @Override
    public String toCSV() {
        return String.format("%s,%s,%s,$s,%s", id, nome, cognome, tipo, String.join(";", corsiIscritti));
    }

    @Override
    public String toString() {
        return "Studente{" +
            "id='" + id + '\'' +
            ", nome='" + nome + '\'' +
            ", cognome='" + cognome + '\'' +
            ", corsiIscritti=" + corsiIscritti +
            '}';
    }
}