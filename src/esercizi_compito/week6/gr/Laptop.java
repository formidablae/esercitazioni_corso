package esercizi_compito.week6.gr;

public class Laptop extends ElectronicDevice{
    int ramSize;
    public Laptop(String brand, String model, int ramSize) {
        super(brand, model);
        this.ramSize = ramSize;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj instanceof Laptop) {
            Laptop other = (Laptop) obj;
            return this.ramSize == other.ramSize;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + ramSize;
    }
}
