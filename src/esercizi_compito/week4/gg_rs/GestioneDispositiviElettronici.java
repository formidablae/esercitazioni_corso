package esercizi_compito.week4.gg_rs;

import java.util.ArrayList;

/**
 * gg
 * - Creare una gerarchia di classi per rappresentare dispositivi elettronici.
 * - Creare una classe DispositivoElettronico
 * - Creare una classe Mobile, classe astratta che estende DispositivoElettronico
 * - Creare una classe Smartphone che estende Mobile
 * - Creare una classe Tablet che estende Mobile
 * - DispositivoElettronico deve avere proprietà: marca, modello, prezzo, sistemaOperativo, memoriaRAM
 * - Mobile deve avere proprietà: imei, connessioni (un array di stringhe), dimensioneSchermo
 * - l'array connessioni può contenere "wifi", "bluetooth", "gsm", "gps", "4g", "5g"
 * - Implementare metodi getter e setter e toString() di DispositivoElettronico, Mobile, Smartphone e Tablet.
 * - Mobile deve avere un metodo aggiungiConnessioni e rimuoviConnessioni per aggiungere o rimuovuere
 * un elemento dall'array di connessioni
 * - Per i dispositivi Mobile, chiamare il metodo aggiungiConnessioni per aggiugere "5g" nelle connessioni se non c'è già.
 * --------
 * rs
 * - Creare una classe Computer, classe astratta che estende DispositivoElettronico
 * - Creare una classe Desktop che estende Computer
 * - Creare una classe Laptop che estende Computer
 * - Computer deve avere proprietà: memoriaSSD, processore
 * - Desktop deve avere proprietà: posizionamento ("orizzontale" o "verticale")
 * - Laptop deve avere proprietà: dimensioneBatteria
 * - Implementare metodi getter e setter e toString() di Computer, Desktop e Laptop.
 * - DispositivoElettronico deve avere anche i metodi: accendi(), spegni() che stampano "Accendendo...", "Spegnendo..."
 * - In main creare un array di dispositivi elettronici e stampare le informazioni di ogni dispositivo
 * - Chiamare i metodi accendi() e spegni() per ogni dispositivo
 * - Per i dispositivi Mobile, chiamare il metodo rimuoviConnessioni per rimuovere "gsm" dalle connessioni se c'è.
 */

public class GestioneDispositiviElettronici {
    public static void main(String[] args) {
        // implementare qui la soluzione

        ArrayList<String> connessioni = new ArrayList<>();
        connessioni.add("5g");
        Smartphone mobile = new Smartphone("Samsung", "s3", "Android",
                                            299.99, 6.000, "415231263873821671",
                                                connessioni, "5ollici", true);

        System.out.println(mobile);
    }
}
