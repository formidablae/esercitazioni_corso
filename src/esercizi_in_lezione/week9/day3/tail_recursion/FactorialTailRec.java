package esercizi_in_lezione.week9.day3.tail_recursion;

public class FactorialTailRec {
    private static int factorial(int n, int acc) {
        if (n == 0) {
            return acc;
        }
        return factorial(n - 1, n * acc);
    }

    public static int factorial(int n) {
        return factorial(n, 1);
    }

    public static void main(String[] args) {
        System.out.println("Fattoriale di 4: " + factorial(4));
        System.out.println("Fattoriale di 10: " + factorial(10));
        System.out.println("Fattoriale di 0: " + factorial(0));
    }
}
