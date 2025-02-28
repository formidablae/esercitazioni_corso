package esercizi_in_lezione.week6.day5.file_export_import;

import java.io.*;
import java.nio.file.*;
import java.util.*;

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
        String pathToProject = "src/esercizi_in_lezione/week6/day5/file_export_import/export/";
        if (!Files.exists(Paths.get(pathToProject + nome))) {
            Files.createDirectories(Paths.get(pathToProject + nome));
        }

        List<String> righePersone = new ArrayList<>();
        for (Persona p : persone.values()) {
            righePersone.add(p.toCSV());
        }
        Files.write(Paths.get(pathToProject + nome + "/persone.csv"), righePersone, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        List<String> righeCorsi = new ArrayList<>();
        for (Corso c : corsi.values()) {
            righeCorsi.add(c.toCSV());
        }
        Files.write(Paths.get(pathToProject + nome + "/corsi.csv"), righeCorsi, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public void caricaDati() throws IOException {
        String pathToProject = "src/esercizi_in_lezione/week6/day5/file_export_import/export/" + nome + "/";
        Path pathPersone = Paths.get(pathToProject + "persone.csv");
        Path pathCorsi = Paths.get(pathToProject + "corsi.csv");

        if (Files.exists(pathPersone)) {
            List<String> righePersone = Files.readAllLines(pathPersone);
            for (String riga : righePersone) {
                Persona p = Persona.personaFromCSV(riga);
                persone.put(p.getId(), p);
            }
        }

        if (Files.exists(pathCorsi)) {
            List<String> righeCorsi = Files.readAllLines(pathCorsi);
            for (String riga : righeCorsi) {
                Corso c = Corso.corsoFromCSV(riga);
                corsi.put(c.getId(), c);
            }
        }
    }

    public Persona getPersona(String id) {
        return persone.get(id);
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
}
