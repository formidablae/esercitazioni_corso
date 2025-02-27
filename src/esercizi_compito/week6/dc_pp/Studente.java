package esercizi_compito.week6.dc_pp;

import esercizi_compito.week6.dc.Dog;

import java.util.ArrayList;

public class Studente extends Persona {
    String matricola;
    ArrayList<Corso> corsiIscritti;


    public Studente(String nome, String cognome, String matricola, ArrayList<Corso> corsiIscritti) {
        super(nome, cognome);
        this.matricola = matricola;
        this.corsiIscritti = corsiIscritti;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Studente studente = (Studente) obj;
        return matricola.equals(studente.matricola);
    }

    @Override
    public int hashCode() {
        return matricola.hashCode();
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola='" + matricola + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
