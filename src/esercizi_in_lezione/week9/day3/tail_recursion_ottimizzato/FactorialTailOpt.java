package esercizi_in_lezione.week9.day3.tail_recursion_ottimizzato;

public class FactorialTailOpt {
    private static int factorialIterative(int n) {
        int acc = 1;
        for (int i = 1; i <= n; i++) {
            acc *= i;
        }
        return acc;
    }

    public static void main(String[] args) {
        System.out.println("Fattoriale di 4: " + factorialIterative(4));
        System.out.println("Fattoriale di 10: " + factorialIterative(10));
        System.out.println("Fattoriale di 0: " + factorialIterative(0));
    }
}
