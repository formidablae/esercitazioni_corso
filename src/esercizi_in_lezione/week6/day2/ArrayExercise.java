package esercizi_in_lezione.week6.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        String[] names = {"Charlie", "Bob", "Alice", "Eve", "David"};
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println("Nomi nell'ordine originale: " + Arrays.toString(names));
        System.out.println("Nomi in arraylist nell'ordine originale: " + namesList);

        Arrays.sort(names);

        System.out.println("Nomi ordinati in ordine alfabetico: " + Arrays.toString(names));
        System.out.println("Nomi in arraylist (non) ordinati in ordine alfabetico: " + namesList);

        // metti in ordine namesList
        namesList.sort(String::compareTo);
        System.out.println("Nomi in arraylist ordinati in ordine alfabetico: " + namesList);

        String a = "mela";
        String b = "banana";
        String c = "mela";
        System.out.println("a.compareTo(b): " + a.compareTo(b));
        System.out.println("b.compareTo(a): " + b.compareTo(a));
        System.out.println("a.compareTo(c): " + a.compareTo(c));
        System.out.println("c.compareTo(a): " + c.compareTo(a));
        System.out.println("b.compareTo(c): " + b.compareTo(c));
        System.out.println("c.compareTo(b): " + c.compareTo(b));

        // ordina gli elementi d i namesList per lunghezza della stringa
        // f(x) = x ^ 2 + 5
        // f(x, y) = x * 2 + y + 5
        namesList.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("Nomi in arraylist ordinati per lunghezza: " + namesList);

    }
}
