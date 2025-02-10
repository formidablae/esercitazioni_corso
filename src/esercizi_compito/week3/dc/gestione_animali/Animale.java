package esercizi_compito.week3.dc.gestione_animali;
abstract class Animale {
    protected String nome;
    protected int eta;


    public Animale (String nome, int eta) {
        this.nome= nome;
        this.eta= eta;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public abstract String toString ();
}


