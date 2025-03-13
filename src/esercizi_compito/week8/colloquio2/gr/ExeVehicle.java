package esercizi_compito.week8.colloquio2.gr;

interface Vehicle {
    void start();
    void stop();
    int getSpeed();
}

class Car implements Vehicle {
    private int speed;
    private String model;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }


    public Car() {
    }

    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }

    // Metodo da completare
    @Override
    public void stop(){
        System.out.println(model + " is stopping.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    // Metodo da completare: accelerare l'auto aumentando la velocità di un valore dato
    public void accelerate(int increment) {
        System.out.println("velocità attuale: " + speed + ", sta aumentando la velocità di " + increment );
    }

    // Metodo da completare: restituire una descrizione dell'auto
    public String getDescription() {
        return "Modello: " + model + ", velocità: " + speed;
    }
}

class VehicleUtils {
    // Metodo statico da completare: confronta la velocità di due veicoli e restituisce il più veloce
    // TODO: metodo da sistemare firma
    public static int compareSpeed(Vehicle v1, Vehicle v2) {
        // TODO: Implementare il confronto
        return v1.getSpeed() - v2.getSpeed();
    }
}

public class ExeVehicle {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Bmw");

        car1.start();
        car2.start();

        car1.accelerate(50); // Il candidato deve implementare questo metodo
        car2.accelerate(60);

        System.out.println(car1.getDescription()); // Il candidato deve implementare questo metodo
        System.out.println(car2.getDescription());

        int diffVelo = VehicleUtils.compareSpeed(car1, car2); // Il candidato deve implementare questo metodo
        System.out.println("The faster car is: " + (diffVelo > 0? car1.getDescription() : diffVelo == 0? "velocità uguale" : car2.getDescription()));
    }
}