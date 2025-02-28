package esercizi_in_lezione.week6.day5.record;

import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

record Persona(String nome, int età) implements Serializable {}

public class SerializzazioneTest {
    public static void main(String[] args) throws IOException {
        Persona p = new Persona("Mario", 30);
        FileOutputStream fileOut = new FileOutputStream("persona.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(p);
        out.close();
        fileOut.close();

        System.out.println("Oggetto serializzato");
        FileInputStream fileIn = new FileInputStream("persona.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        try {
            Persona p2 = (Persona) in.readObject();
            System.out.println("Oggetto deserializzato: " + p2);
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
