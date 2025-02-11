package esercizi_compito.week3.dc.gestione_animali;


/*
 * 1. Creare una classe Animale non istanziabile con attributi nome e eta;
 * 2. Creare una classe Cane che estende Animale con attributi razza;
 * 3. Creare una classe Gatto che estende Animale con attributi colore;
 * 4. Implementare metodi getter e setter
 * 5. Dichiarare toString in Animale ma implementarlo solo nelle sottoclassi
 * 6. Applicare incapsulamento con modificatori private e public.
 * 7. Implementare un metodo main che istanzia un array di 5 animali e chiede in input nome, eta, razza e colore.
 * - Cane: "Roghi",  5, "Labrador"
 * - Gatto: "Micio", 3, "Nero"
 * - Cane: "Fido", 2, "Bulldog"
 * - Gatto: "Whiskers", 4, "Grigio"
 * - Cane: "Buddy", 7, "Pastore Tedesco"
 * 8. Stampa l'array di animali
 * 9. Imposta con setter una nuova razza per il primo animale dell'array
 * 10. Importa con un setter un nuovo colore per il secondo animale dell'array
 */

import java.util.Arrays;

public class GestioneAnimali {
    public static void main(String[] args) {
        Animale[] animali = {
                new Cane("Roghi", 5, "Labrador"),
                new Gatto("Micio", 3, "Nero"),
                new Cane("Fido", 2, "Bulldog"),
                new Gatto("Whiskers", 4, "Grigio"),
                new Cane("Buddy", 7, "Pastore Tedesco")
        };

        System.out.println(Arrays.toString(animali));

        ((Cane) animali[0]).setRazza("Maltese");

        System.out.println(Arrays.toString(animali));

        ((Gatto) animali[1]).setColore("Bianco");

        System.out.println(Arrays.toString(animali));

        // scrivi un ciclo for che trova l'animale più vecchio
        Animale animalePiuVecchio = animali[0];
        for (int i = 1; i < animali.length; i++) {
            if (animali[i].getEta() > animalePiuVecchio.getEta()) {
                animalePiuVecchio = animali[i];
            }
        }
        System.out.println("L'animale più vecchio è: " + animalePiuVecchio.getNome() + " con " + animalePiuVecchio.getEta() + " anni");


    }
}
