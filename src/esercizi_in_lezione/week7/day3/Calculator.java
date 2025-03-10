package esercizi_in_lezione.week7.day3;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }


    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
