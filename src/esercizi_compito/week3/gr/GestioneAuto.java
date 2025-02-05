package esercizi_compito.week3.gr;

/*
Obiettivo:
Creare una classe Auto che rappresenti un'auto con proprietà e metodi. Il programma gestirà un array di auto, permettendo di analizzarne le informazioni.

Istruzioni:
1. Creare una classe Auto con le seguenti proprietà:
    - marca (String)
    - modello (String)
    - anno (int)
    - prezzo (double)

2. Aggiungere:
    - Un costruttore che accetta tutti i parametri.
    - Scrivere Getter (getMarca, getModello, getPrezzo, getAnno) e setter (setPrezzo).
    - Un metodo toString() per restituire una descrizione dell'auto.

3. Nel main:
    - Creare un array di 5 auto con dati casuali.
    - Stampare tutte le auto.
    - Trovare e stampare:
        - L'auto più costosa.
        - Incrementare il prezzo di ciascuna auto del 10% (cioè moltiplicare il prezzo precedente per 1.1).
        - Le auto prodotte dopo il 2020.

Elenco auto:
1. Marca: BMW, Modello: Serie 3, Anno: 2018, Prezzo: 27000.0€
2. Marca: Audi, Modello: A4, Anno: 2021, Prezzo: 32000.0€
3. Marca: Ford, Modello: Focus, Anno: 2019, Prezzo: 18000.0€
4. Marca: Mercedes, Modello: Classe C, Anno: 2022, Prezzo: 40000.0€
5. Marca: Toyota, Modello: Corolla, Anno: 2020, Prezzo: 21000.0€

Auto più costosa: Mercedes Classe C (40000.0€)
Nuovo prezzo del veicolo BMW è: 29700.0€
Auto prodotte dopo il 2020:
- Audi A4 (2021)
- Mercedes Classe C (2022)
 */


class Auto {
    // Implementare qui la soluzione
    private String marca;
    private String modello;
    private int anno;
    private double prezzo;

    public Auto(String marca, String modello, int anno, double prezzo){
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.prezzo = prezzo;
    }
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public int getAnno(){
        return anno;
    }
    public double getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    public String toString(){
        return "Marca: " + marca + "\n Modello: " + modello + "\n  Anno: " + anno + "\n   Prezzo: " + prezzo;
    }
}

public class GestioneAuto {
    public static void main(String[] args) {
        // Implementare qui la soluzione
        Auto auto1 = new Auto("BMW", "Serie 3", 2018, 27000.0);
        Auto auto2 = new Auto("Audi", "A4", 2021, 32000.0);
        Auto auto3 = new Auto("Ford", "Focus", 2019, 18000.0);
        Auto auto4 = new Auto("Mercedes", "Classe C", 2022, 40000.0);
        Auto auto5 = new Auto("Toyota", "Corolla", 2020, 21000.0);

        Auto[] elencoAuto = {auto1, auto2, auto3, auto4, auto5};
        Auto piuCostosa = elencoAuto[0];
        System.out.println("Questo è l'elenco delle auto: ");
        for (int i = 0; i < elencoAuto.length ; i++) {
            double prezzo2 = elencoAuto[i].getPrezzo() * 1.1;
            elencoAuto[i].setPrezzo(prezzo2);
            System.out.println("Auto " + (i + 1) + "\n" + elencoAuto[i]);
            if (elencoAuto[i].getPrezzo() > piuCostosa.getPrezzo()){
                piuCostosa = elencoAuto[i];
            }
        }
        System.out.println("L'auto più costosa è la: \n" + piuCostosa + "\n");

        for (int i = 0; i < elencoAuto.length; i++) {
            if (elencoAuto[i].getAnno() > 2020){
                System.out.println("Questa auto è stata prodotta dopo il 2020: \n" + elencoAuto[i]);
            }
        }
    }

}
