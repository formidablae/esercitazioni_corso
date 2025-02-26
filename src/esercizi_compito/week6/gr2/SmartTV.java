package esercizi_compito.week6.gr2;

public class SmartTV extends SmartDevice{
    private double screenSize;

    public SmartTV(String brand, String model, double screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartTV that = (SmartTV) o;
        return Double.compare(that.screenSize, screenSize) == 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Double.hashCode(screenSize);
    }
}
