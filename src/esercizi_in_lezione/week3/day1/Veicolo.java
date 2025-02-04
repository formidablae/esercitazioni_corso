package esercizi_in_lezione.week3.day1;

public class Veicolo {
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

    public static void main(String[] args) {
        // dichiarazione di una variabile di tipo Veicolo
        Veicolo ilMioVeicoloPreferito = new Veicolo("Toyota", "Corolla", 2020);
        ilMioVeicoloPreferito.stampaDettagli();
        String ilModello = ilMioVeicoloPreferito.getModello();
        System.out.println("Il modello: " + ilModello);
    }
}
