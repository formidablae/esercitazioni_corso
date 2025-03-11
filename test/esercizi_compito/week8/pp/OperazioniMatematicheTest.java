package esercizi_compito.week8.pp;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class OperazioniMatematicheTest {

    @Test
    void sommaBigInteger() {
        BigInteger bigInt1 = new BigInteger("12345678901234567890");
        BigInteger bigInt2 = new BigInteger("55554534234252525252");
        BigInteger expected = bigInt1.add(bigInt2);
        BigInteger actual = OperazioniMatematiche.sommaBigInteger(bigInt1, bigInt2);
        assertEquals(expected, actual);
    }

    @Test
    void moltiplicaBigDecimal() {
        BigDecimal bigDec1 = new BigDecimal("12.345678901234567890");
        BigDecimal bigDec2 = new BigDecimal("55.554534234252525252");
        BigDecimal expected = bigDec1.multiply(bigDec2);
        BigDecimal actual = OperazioniMatematiche.moltiplicaBigDecimal(bigDec1, bigDec2);
        assertEquals(expected, actual);
    }

    @Test
    void radiceQuadrata() {
        double num1 = 123.456;
        double expected = Math.sqrt(num1);
        double actual = OperazioniMatematiche.radiceQuadrata(num1);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void maggiore() {
        int num1 = 123;
        int num2 = 456;
        int expected = (num1 > num2) ? num1 : num2;
        int actual = OperazioniMatematiche.maggiore(num1, num2);
        assertEquals(expected, actual);
    }
}