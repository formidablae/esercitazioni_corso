package esercizi_compito.week3.pp;

class Moto extends Veicolo {
    private boolean haCarena;

    public Moto (String marca, String modello, int anno, boolean haCarena) {
        super (marca, modello, anno);
        this.haCarena = haCarena;
    }

    public boolean getHaCarena() {
        return haCarena;
    }

    public void setHaCarena(boolean nuovaHaCarena) {
        this.haCarena = nuovaHaCarena;
    }

    @Override
    public String toString() {
        return "Moto: marca " + marca + ", modello " + modello + ", anno " + anno + ", carena " + haCarena;
    }
}
