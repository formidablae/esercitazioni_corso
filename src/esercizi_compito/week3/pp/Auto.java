package esercizi_compito.week3.pp;

class Auto extends Veicolo {
    private int porte;

    public Auto (String marca, String modello, int anno, int porte) {
        super (marca, modello, anno);
        this.porte = porte;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int nuovePorte) {
        this.porte = nuovePorte;
    }

    @Override
    public String toString() {
        return "Auto: marca " + this.getMarca() + ", modello " + this.getModello() + ", anno " + this.getAnno() + ", porte " + this.getPorte();
    }
}
