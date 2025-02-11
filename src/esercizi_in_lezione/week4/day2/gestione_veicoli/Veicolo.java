package esercizi_in_lezione.week4.day2.gestione_veicoli;

abstract class Veicolo implements IVeicolo {
    // campi della classe
    String marca;
    String modello;
    int anno;

    // costruttore di un'istanza di una classe
    public Veicolo(String marcaParam, String modelloParam, int annoParam) {
        this.marca = marcaParam;
        this.modello = modelloParam;
        this.anno = annoParam;
    }

    // un metodo della classe
    public String getModello() {
        return modello;
    }

    // un altro metodo della classe
    public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Modello: " + modello + ", Anno: " + anno);
    }
}
