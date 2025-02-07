package esercizi_in_lezione.week3.day4;

abstract class FiguraGeometrica {
    private String nome;

    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nuovoNome) {
        this.nome = nuovoNome;
    }

    public abstract double calcolaArea();

    public abstract double calcolaPerimetro();

    public abstract String toString();

    public void print() {
        System.out.println(this);
    }
}