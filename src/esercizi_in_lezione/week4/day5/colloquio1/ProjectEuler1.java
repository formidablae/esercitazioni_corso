package esercizi_in_lezione.week4.day5.colloquio1;

/*
https://projecteuler.net/problem=1

Problema: Somma dei multipli di 3 o 5
Se elenchiamo tutti i numeri naturali inferiori a 10 che sono multipli di 3 o 5, otteniamo: 3, 5, 6 e 9. La somma di questi multipli è 23.

Scrivere un programma Java che trovi la somma di tutti i multipli di 3 o 5 al di sotto di 1000.
 */
public class ProjectEuler1 {
    public static void main(String[] args) {
        // scrivere qui la soluzione
        int multipliDiNumeri = multipliDiNumeri(3, 5, 1000);
        System.out.println(multipliDiNumeri);

    }

    public static int multipliDiNumeri (int a, int b, int c) {
        int somma = 0;
        for (int i = 0; i < c; i++) {
            if (i % a == 0 || i % b == 0) {
                somma += i;
            }
        }
        return somma;
    }
}
