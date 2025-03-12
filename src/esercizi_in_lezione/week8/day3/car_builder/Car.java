package esercizi_in_lezione.week8.day3.car_builder;

public class Car {
    private String brand;
    private String model;
    private int year;
    private boolean isElectric;

    public Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.isElectric = builder.isElectric;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", isElectric=" + isElectric + "]";
    }

    // Builder: Classe statica interna per costruire oggetti Car
    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private boolean isElectric;

        public CarBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
