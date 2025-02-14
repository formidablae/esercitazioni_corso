package esercizi_in_lezione.week4.day5.colloquio1;

/*
https://projecteuler.net/problem=2

Problema: Somma dei termini pari della sequenza di Fibonacci
Ogni nuovo termine nella sequenza di Fibonacci è generato sommando i due termini precedenti. Iniziando con 1 e 2, i primi 10 termini della sequenza sono:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

Considerando i termini della sequenza di Fibonacci che non superano quattro milioni, trovare la somma di quelli con valore pari.
 */
public class ProjectEuler2 {
    public static void main(String[] args) {
        int maxNumber = 4000000;
        int previousNumber = 0;
        int nextNumber = 1;
        int somma = 0;
        for (int i = 1; previousNumber <= maxNumber; ++i) {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            if (nextNumber % 2 == 0) {
                somma += nextNumber;
            }
            System.out.println("previousNumber: "+ previousNumber);
            System.out.println("nextNumber: "+ nextNumber);
        }
        System.out.println("Somma dei numeri pari di Fibonacci minori di 4 milioni: "+ somma);

    }
}
