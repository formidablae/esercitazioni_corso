package esercizi_in_lezione.week9.day3.ricorsione_multipla;

import java.util.HashMap;

public class FibonacciMemo {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // caso base 1
        }
        if (n == 1) {
            return 1;  // caso base 2
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci di 0: " + fibonacci(0));
        System.out.println("Fibonacci di 1: " + fibonacci(1));
        System.out.println("Fibonacci di 5: " + fibonacci(5));
        System.out.println("Fibonacci di 10: " + fibonacci(10));
        System.out.println("Fibonacci di 11: " + fibonacci(11));
        System.out.println("Fibonacci di 12: " + fibonacci(12));
        System.out.println("Fibonacci di 11: " + fibonacci(7));
    }
}
