package esercizi_in_lezione.week9.day3.tail_recursion;

public class FabonacciTailRec {
    public static int fibonacci(int n, int a, int b) {
        if (n == 0) return a; // Caso base
        if (n == 1) return b; // Caso base
        return fibonacci(n - 1, b, a + b); // Tail recursion
    }

    public static int fibonacci(int n) {
        return fibonacci(n, 0, 1); // Chiamata iniziale
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10)); // Output: 55
    }
}
