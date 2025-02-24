package esercizi_compito.week6.dc;

/*
1. Definire un'interfaccia IAnimal con un metodo makeSound().
2. Creare una classe Dog che implementa l'interfaccia Animal.
3. Definire un costruttore nella classe Dog che accetta il nome e l'età del cane.
4. Implementare il metodo makeSound() in Dog, che stampa un messaggio personalizzato.
5. Implementare il metodo equals() in Dog per confrontare oggetti in base al nome e all'età.
Nel metodo main di AnimalsManagement:
6. Utilizzare HashSet<Dog> per memorizzare cani unici ed evitare duplicati.
7. Verificare se due istanze Dog sono uguali, aggiungendole all'HashSet e controllando la dimensione.
8. Utilizzare instanceof per verificare se un oggetto è un'istanza di Dog, gestendo anche il caso null.
 */

import java.util.HashSet;

public class AnimalsManagement {
    public static void main(String[] args) {
        //
        Dog dog1 = new Dog("Fido", 3);
        Dog dog2 = new Dog("Fido", 3);
        Dog dog3 = new Dog("Rex", 5);

        HashSet<Dog> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println("Numero di cani unici: " + dogs.size());

        boolean dog1ugualeDog2 = dog1.equals(dog2);
        boolean dog1ugualeDog3 = dog1.equals(dog3);
        boolean dog2ugualeDog3 = dog2.equals(dog3);

        System.out.println("dog1 e dog2 sono uguali? " + dog1ugualeDog2);
        System.out.println("dog1 e dog3 sono uguali? " + dog1ugualeDog3);
        System.out.println("dog2 e dog3 sono uguali? " + dog2ugualeDog3);

        if (dog1 instanceof Dog) {
            System.out.println("dog1 è un cane");
        } else if (dog1 == null) {
            System.out.println("dog1 non esiste");
        }

        dog2 = null;

        if (dog2 instanceof Dog) {
            System.out.println("dog2 è un cane");
        } else if (dog2 == null) {
            System.out.println("dog2 non esiste");
        }

        if (dog3 instanceof Dog) {
            System.out.println("dog3 è un cane");
        } else if (dog3 == null) {
            System.out.println("dog3 non esiste");
        }
    }
}
