package esercizi_in_lezione.week7.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void testConvertCelsiusToFahrenheit() {
        // GIVEN: temperatura in gradi Celsius
        double celsius1 = 25.0;
        double celsius2 = 0.0;
        double celsius3 = -10.0;
        double celsius4 = 100.0;
        double celsius5 = -273.15;

        // WHEN: chiamo il metodo convertCelsiusToFahrenheit
        double fahrenheit1 = tc.convertCelsiusToFahrenheit(celsius1);
        double fahrenheit2 = tc.convertCelsiusToFahrenheit(celsius2);
        double fahrenheit3 = tc.convertCelsiusToFahrenheit(celsius3);
        double fahrenheit4 = tc.convertCelsiusToFahrenheit(celsius4);
        double fahrenheit5 = tc.convertCelsiusToFahrenheit(celsius5);

        // THEN: il risultato deve essere corretto
        double expected1 = 77.0;
        double expected2 = 32.0;
        double expected3 = 14.0;
        double expected4 = 212.0;
        double expected5 = -459.67;

        assertEquals(expected1, fahrenheit1);
        assertEquals(expected2, fahrenheit2);
        assertEquals(expected3, fahrenheit3);
        assertEquals(expected4, fahrenheit4);
        assertEquals(expected5, fahrenheit5);
    }

    @Test
    void testConvertFahrenheitToCelsius() {
        // GIVEN: temperatura in gradi Fahrenheit
        double fahrenheit1 = 77.0;
        double fahrenheit2 = 32.0;
        double fahrenheit3 = 14.0;
        double fahrenheit4 = 212.0;
        double fahrenheit5 = -459.67;

        // WHEN: chiamo il metodo convertFahrenheitToCelsius
        double celsius1 = tc.convertFahrenheitToCelsius(fahrenheit1);
        double celsius2 = tc.convertFahrenheitToCelsius(fahrenheit2);
        double celsius3 = tc.convertFahrenheitToCelsius(fahrenheit3);
        double celsius4 = tc.convertFahrenheitToCelsius(fahrenheit4);
        double celsius5 = tc.convertFahrenheitToCelsius(fahrenheit5);

        // THEN: il risultato deve essere corretto
        double expected1 = 25.0;
        double expected2 = 0.0;
        double expected3 = -10.0;
        double expected4 = 100.0;
        double expected5 = -273.15;

        assertEquals(expected1, celsius1);
        assertEquals(expected2, celsius2);
        assertEquals(expected3, celsius3);
        assertEquals(expected4, celsius4);
        assertEquals(expected5, celsius5);
    }
}