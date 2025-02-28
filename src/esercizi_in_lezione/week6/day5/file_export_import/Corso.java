package esercizi_in_lezione.week6.day5.file_export_import;

import java.util.HashMap;

public class Corso {
    private String id;
    private String nome;

    public Corso(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String toCSV() {
        return String.format("%s,%s", id, nome);
    }

    public static HashMap<String, String> fromCSV(String csv) {
        String[] parts = csv.split(",");
        String id = parts[0].trim();
        String nome = parts[1].trim();
        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);
        map.put("nome", nome);
        return map;
    }

    public static Corso corsoFromCSV(String csv) {
        HashMap<String, String> map = Corso.fromCSV(csv);
        String id = map.get("id");
        String nome = map.get("nome");
        return new Corso(id, nome);
    }

    @Override
    public String toString() {
        return "Corso [id=" + id + ", nome=" + nome + "]";
    }
}