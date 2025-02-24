package esercizi_compito.week6.pp;

public class Bike extends Vehicle {

    public Bike(String brand, int year) {
        super(brand, year);
    }

    @Override
    public String getIdentifier() {
        return super.getIdentifier() + "-Bike";
    }
}
