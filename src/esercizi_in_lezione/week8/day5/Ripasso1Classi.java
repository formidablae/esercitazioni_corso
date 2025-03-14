package esercizi_in_lezione.week8.day5;

import static esercizi_in_lezione.week8.day5.Auto.stampaContatoreAuto;

public class Ripasso1Classi {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Fiat", 2020);
        auto1.setMarca("Ferrari");
        stampaContatoreAuto();
        Auto auto2 = new Auto("Lancia", 2021);
        Auto.stampaContatoreAuto();
    }
}

class Auto {
    private String marca;
    private int anno;
    private static int contatoreAuto = 0;

    public Auto(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
        contatoreAuto++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void stampaAuto() {
        System.out.println("Marca: " + marca + " Anno: " + anno);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", anno=" + anno +
                '}';
    }

    public static void stampaContatoreAuto() {
        System.out.println("Contatore auto: " + contatoreAuto);
    }
}