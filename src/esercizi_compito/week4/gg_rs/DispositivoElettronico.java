package esercizi_compito.week4.gg_rs;
/*
DispositivoElettronico deve avere proprietà: marca, modello, prezzo, sistemaOperativo, memoriaRAM
 */
public abstract class DispositivoElettronico {
    private String marca, modello, sistemaOperativo;
    private double prezzo, memoriaRAM;

    public DispositivoElettronico(String marca, String modello, String sistemaOperativo, double prezzo, double memoriaRAM) {
        this.marca = marca;
        this.modello = modello;
        this.sistemaOperativo = sistemaOperativo;
        this.prezzo = prezzo;
        this.memoriaRAM = memoriaRAM;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(double memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public abstract String toString();
}
