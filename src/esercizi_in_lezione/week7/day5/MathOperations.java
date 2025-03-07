package esercizi_in_lezione.week7.day5;

import java.util.ArrayList;

public class MathOperations {

    // somma di una serie di numeri
    public static int sumSerie(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // dato a e b, funzione che restituisce la serie di numeri da a a b
    public static ArrayList<Integer> range(int a, int b) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    // dato un angolo alfa e beta di un triangolo, restituisce l'angolo gamma
    public static double angle(double alpha, double beta) {
        return 180 - alpha - beta;
    }

    // dato un numero, restituisce il suo fattoriale
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // dato un numero, restituisce true se è primo, false altrimenti
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
