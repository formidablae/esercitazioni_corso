package esercizi_in_lezione.week8.day5;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ripasso2Date {
    public static void main(String[] args) {
        // TODO: Stampare la data corrente
        LocalDate dataCorrente = LocalDate.now();
        System.out.println(dataCorrente);
        // TODO: Stampare l'ora di adesso in Tokyo
        String timeZone = "Asia/Tokyo";
        ZoneId zoneId = ZoneId.of(timeZone);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);
    }
}
