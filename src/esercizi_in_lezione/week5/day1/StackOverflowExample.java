package esercizi_in_lezione.week5.day1;

public class StackOverflowExample {
    public static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }

    public static void main(String[] args) {
        recursiveMethod();
    }
}
