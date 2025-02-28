package esercizi_in_lezione.week6.day5;

public class Persona2 {

    public String nome;
    public String cognome;
    public int eta;
    public Persona2(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
    public void saluta() {
        System.out.println("Ciao sono " + nome + " " + cognome);
    }
}
// record Studente(String nome, int eta) extends Persona2 {}
