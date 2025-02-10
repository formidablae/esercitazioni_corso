package esercizi_compito.week4.gg_rs;

import java.util.ArrayList;

public class Tablet extends Mobile{
    private boolean conTastieraFisica;

    public Tablet(String marca, String modello, String sistemaOperativo, double prezzo, double memoriaRAM, String imei, ArrayList<String> connessioni, String dimensioniSchermo, boolean conTastieraFisica) {
        super(marca, modello, sistemaOperativo, prezzo, memoriaRAM, imei, connessioni, dimensioniSchermo);
        this.conTastieraFisica = conTastieraFisica;
    }

    public boolean isConTastieraFisica() {
        return conTastieraFisica;
    }

    public void setConTastieraFisica(boolean conTastieraFisica) {
        this.conTastieraFisica = conTastieraFisica;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "Marca " + getMarca() +
                "Modello " + getModello() +
                "sistemaOperativo "+ getSistemaOperativo() +
                "prezzo "+ getPrezzo() +
                "memoriaRAM "+ getMemoriaRAM() +
                "imei "+ getImei() +
                "connessioni "+ getConnessioni() +
                "dimensioniSchermo "+ getDimensioniSchermo() +
                "con tastiera" + isConTastieraFisica() +
                '}';
    }
}
