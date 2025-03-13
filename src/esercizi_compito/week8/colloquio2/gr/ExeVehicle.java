package esercizi_compito.week8.colloquio2.gr;

interface Vehicle {
    void start();
    // richiedere che le classi che implementano Vehicle abbiano un metodo stop() che non restituisca nulla
    int getSpeed();
}

class Car implements Vehicle {
    private int speed;
    private String model;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    // TODO: scrivere costruttore senza parametro model

    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }

    // Metodo da completare
    @Override
    // TODO: Implementare
        System.out.println(model + " is stopping.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    // Metodo da completare: accelerare l'auto aumentando la velocità di un valore dato
    public void accelerate(int increment) {
        // TODO: Implementare l'incremento della velocità
    }

    // Metodo da completare: restituire una descrizione dell'auto
    public String getDescription() {
        // TODO: Restituire una stringa con modello e velocità
        return null;
    }
}

class VehicleUtils {
    // Metodo statico da completare: confronta la velocità di due veicoli e restituisce il più veloce
    // TODO: metodo da sistemare firma
    public Vehicle compareSpeed(Vehicle v1, Vehicle v2) {
        // TODO: Implementare il confronto
        return null;
    }
}

public class ExeVehicle {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car();

        car1.start();
        car2.start();

        car1.accelerate(50); // Il candidato deve implementare questo metodo
        car2.accelerate(60);

        System.out.println(car1.getDescription()); // Il candidato deve implementare questo metodo
        System.out.println(car2.getDescription());

        Vehicle fasterCar = VehicleUtils.compareSpeed(car1, car2); // Il candidato deve implementare questo metodo
        System.out.println("The faster car is: " + (fasterCar != null ? ((Car) fasterCar).getDescription() : "None"));
    }
}