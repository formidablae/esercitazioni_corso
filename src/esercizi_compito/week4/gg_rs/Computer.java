package esercizi_compito.week4.gg_rs;

public abstract class Computer extends DispositivoElettronico {

    private String memoriaSsd;
    private String processore;

    public Computer(String marca, String modello, String sistemaOperativo, double prezzo, double memoriaRAM, String memoria, String processore) {
        super(marca, modello, sistemaOperativo, prezzo, memoriaRAM);
        this.memoriaSsd = memoria;
        this.processore = processore;
    }

    public String getMemoriaSsd() {
        return memoriaSsd;
    }

    public void setMemoriaSsd(String memoria) {
        this.memoriaSsd = memoria;
    }

    public String getProcessore() {
        return processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    @Override
    public abstract String toString();
}



