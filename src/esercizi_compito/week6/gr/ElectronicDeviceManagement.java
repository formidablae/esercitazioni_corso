package esercizi_compito.week6.gr;

/*
1. Interfaccia (Powerable)
Creare un'interfaccia Powerable con i seguenti metodi:
- void turnOn(); → Stampa un messaggio che indica che il dispositivo è acceso.
- void turnOff(); → Stampa un messaggio che indica che il dispositivo è spento.

2. Classe Base (ElectronicDevice)
Creare la classe ElectronicDevice, che deve:
- Implementare l'interfaccia Powerable.
Avere due attributi:
- String brand (marca del dispositivo).
- String model (modello del dispositivo).
Definire un costruttore che inizializza i due attributi.
- Implementare il metodo turnOn() e turnOff() con messaggi appropriati.
- Sovrascrivere i metodi equals() e hashCode() per permettere il confronto tra dispositivi.
Aggiungere un metodo statico deviceInfo() che stampa un messaggio generico sui dispositivi elettronici.

3. Classi Derivate (Smartphone e Laptop)
Creare due classi che estendano ElectronicDevice:
- Smartphone con un attributo booleano has5G.
- Aggiungere un costruttore per inizializzare anche has5G.
- Sovrascrivere equals() e hashCode() per includere has5G.
- Laptop con un attributo int ramSize.
- Aggiungere un costruttore per inizializzare anche ramSize.
- Sovrascrivere equals() e hashCode() per includere ramSize.

4. Gestione di una Collezione (HashSet)
Nel metodo main(), creare un HashSet<ElectronicDevice> e aggiungere i seguenti oggetti:
- Due Smartphone con gli stessi valori (devono essere considerati uguali).
- Un Laptop con caratteristiche definite.
- Un altro Laptop con caratteristiche differenti.
- Stampare la dimensione del HashSet per verificare che non ci siano duplicati.

5. Uso di instanceof per Controllo dei Tipi
Creare un metodo testInstanceof(ElectronicDevice d), che deve:
- Stampare "È uno smartphone." se l'oggetto è un Smartphone.
- Stampare "È un laptop." se l'oggetto è un Laptop.
- Stampare "È un dispositivo elettronico generico." se è solo un ElectronicDevice.
- Stampare "L'oggetto è null o non è un dispositivo elettronico." se l'oggetto è null.
Chiamare testInstanceof() per alcuni dispositivi creati, incluso un null.

6. Operazioni Extra sul HashSet
Accendere tutti i dispositivi presenti nel HashSet.
Rimuovere un dispositivo e ristampare la dimensione del HashSet.
 */
public class ElectronicDeviceManagement {
    public static void main(String[] args) {

    }
}
