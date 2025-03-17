package esercizi_in_lezione.week9.menu_ristorante;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

public class MenuRistorante {
    private HashSet<Portata> portate;

    public MenuRistorante(HashSet<Portata> portate) {
        this.portate = portate;
    }

    public MenuRistorante(String filePath) {
        caricaMenuDaFile(filePath);
    }

    private void caricaMenuDaFile(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            portate = objectMapper.readValue(new File(filePath), new TypeReference<HashSet<Portata>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Errore durante il caricamento del menu da file.");
            portate = new HashSet<>();
        }
    }

    public void salvaMenuSuFile(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), portate);
            System.out.println("Menu salvato su file con successo.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Errore durante il salvataggio del menu su file.");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Menu del Ristorante:\n");
        result.append("==================================\n");
        HashSet<String> categorie = new HashSet<>();
        for (Portata portata : portate) {
            categorie.add(portata.getCategoria());
        }
        for (String categoria : categorie) {
            result.append(categoria).append(":\n");
            for (Portata portata : portate) {
                if (portata.getCategoria().equals(categoria)) {
                    result.append("   " + portata).append("\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public HashSet<Portata> getPortate() {
        return portate;
    }

    public Portata getPortataPerNome(String nome) {
        for (Portata portata : portate) {
            if (portata.getNome().equals(nome)) {
                return portata;
            }
        }
        return null;
    }

    public void setPortate(HashSet<Portata> portate) {
        this.portate = portate;
    }

    public void aggiungiPortata(Portata portata) {
        portate.add(portata);
    }

    public void rimuoviPortata(Portata portata) {
        portate.remove(portata);
    }

    public void rimuoviPortataPerNome(String nome) {
        portate.removeIf(portata -> portata.getNome().equals(nome));
    }
}
