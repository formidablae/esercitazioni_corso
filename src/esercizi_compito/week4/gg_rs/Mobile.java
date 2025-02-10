package esercizi_compito.week4.gg_rs;

import java.util.ArrayList;

/*
Mobile deve avere un metodo aggiungiConnessioni e rimuoviConnessioni per aggiungere o rimuovuere un elemento dall'array di connessioni
 */
public abstract class Mobile extends DispositivoElettronico{
    private String imei;
    private ArrayList<String> connessioni;
    private String dimensioniSchermo;

    public Mobile(String marca, String modello, String sistemaOperativo, double prezzo, double memoriaRAM, String imei, ArrayList<String> connessioni, String dimensioniSchermo) {
        super(marca, modello, sistemaOperativo, prezzo, memoriaRAM);
        this.imei = imei;
        this.connessioni = connessioni;
        this.dimensioniSchermo = dimensioniSchermo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public ArrayList<String> getConnessioni() {
        return connessioni;
    }

    public void setConnessioni(ArrayList<String> connessioni) {
        this.connessioni = connessioni;
    }

    public String getDimensioniSchermo() {
        return dimensioniSchermo;
    }

    public void setDimensioniSchermo(String dimensioniSchermo) {
        this.dimensioniSchermo = dimensioniSchermo;
    }
    /*
Mobile deve avere un metodo aggiungiConnessioni e rimuoviConnessioni per aggiungere o rimuovuere
un elemento dall'array di connessioni
 */
    public void aggiungiConnessioni(String connessione){
        for(int i = 0; i < connessioni.size(); i++) {
            if (connessione.equals(connessioni.get(i))) {
                return;
            }
        }
        connessioni.add(connessione);
    }

    public void rimuoviConnessioni(String connessione){
        for(int i = 0; i < connessioni.size(); i++){
            if(connessione.equals(connessioni.get(i))){
                connessioni.remove(i);
                return;
            }
        }
        System.out.println("La connesione " + connessione +" non è stata trovata!");
    }

}
