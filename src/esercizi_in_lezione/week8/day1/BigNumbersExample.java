package esercizi_in_lezione.week8.day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbersExample {
    public static void main(String[] args) {
        // BigInteger
        BigInteger bigInt1 = new BigInteger("12345678901234567890");
        BigInteger bigInt2 = new BigInteger("55554534234252525252");
        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("Sum: " + sum);

        // BigDecimal
        BigDecimal bigDec1 = new BigDecimal("0.00000000000001234567890");
        BigDecimal bigDec2 = new BigDecimal("55554534234252525252.55554534234252525252");
        BigDecimal prodDec = bigDec1.multiply(bigDec2);
        System.out.println("Product: " + prodDec);
    }
}
