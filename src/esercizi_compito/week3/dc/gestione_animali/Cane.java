package esercizi_compito.week3.dc.gestione_animali;

class Cane extends Animale {
    private String razza;

    public Cane (String nome, int eta, String razza) {
        super (nome, eta);
        this.razza = razza;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    @Override
    public String toString() {
        return "Cane{" +
                "nome='" + nome + '\'' +
                "eta='" + eta + '\'' +
                "razza='" + razza + '\'' +
                "}\n";
    }
}
