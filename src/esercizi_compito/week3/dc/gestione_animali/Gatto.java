package esercizi_compito.week3.dc.gestione_animali;

class Gatto extends Animale {
    private String colore;

    public Gatto (String nome, int eta, String colore) {
        super (nome, eta);
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return "Gatto{" +
                "nome='" + nome + '\'' +
                "eta='" + eta + '\'' +
                "colore='" + colore + '\'' +
                "}\n";
    }
}
