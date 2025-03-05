package esercizi_compito.week7.dc;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
 1. Creare un'applicazione Java che utilizzi Date e OffsetDateTime.
 2. Convertire una data (ad esempio la data di oggi) in formato ISO 8601.
 3. Formattare un OffsetDateTime in diversi formati (ad esempio data americana, data italiana, ecc.).
 4. Eseguire operazioni con OffsetDateTime (come ad esempio aggiungere 2 giorni, sottrarre 3 ore)
 5. Cambiare il fuso orario di un OffsetDateTime (ad esempio da UTC a UTC+2).
 6. Calcolare la differenza in giorni tra due OffsetDateTime.
 */
public class DateExe {
    public static void main(String[] args) {
        // implementare qui la soluzione
        String dateStr = "2025-03-20T10:15:30+01:00";
        OffsetDateTime date = OffsetDateTime.parse(dateStr);
        System.out.println(date);

        //offsetDateTime adesso
        OffsetDateTime now = OffsetDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDateTime = date.format(formatter);
        System.out.println("\nData generica: " + formattedDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDateTime2 = date.format(formatter2);
        System.out.println("\nData Americana: " + formattedDateTime2);

        OffsetDateTime newDate = date.plusDays(2).minusHours(3);
        System.out.println("\nData modificata: " + newDate);

        ZonedDateTime cambioFuso = newDate.atZoneSameInstant(java.time.ZoneId.of("Europe/Rome"));
        System.out.println("\nData modificata in Italia: " + cambioFuso);

        long daysBetween = now.getDayOfYear() - date.getDayOfYear();
        System.out.println("\nDifferenza in giorni: " + daysBetween);

    }
}
