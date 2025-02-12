package esercizi_in_lezione.week4.day2.gestione_figure_geometriche;

abstract class FiguraGeometrica implements IForma {
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

    public abstract String toString();

    public void print() {
        System.out.println(this);
    }
}