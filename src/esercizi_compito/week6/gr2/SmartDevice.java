package esercizi_compito.week6.gr2;

public class SmartDevice implements Connectable{
    private String brand;
    private String model;
    private boolean isConnected;

    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isConnected = false;
    }

    public void connectToWiFi() {
        isConnected = true;
        System.out.println("Device connected to WiFi.");
    }

    public void disconnectFromWiFi() {
        isConnected = false;
        System.out.println("Device disconnected from WiFi.");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartDevice that = (SmartDevice) o;
        return brand.equals(that.brand) && model.equals(that.model);
    }

    public int hashCode() {
        return brand.hashCode() + model.hashCode();
    }

    public static void generalInfo() {
        System.out.println("This is a smart device.");
    }
}
