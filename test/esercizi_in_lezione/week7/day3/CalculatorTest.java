package esercizi_in_lezione.week7.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testSum1() {
        int valoreAtteso = 5;
        int valoreEffettivo = calculator.sum(2, 3);
        assertEquals(valoreAtteso, valoreEffettivo);
    }

    @Test
    void testSum2() {
        int valoreAtteso = 6;
        int valoreEffettivo = calculator.sum(4, 2);
        assertEquals(valoreAtteso, valoreEffettivo);
    }

    @Test
    void testSub() {
        int valoreAtteso = 1;
        int valoreEffettivo = calculator.sub(3, 2);
        assertEquals(valoreAtteso, valoreEffettivo);
    }

    @Test
    void testMul() {
        int valoreAtteso = 10;
        int valoreEffettivo = calculator.mul(2, 5);
        assertEquals(valoreAtteso, valoreEffettivo);
    }

    @Test
    void testDiv1() {
        int valoreAtteso = 2;
        int valoreEffettivo = calculator.div(6, 3);
        assertEquals(valoreAtteso, valoreEffettivo);
    }

    @Test
    void testDiv2() {
        try {
            calculator.div(6, 0);
            // if no exception is thrown, the test fails
            assertEquals(true, false);
        } catch (ArithmeticException e) {
            assertEquals("Division by zero is not allowed", e.getMessage());
        }
    }
}