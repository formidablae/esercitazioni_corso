package esercizi_in_lezione.week6.day2;

import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        numbers.removeIf(num -> num % 2 == 0);

        System.out.println("Numeri rimasti in ArrayList: " + numbers);
    }
}
