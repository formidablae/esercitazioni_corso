package esercizi_compito.week6.gr;

public class ElectronicDevice implements Powerable {
    private String brand;
    private String model;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    @Override
    public void turnOn() {
        System.out.println("Device is turned on.");
    }
    @Override
    public void turnOff() {
        System.out.println("Device is turned off.");
    }
    @Override
    public boolean equals (Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ElectronicDevice) {
            ElectronicDevice other = (ElectronicDevice) obj;
            return this.brand.equals(other.brand) && this.model.equals(other.model);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return brand.hashCode() + model.hashCode();
    }
    public void deviceInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}
