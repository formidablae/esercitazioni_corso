package esercizi_compito.week6.gr2;

/*
1️⃣ Interfaccia (Connectable)
Creare un’interfaccia Connectable con i metodi connectToWiFi() e disconnectFromWiFi().

2️⃣ Classe Base (SmartDevice)
Implementa Connectable e definisci gli attributi:
brand (marca)
model (modello)
isConnected (booleano per lo stato della connessione)
Implementa i metodi connectToWiFi(), disconnectFromWiFi(), equals() e hashCode().
Aggiungi un metodo statico generalInfo() che stampa informazioni generiche sui dispositivi smart.

3️⃣ Sottoclassi (SmartTV e SmartSpeaker)
SmartTV con un attributo screenSize (dimensione dello schermo in pollici).
SmartSpeaker con un attributo hasVoiceAssistant (booleano per l’assistente vocale).
Override di equals() e hashCode() per includere i nuovi attributi.

4️⃣ Uso di HashSet
Aggiungere dispositivi in un HashSet e stampare la sua dimensione.
Dimostrare che dispositivi identici non vengono duplicati.

5️⃣ Controllo con instanceof
Creare testInstanceof(SmartDevice d) per verificare il tipo dell’oggetto.

6️⃣ Operazioni Extra su HashSet
Connettere i dispositivi alla rete WiFi.
Rimuovere un dispositivo e stampare la dimensione aggiornata del HashSet.
 */

import java.util.HashSet;

public class SmartDeviceManagement {
    public static void main(String[] args) {
        SmartTV tv1 = new SmartTV("Samsung", "TV1", 55);
        SmartTV tv2 = new SmartTV("Samsung", "TV2", 55);
        SmartTV tv3 = new SmartTV("Samsung", "TV3", 55);
        SmartTV tv4 = new SmartTV("Samsung", "TV3", 55);
        SmartSpeaker speaker1 = new SmartSpeaker("Sony", "Speaker1", true);
        SmartSpeaker speaker2 = new SmartSpeaker("Sony", "Speaker2", true);
        SmartSpeaker speaker3 = new SmartSpeaker("Sony", "Speaker3", true);

        HashSet<SmartDevice> devices = new HashSet<>();
        devices.add(tv1);
        devices.add(tv2);
        devices.add(tv3);
        devices.add(tv4);
        devices.add(speaker1);
        devices.add(speaker2);
        devices.add(speaker3);

        System.out.println(devices.size());
        for (SmartDevice d : devices) {
            d.connectToWiFi();
            testInstanceof(d);
        }
        devices.remove(speaker1);
        System.out.println(devices.size());
    }

    public static void testInstanceof(SmartDevice d){
        if (d instanceof SmartTV){
            System.out.println("È una SmartTV.");
        } else if (d instanceof SmartSpeaker){
            System.out.println("È un SmartSpeaker.");
        } else if (d instanceof SmartDevice){
            System.out.println("È un dispositivo smart generico.");
        } else {
            System.out.println("L'oggetto è null o non è un dispositivo smart.");
        }
    }
}
