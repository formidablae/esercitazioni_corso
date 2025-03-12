package esercizi_in_lezione.week8.day3.pizza_builder;

public class PizzaBuilderExample {
    public static void main(String[] args) {
        // pizza media without pepperoni
        PizzaV pizzaV1 = new PizzaV("Medium", true, true, true, false);
        Pizza pizza1 = new Pizza.PizzaBuilder("Medium")
                .addCheese()
                .addTomato()
                .addMushrooms()
                .build();

        System.out.println(pizza1);

        // pizza grande senza funghi
        PizzaV pizzaV2 = new PizzaV("Large", true, true, false, true);
        Pizza pizza2 = new Pizza.PizzaBuilder("Large")
                .addCheese()
                .addTomato()
                .addPepperoni()
                .build();

        System.out.println(pizza2);
    }
}
