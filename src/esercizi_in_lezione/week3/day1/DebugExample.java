package esercizi_in_lezione.week3.day1;

public class DebugExample {
    // debugging
    // de-bug-g-ing

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        for (int i = 0; i <= numbers.length; i++) { // Errore: out of bounds
            System.out.println(numbers[i]);
        }
    }
}
