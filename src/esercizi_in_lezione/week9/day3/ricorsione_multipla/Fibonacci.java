package esercizi_in_lezione.week9.day3.ricorsione_multipla;

// 1 1
// 1 1 2 3 5 8 13 21 34 55

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // caso base 1
        }
        if (n == 1) {
            return 1;  // caso base 2
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci di 0: " + fibonacci(0));
        System.out.println("Fibonacci di 1: " + fibonacci(1));
        System.out.println("Fibonacci di 5: " + fibonacci(5));
        System.out.println("Fibonacci di 10: " + fibonacci(10));
        System.out.println("Fibonacci di 11: " + fibonacci(11));
        System.out.println("Fibonacci di 12: " + fibonacci(12));
    }
}
