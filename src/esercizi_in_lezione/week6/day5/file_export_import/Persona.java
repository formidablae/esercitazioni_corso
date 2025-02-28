package esercizi_in_lezione.week6.day5.file_export_import;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Persona {
    protected String id;
    protected String nome;
    protected String cognome;

    public Persona(String id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getId() {
        return id;
    }

    public abstract String toCSV();

    public static HashMap<String, Object> fromCSV(String csv) {
        // la riga in csv può avere questo formato
        // 901,Giovanni,Rossi,Docente,
        // 901,Giovanni,Rossi,Docente,1;2;4;4
        String[] parts = csv.split(",");
        if (parts.length != 4 && parts.length != 5) {
            throw new IllegalArgumentException("Invalid CSV format for Persona");
        }
        String id = parts[0].trim();
        String nome = parts[1].trim();
        String cognome = parts[2].trim();
        String tipo = parts[3].trim();
        ArrayList<String> corsi = new ArrayList<>();
        if (parts.length == 5) {
            corsi = new ArrayList<>(List.of(parts[4].trim().split(";")));
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("nome", nome);
        map.put("cognome", cognome);
        map.put("tipo", tipo);
        map.put("corsi", corsi);
        return map;
    }

    public static Persona personaFromCSV(String csv) {
        HashMap<String, Object> map = Persona.fromCSV(csv);
        String id = (String) map.get("id");
        String nome = (String) map.get("nome");
        String cognome = (String) map.get("cognome");
        boolean isStudente = ((String) map.get("tipo")).equals("Studente");
        ArrayList<String> corsiIscritti = (ArrayList<String>) map.get("corsi");
        if (isStudente) {
            Studente s = new Studente(id, nome, cognome);
            for (String corsoId : corsiIscritti) {
                s.iscriviCorso(corsoId);
            }
            return s;
        } else {
            Docente d = new Docente(id, nome, cognome);
            for (String corsoId : corsiIscritti) {
                d.assegnaCorso(corsoId);
            }
            return d;
        }
    }

}

class Studente extends Persona {
    private List<String> corsiIscritti = new ArrayList<>();

    public Studente(String id, String nome, String cognome) {
        super(id, nome, cognome);
    }

    public void iscriviCorso(String corsoId) {
        corsiIscritti.add(corsoId);
    }

    @Override
    public String toCSV() {
        return String.format("%s,%s,%s,Studente,%s", id, nome, cognome, String.join(";", corsiIscritti));
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

class Docente extends Persona {
    private List<String> corsiInsegnati = new ArrayList<>();

    public Docente(String id, String nome, String cognome) {
        super(id, nome, cognome);
    }

    public void assegnaCorso(String corsoId) {
        corsiInsegnati.add(corsoId);
    }

    @Override
    public String toCSV() {
        return String.format("%s,%s,%s,Docente,%s", id, nome, cognome, String.join(";", corsiInsegnati));
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