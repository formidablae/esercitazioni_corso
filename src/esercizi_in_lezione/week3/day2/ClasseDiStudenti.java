package esercizi_in_lezione.week3.day2;

import java.util.Arrays;

class Studente {
    private String nome;
    private int eta;

    private double[] elencoVoti;
    private double votoMedio;

    // Costruttore
    public Studente(String nome, int eta, double[] elencoVoti) {
        this.nome = nome;
        this.eta = eta;
        this.elencoVoti = elencoVoti;
        this.aggiornaMedia();
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public double getVotoMedio() {
        return votoMedio;
    }

    public double[] getElencoVoti() {
        return elencoVoti;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void aggiungiVoto(double voto) {
        double[] nuovoElencoVoti = new double[this.elencoVoti.length + 1];
        for (int i = 0; i < nuovoElencoVoti.length - 1; i++) {
            nuovoElencoVoti[i] = this.elencoVoti[i];
        }
        nuovoElencoVoti[nuovoElencoVoti.length - 1] = voto;
        this.elencoVoti = nuovoElencoVoti;
        this.aggiornaMedia();
    }

    private void aggiornaMedia() {
        double sommaVoti = 0;
        for (int i = 0; i < this.elencoVoti.length; i++) {
            sommaVoti += this.elencoVoti[i];
        }
        this.votoMedio = sommaVoti / elencoVoti.length;
    }

    public String toString() {
        String result = "Studente/ssa: " + this.nome + " con eta " + this.eta + " ha questi voti: ";
        result += Arrays.toString(this.elencoVoti);
        result += " con media " + this.votoMedio;
        return result;
    }
}

public class ClasseDiStudenti {
    Studente[] elencoDiStudenti;

    public ClasseDiStudenti(Studente[] elencoStud) {
        this.elencoDiStudenti = elencoStud;
    }

    public String toString() {
        String result = "La classe è composta dai seguenti studenti: \n";
        for (int i = 0; i < this.elencoDiStudenti.length; i++) {
            result += this.elencoDiStudenti[i].toString() + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        double[] voti = {8.0, 9.0, 10.0, 9.0, 8.0, 7.0};
        Studente studentessa = new Studente("Alice", 20, voti);
        System.out.println("Nome: " + studentessa.getNome() + ", Età: " + studentessa.getEta() + ", Voto Medio: " + studentessa.getVotoMedio());
        // System.out.println(studentessa.nome);
        System.out.println(studentessa.getNome());

        System.out.println(studentessa);
        studentessa.aggiungiVoto(6.0);
        System.out.println(studentessa);


        Studente studente2 = new Studente("Mario", 20, voti);
        Studente studente3 = new Studente("Davide", 21, voti);

        Studente[] elencoDiStudenti = {studentessa, studente2, studente3};

        System.out.println();
        ClasseDiStudenti classeDiStudenti = new ClasseDiStudenti(elencoDiStudenti);
        System.out.println(classeDiStudenti);
    }
}
