package esercizi_in_lezione.week7.day3;

/**
 * Classe che gestisce la conversione delle temperature tra Celsius e Fahrenheit.
 */
public class TemperatureConverter {

    /**
     * Converte temperatura da Celcius a Fahrenheit
     * Formula: (C × 9/5) + 32
     * @param celsius temperatura in gradi Celsius
     * @return temperatura convertita in gradi Fahrenheit
     */
    public double convertCelsiusToFahrenheit(double celsius) {
        return Math.round(((celsius * 9 / 5) + 32) * 100.0) / 100.0;
    }

    /**
     * Converte temperatura da Fahrenheit a Celsius
     * Formula: (F - 32) × 5/9
     * @param fahrenheit temperatura in gradi Fahrenheit
     * @return temperatura convertita in gradi Celsius
     */
    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
