package esercizi_in_lezione.week8.day3.car_builder;

public class CarBuilderExample {
    public static void main(String[] args) {
        CarV carV = new CarV("Fiat", "Panda", 2010, false);
        Car car = new Car.CarBuilder("Fiat", "Panda")
            .setYear(2010)
            .setIsElectric(false)
            .build();

        System.out.println(car);
    }
}
