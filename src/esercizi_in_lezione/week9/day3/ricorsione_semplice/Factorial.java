package esercizi_in_lezione.week9.day3.ricorsione_semplice;

// x = 4
// x! = 4 * 3 * 2 * 1
// y = 10
// y! = 10 * 9 * 8 * ...
// x! = 4 * 3!
// y! = 10 * 9!
// y! = 10 * 9 * 8!
// 0! = 1
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Fattoriale di 4: " + factorial(4));
        System.out.println("Fattoriale di 10: " + factorial(10));
        System.out.println("Fattoriale di 0: " + factorial(0));
    }
}
