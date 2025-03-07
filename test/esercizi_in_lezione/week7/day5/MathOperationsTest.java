package esercizi_in_lezione.week7.day5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static esercizi_in_lezione.week7.day5.MathOperations.*;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    @Test
    void testSumSerie1() {
        // GIVEN: Una lista vuota
        ArrayList<Integer> numbers = new ArrayList<>();

        // WHEN: La funzione sumSerie viene chiamata
        int result = sumSerie(numbers);

        // THEN: Il risultato deve essere 0
        assertEquals(0, result);

    }

    @Test
    void testSumSerie2() {
        // GIVEN: Una lista contenente un solo numero (5)
        ArrayList<Integer> numbers = new ArrayList<>(List.of(5));

        // WHEN: La funzione sumSerie viene chiamata
        int result = sumSerie(numbers);

        // THEN: Il risultato deve essere 5
        assertEquals(5, result);
    }

    @Test
    void testSumSerie3() {
        // GIVEN: Una lista contenente numeri negativi (-3, -7, -2)
        ArrayList<Integer> numbers = new ArrayList<>(List.of(-3, -7, -2));

        // WHEN: La funzione sumSerie viene chiamata
        int result = sumSerie(numbers);

        // THEN: Il risultato deve essere -12
        assertEquals(-12, result);
    }

    @Test
    void testSumSerie4() {
        // GIVEN: Una lista con Integer.MAX_VALUE e 1
        ArrayList<Integer> numbers = new ArrayList<>(List.of(Integer.MAX_VALUE, 1));

        // WHEN: La funzione sumSerie viene chiamata
        int result = sumSerie(numbers);

        // THEN: Il comportamento dipende dalla gestione dell'overflow (potrebbe diventare negativo)
        // 5 in binario è 00000101
        // 1 in binario è 00000001
        // 6 in binario è 00000110
        // 1 in binario è 00000001
        // 7 in binario è 00000111
        // 8 in binario è 00001000
        //  2147483647 in binario è 01111111111111111111111111111111
        // -2147483648 in binario è 10000000000000000000000000000000

        assertEquals(2147483647, Integer.MAX_VALUE);
        assertEquals(-2147483648, result);
    }

    @Test
    void testSumSerie5() {
        // GIVEN: Una lista con numeri che si annullano (10, -5, -5, 0)
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, -5, -5, 0));

        // WHEN: La funzione sumSerie viene chiamata
        int result = sumSerie(numbers);

        // THEN: Il risultato deve essere 0
        assertEquals(0, result);
    }


    @Test
    void testRange() {
        ArrayList<Integer> result = range(3, 7);
        assertEquals(List.of(3, 4, 5, 6, 7), result);
    }

    @Test
    void testRangeSingleValue() {
        ArrayList<Integer> result = range(5, 5);
        assertEquals(List.of(5), result);
    }

    @Test
    void testAngle() {
        double result = angle(60, 60);
        assertEquals(60, result);
    }

    @Test
    void testAngleZero() {
        double result = angle(0, 0);
        assertEquals(180, result);
    }

    @Test
    void testFactorialZero() {
        int result = factorial(0);
        assertEquals(1, result);
    }

    @Test
    void testFactorialPositive() {
        int result = factorial(5);
        assertEquals(120, result);
    }

    @Test
    void testFactorialOne() {
        int result = factorial(1);
        assertEquals(1, result);
    }

    @Test
    void testIsPrimeTrue() {
        assertTrue(isPrime(7));
    }

    @Test
    void testIsPrimeFalse() {
        assertFalse(isPrime(10));
    }

    @Test
    void testIsPrimeOne() {
        assertFalse(isPrime(1));
    }
}