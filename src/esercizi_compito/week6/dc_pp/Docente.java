package esercizi_compito.week6.dc_pp;

import java.util.HashSet;

public class Docente extends Persona {
    private String dipartimentoDiAppartenenza;
    private HashSet<Corso> corsiInsegnati;

    public Docente(String nome, String cognome, String dipartimentoDiAppartenenza) {
        super(nome, cognome);
        this.dipartimentoDiAppartenenza = dipartimentoDiAppartenenza;
        this.corsiInsegnati = new HashSet<>();
    }

    public void aggiungiCorso(Corso corso) {
        corsiInsegnati.add(corso);
    }

    public String getDipartimentoDiAppartenenza() {
        return dipartimentoDiAppartenenza;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dipartimentoDiAppartenenza='" + dipartimentoDiAppartenenza + '\'' +
                '}';
    }
}