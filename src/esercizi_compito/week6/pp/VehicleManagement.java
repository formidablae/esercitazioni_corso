package esercizi_compito.week6.pp;

import java.util.HashSet;

/*
1. Scrivere un'intefaccia IIdentifiable con metodo getIdentifier
2. Crea una classe Vehicle, astratta che implementa IIdentifiable e ha:
 - brand
 - year
3. Creare Car e Bike che estendono Vehicle
4. Implementare equals e hashCode in Vehicle, Car e Bike
5. Implementare il metodo getIdentifier in Vehicle che restituisca: brand + "-" + year
6. Implementare il metodo getIdentifier in Car che restituisca: l'identificatore della classe padre + "-Car"
7. Implementare il metodo getIdentifier in Bike che restituisca: l'identificatore della classe padre + "-Bike"
In VehicleManagement, main:
8. creare 5 Car, 3 Bike, una variabile Car null
9. creare un HashSet di Vehicle e aggiungere i 5 Car, 3 Bike e la variabile Car null
10. stampare il numero di Vehicle unici
11. stampare il numero di Car uniche
12. stampare il numero di Bike uniche
13. stampare il numero di Vehicle null
14. per ogni Vehicle, stampare l'identificatore
 */
public class VehicleManagement {
    public static void main(String[] args) {
        Car car1 = new Car("Fiat", 2000);
        Car car2 = new Car("Lancia", 2001);
        Car car3 = new Car("Ferrari", 2009);
        Car car4 = new Car("Fiat", 2000);
        Car car5 = new Car("Maserati", 1999);

        Bike bike1 = new Bike("Ducati", 2000);
        Bike bike2 = new Bike("Aprilia", 2001);
        Bike bike3 = new Bike("MotoGuzzi", 2002);

        Car car6 = null;

        HashSet<Vehicle> veicoli = new HashSet<>();
        veicoli.add(car1);
        veicoli.add(car2);
        veicoli.add(car3);
        veicoli.add(car4);
        veicoli.add(car5);
        veicoli.add(bike1);
        veicoli.add(bike2);
        veicoli.add(bike3);
        veicoli.add(car6);

        System.out.println("Numero di veicoli unici: " + veicoli.size());

        boolean verifica = car1.equals(car4);
        System.out.println(verifica);

        System.out.println("Numero di macchine uniche: " + veicoli.size());

        int numeroCarUniche = 0;
        int numeroBikeUniche = 0;
        int numeroVehicleNull = 0;
        for (Vehicle veicolo : veicoli) {
            if (veicolo instanceof Car) {
                numeroCarUniche++;
                System.out.println(veicolo.getIdentifier());
            } else if (veicolo instanceof Bike) {
                numeroBikeUniche++;
                System.out.println(veicolo.getIdentifier());
            }
        }
        numeroVehicleNull = veicoli.size() - numeroBikeUniche - numeroCarUniche;

        System.out.println("Numero di Car uniche: " + numeroCarUniche);
        System.out.println("Numero di Bike uniche: " + numeroBikeUniche);
        System.out.println("Numero di Vehicle null: " + numeroVehicleNull);

    }
}
