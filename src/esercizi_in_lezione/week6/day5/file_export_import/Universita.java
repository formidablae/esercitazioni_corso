package esercizi_in_lezione.week6.day5.file_export_import;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Universita {
    private String nome;
    private Map<String, Persona> persone = new HashMap<>();
    private Map<String, Corso> corsi = new HashMap<>();

    public Universita(String nome) {
        this.nome = nome;
        try {
            caricaDati();
        } catch (IOException e) {
            System.err.println("Errore durante il caricamento dei dati: " + e.getMessage());
            System.out.println("Creazione di un nuovo università con nome " + nome + " in corso.");
        }
    }

    public void aggiungiPersona(Persona p) {
        persone.put(p.getId(), p);
    }

    public void aggiungiCorso(Corso c) {
        corsi.put(c.getId(), c);
    }

    public void salvaDati() throws IOException {
        String pathToProject = "src/esercizi_in_lezione/week6/day5/file_export_import/export/" + nome;
        if (!Files.exists(Paths.get(pathToProject))) {
            Files.createDirectories(Paths.get(pathToProject));
        }

        FileManager.salvaDati(pathToProject + "/persone.json", persone);
        FileManager.salvaDati(pathToProject + "/corsi.json", corsi);
    }

    public void caricaDati() throws IOException {
        String pathToProject = "src/esercizi_in_lezione/week6/day5/file_export_import/export/" + nome + "/";

        Type personeType = new TypeToken<Map<String, Persona>>() {}.getType();
        Map<String, Persona> loadedPersone = FileManager.caricaDati(pathToProject + "persone.json", personeType);
        if (loadedPersone != null) {
            persone = loadedPersone;
        }

        Type corsiType = new TypeToken<Map<String, Corso>>() {}.getType();
        Map<String, Corso> loadedCorsi = FileManager.caricaDati(pathToProject + "corsi.json", corsiType);
        if (loadedCorsi != null) {
            corsi = loadedCorsi;
        }
    }

    public Persona getPersona(String id) {
        return persone.get(id);
    }

    public Corso getCorso(String id) {
        return corsi.get(id);
    }

    public void mostraInformazioni() {
        System.out.println("Università: " + nome);
        System.out.println("\n--- Persone ---");
        for (Persona p : persone.values()) {
            System.out.println(p);
        }
        System.out.println("\n--- Corsi ---");
        for (Corso c : corsi.values()) {
            System.out.println(c);
        }
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Persona> getPersone() {
        return new ArrayList<>(persone.values());
    }

    public ArrayList<Corso> getCorsi() {
        return new ArrayList<>(corsi.values());
    }
}
