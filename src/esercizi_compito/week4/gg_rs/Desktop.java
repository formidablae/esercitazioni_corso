package esercizi_compito.week4.gg_rs;

public class Desktop extends Computer{
    private String posizionamento;

    public Desktop(String marca, String modello, String sistemaOperativo, double prezzo, double memoriaRAM, String memoriaSsd, String processore, String posizionamento) {
        super(marca, modello, sistemaOperativo, prezzo, memoriaRAM, memoriaSsd, processore);
        this.posizionamento = posizionamento;
    }

    public String getPosizionamento() {
        return posizionamento;
    }

    public void setPosizionamento(String posizionamento) {
        this.posizionamento = posizionamento;
    }

    @Override
    public String toString() {
        return " Dispositivo Desktop" + getMarca() + " modello: " + getModello() + " sistema operativo : " + getSistemaOperativo()+
                " Prezzo € " + getPrezzo() + " Ram: " +getMemoriaRAM() + " MEmoria SSD: " + getMemoriaSsd() + " Processore: " + getProcessore() +
                " Posizionamento: " + posizionamento ;


    }
}
