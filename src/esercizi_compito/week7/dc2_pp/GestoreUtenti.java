package esercizi_compito.week7.dc2_pp;

import java.util.HashSet;

public class GestoreUtenti {
    private HashSet<String> utenti;

    public GestoreUtenti() {
        utenti = new HashSet<>();
    }

    public void aggiungiUtente(String nome) {
        utenti.add(formattaNome(nome));
    }

    public HashSet<String> getUtenti() {
        return utenti;
    }

    public void rimuoviUtente(String nome) {
        utenti.remove(formattaNome(nome));
    }

    public boolean verificaEsistenzaUtente(String nome) {
        return utenti.contains(formattaNome(nome));
    }

    public void aggiornaUtente(String nomeVecchio, String nomeNuovo) {
        if (utenti.contains(formattaNome(nomeVecchio)) && !utenti.contains(formattaNome(nomeNuovo))) {
            utenti.remove(formattaNome(nomeVecchio));
            utenti.add(formattaNome(nomeNuovo));
        }
    }

    public String utenteConNomePiuLungo() {
        String nomePiuLungo = "";
        for (String nome : utenti) {
            if (nome.length() > nomePiuLungo.length()) {
                nomePiuLungo = nome;
            }
        }
        return nomePiuLungo;
    }

    // dato un nome in qualsiasi formato, corvertilo in formato "Nome"
    // dato un nome cognome in qualsiasi formato, corvertilo in formato "Nome Cognome"
    public String formattaNome(String nome) {
        String[] parti = nome.split(" ");
        String nomeFormattato = "";
        for (int i = 0; i < parti.length; i++) {
            if (i == 0) {
                nomeFormattato += parti[i].substring(0, 1).toUpperCase() + parti[i].substring(1).toLowerCase();
            } else {
                nomeFormattato += " " + parti[i].substring(0, 1).toUpperCase() + parti[i].substring(1).toLowerCase();
            }
        }
        return nomeFormattato;
    }
}
