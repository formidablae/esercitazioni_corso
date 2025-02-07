package esercizi_compito.week3.pp.stats_di_un_array;

/*
Scrivere un programma Java che esegua diverse operazioni su un array di numeri interi utilizzando i cicli.
  Istruzioni:
    - Stampare l’array utilizzando un ciclo for.
    - Trovare e stampare:
        - Il numero più piccolo nell’array.
        - Il numero più grande nell’array.
        - La somma di tutti gli elementi.
        - La media dei numeri (come double, con due decimali).
    - Contare e stampare quanti numeri sono pari e quanti sono dispari.

Esempio di output:
Array: [12, 45, 78, 23, 56, 89, ...]
Numero più piccolo: 5
Numero più grande: 98
Somma: 1123
Media: 56.15
Numeri pari: 10
Numeri dispari: 10
 */
public class StatsDiUnArray {
    public static void main(String[] args) {
        // Implementare qui la soluzione
        int[] arrayInput = {12, 70, 35, 89, 4, 55, 40};
        int l = arrayInput.length;
        int minimo = arrayInput[0];
        int massimo = arrayInput[0];
        int somma = 0;
        int pari = 0;
        int dispari = 0;
        for (int i = 1; i < l; i++) {
            if (arrayInput[i] < minimo) {
                minimo = arrayInput[i];
            }
            if (arrayInput[i] > massimo) {
                massimo = arrayInput[i];
            }
            somma = somma + arrayInput[i];
            if (arrayInput[i] % 2 == 0) {
                pari++;
            }
            System.out.print(arrayInput[i] + ", ");
        }
        dispari = l - pari;
        double media = somma / l;
        System.out.println("Il minimo dell'array è pari a: " + minimo);
        System.out.println("Il massimo dell'array è pari a: " + massimo);
        System.out.println("La somma di tutti gli elementi dell'array è pari a: " + somma);
        System.out.println("La media degli elementi dell'array è pari a: " + media);
        System.out.println("In questo array ci sono " + pari + " numeri pari");
        System.out.println("In questo array ci sono " + dispari + " numeri dispari");
    }
}
