package esercizi_compito.week4.gg_rs;

import java.util.ArrayList;

public class Smartphone extends Mobile{
    private boolean conDoubleSim;

    public Smartphone(String marca, String modello, String sistemaOperativo, double prezzo, double memoriaRAM, String imei, ArrayList<String> connessioni, String dimensioniSchermo, boolean conDoubleSim) {
        super(marca, modello, sistemaOperativo, prezzo, memoriaRAM, imei, connessioni, dimensioniSchermo);
        this.conDoubleSim = conDoubleSim;
    }

    public boolean isConDoubleSim() {
        return conDoubleSim;
    }

    public void setConDoubleSim(boolean conDoubleSim) {
        this.conDoubleSim = conDoubleSim;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "Marca " + getMarca() + " " +
                "Modello " + getModello() + " "+
                "sistemaOperativo "+ getSistemaOperativo() +" "+
                "prezzo "+ getPrezzo() + " " +
                "memoriaRAM "+ getMemoriaRAM() + " "+
                "imei "+ getImei() + " " +
                "connessioni "+ getConnessioni().toString() + " "+
                "dimensioniSchermo "+ getDimensioniSchermo() + " "+
                "conDoubleSim=" + conDoubleSim +
                '}';
    }
}
