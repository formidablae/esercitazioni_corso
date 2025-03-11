package esercizi_compito.week8.pp;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 1. Creare un metodo che sommi due numeri di tipo BigInteger.
 * Il metodo deve restituire il risultato come BigInteger.
 *
 * 2. Creare un metodo che moltiplichi due numeri di tipo BigDecimal.
 * Il metodo deve restituire il risultato come BigDecimal.
 *
 * 3. Creare un metodo che calcoli la radice quadrata di un numero double utilizzando Math.sqrt().
 * Il metodo deve restituire un valore double.
 *
 * 4. Creare un metodo che restituisca il maggiore tra due numeri interi utilizzando l'operatore ternario ? :.
 * Il metodo deve restituire un valore int.
 *
 * 5. Creare una classe di test MathOperationsTest.
 * Implementare test per tutti i metodi sopra definiti.
 *
 * Nota: Per la radice quadrata, tollerare un errore minimo con un valore di delta (es. 0.0001).
 */
public class OperazioniMatematiche {
    // TODO: implementare i metodi richiesti
    public static BigInteger sommaBigInteger(BigInteger big1, BigInteger big2) {
        return big1.add(big2);
    }

    public static BigDecimal moltiplicaBigDecimal(BigDecimal big1, BigDecimal big2) {
        return big1.multiply(big2);
    }

    public static double radiceQuadrata(double num1) {
        return Math.sqrt(num1);
    }

    public static int maggiore(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }


}
