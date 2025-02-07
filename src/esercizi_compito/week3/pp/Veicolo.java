package esercizi_compito.week3.pp;

abstract class Veicolo {
    protected String marca;
    protected String modello;
    protected int anno;

    public Veicolo (String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getAnno() {
        return anno;
    }

    public void setMarca(String nuovaMarca) {
        this.marca = nuovaMarca;
    }

    public void setModello(String nuovoModello) {
        this.modello = nuovoModello;
    }

    public void setAnno(int nuovoAnno) {
        this.anno = nuovoAnno;
    }

    public abstract String toString();
}
