package esercizi_compito.week6.pp;

public class Car extends Vehicle {

    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public String getIdentifier() {
        return super.getIdentifier() + "-Car";
    }
}
