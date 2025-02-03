/* **Esercizio 4: Convertitore di temperatura**
 Obiettivo: Creare un programma che converta una temperatura da Celsius a Fahrenheit o viceversa.

 Requisiti:

 1. Il programma deve richiedere all'utente di inserire un valore numerico di temperatura utilizzando `Scanner(System.in)`.
 2. Deve utilizzare una variabile primitiva `double` per memorizzare la temperatura inserita.
 3. Deve utilizzare una variabile `String` per memorizzare l'unità di misura scelta dall'utente (C o F).
 4. Deve utilizzare una funzione `public static double convertTemperature(double temp, String unit)` per eseguire la conversione.
 5. Deve utilizzare un'istruzione `if-elseif-else` per verificare se l'unità inserita è valida.
 6. Deve utilizzare un'istruzione `switch` per determinare la conversione da effettuare.
 7. Deve stampare il valore della temperatura convertita.
 8. Deve gestire eventuali errori di input (es. unità non valide).

*/
package esercizi_compito.week2.rs;

import java.util.Locale;
import java.util.Scanner;


public class EsercizioTemperatura2 {
    public static void main(String[] args) {

        Scanner lettore = new Scanner(System.in);

        System.out.print("Inserisci valore temperatura ");
        double temperatura = lettore.nextDouble();
        System.out.print("Inserisci C per gradi Celsius, F per Fahrenheit ");
        String unit = lettore.next().toUpperCase(Locale.ROOT);

        double conversioneTemperatura = convertTemperature(temperatura, unit);


        if (unit.equals("C"))
        {
            System.out.println("La temperatara convertita equivale a " + conversioneTemperatura + " Gradi Fahrenheit " );
        }
        else if (unit.equals("F"))
        {
            System.out.println("La temperatara convertita equivale a " + conversioneTemperatura + " Gradi Celsius " );
        }


    }

    public static double convertTemperature(double temp, String unit) {


        switch (unit) {

            case "C":
                return (temp * 9 / 5) + 32;

            case "F":
                return (temp - 32) / 9 * 5;
            default:
                System.out.println("L'unità di misura scelta non è valida ");

                return Double.NaN;


        }

    }


}
