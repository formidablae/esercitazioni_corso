package esercizi_compito.week4.gg_rs;

public class Laptop extends Computer{

    private String dimensioniBatteria;

    public Laptop(String marca, String modello, String sistemaOperativo, double prezzo, double memoriaRAM, String memoria, String processore, String dimensioniBatteria) {
        super(marca, modello, sistemaOperativo, prezzo, memoriaRAM, memoria, processore);
        this.dimensioniBatteria = dimensioniBatteria;
    }

    public String getDimensioniBatteria() {
        return dimensioniBatteria;
    }

    public void setDimensioniBatteria(String dimensioniBatteria) {
        this.dimensioniBatteria = dimensioniBatteria;
    }

    public String toString() {
        return " Dispositivo Laptop" + getMarca() + " modello: " + getModello() + " sistema operativo : " + getSistemaOperativo()+
                " Prezzo € " + getPrezzo() + " Ram: " +getMemoriaRAM() + " MEmoria SSD: " + getMemoriaSsd() + " Processore: " + getProcessore() +
                " Dimensione batteria: " + dimensioniBatteria ;


    }
}
