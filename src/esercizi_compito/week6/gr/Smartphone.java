package esercizi_compito.week6.gr;

public class Smartphone extends ElectronicDevice{
    boolean has5G;
    public Smartphone(String brand, String model, boolean has5G) {
        super(brand, model);
        this.has5G = has5G;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj instanceof Smartphone) {
            Smartphone other = (Smartphone) obj;
            return this.has5G == other.has5G;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + (has5G ? 1 : 0);
    }
}
