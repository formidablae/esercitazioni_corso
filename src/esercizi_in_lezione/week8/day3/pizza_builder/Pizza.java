package esercizi_in_lezione.week8.day3.pizza_builder;

public class Pizza {
    private String size;
    private boolean hasCheese;
    private boolean hasTomato;
    private boolean hasMushrooms;
    private boolean hasPepperoni;

    public Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.hasCheese = builder.hasCheese;
        this.hasTomato = builder.hasTomato;
        this.hasMushrooms = builder.hasMushrooms;
        this.hasPepperoni = builder.hasPepperoni;
    }

    @Override
    public String toString() {
        return "Pizza " + size + ", with: " + (hasCheese ? "Cheese " : "") + (hasTomato ? "Tomato " : "") + (hasMushrooms ? "Mushrooms " : "") + (hasPepperoni ? "Pepperoni " : "");
    }

    public static class PizzaBuilder {
        private String size;
        private boolean hasCheese;
        private boolean hasTomato;
        private boolean hasMushrooms;
        private boolean hasPepperoni;

        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder addCheese() {
            this.hasCheese = true;
            return this;
        }

        public PizzaBuilder addTomato() {
            this.hasTomato = true;
            return this;
        }

        public PizzaBuilder addMushrooms() {
            this.hasMushrooms = true;
            return this;
        }

        public PizzaBuilder addPepperoni() {
            this.hasPepperoni = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
