package esercizi_compito.week6.pp;

import java.util.Objects;

public abstract class Vehicle implements IIdentifiable{
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String getIdentifier() {
        return brand + "-" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return this.getIdentifier().equals(vehicle.getIdentifier());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentifier());
    }
}
