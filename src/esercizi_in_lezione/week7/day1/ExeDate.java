package esercizi_in_lezione.week7.day1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExeDate {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);

        // data di oggi in formato ISO 8601
        LocalDate oggi = LocalDate.now();
        System.out.println("Data di oggi: " + oggi);

        // data con offset
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("Data con offset: " + offsetDateTime);

        // formattazione di OffsetDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = offsetDateTime.format(formatter);
        System.out.println("Data formattata: " + formattedDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String formattedDateTime2 = offsetDateTime.format(formatter2);
        System.out.println("Data formattata 2: " + formattedDateTime2);

        System.out.print("Inserisci un fuso orario (es. Europe/Rome):");
        String timezone = lettore.nextLine();
        try {
            ZoneId zoneId = ZoneId.of(timezone);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
            System.out.println("Data e ora in " + timezone + ": " + zonedDateTime);
        } catch (Exception e) {
            System.out.println("Fuso orario non valido.");
        }

        // differenza tra due date
        System.out.print("Inserisci una data (yyyy-MM-dd):");
        String inputDate = lettore.nextLine();
        try {
            LocalDate date = LocalDate.parse(inputDate);
            Period periodo = Period.between(date, oggi);
            System.out.println("Diff tra date/ore: " + periodo);
            System.out.println("Differenza tra " + date + " e " + oggi + ": " + periodo.getYears() + " anni, " + periodo.getMonths() + " mesi, " + periodo.getDays() + " giorni");
        } catch (Exception e) {
            System.out.println("Data non valida.");
        }

        // data una certa data1, aggiungere 5 giorni a tale data
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = data1.plusDays(5);
        System.out.println("Data1: " + data1);
        System.out.println("Data2: " + data2);

        // controlla se una data è precedente ad un'altra
        if (data1.isBefore(data2)) {
            System.out.println("Data1 precedente a Data2");
        } else if (data1.isAfter(data2)) {
            System.out.println("Data1 successiva a Data2");
        } else {
            System.out.println("Data1 uguale a Data2");
        }

        lettore.close();

        // aggiungi 2 mesi a una data
        OffsetDateTime data3 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data4 = data3.plusMonths(2);
        System.out.println("Data3: " + data3);
        System.out.println("Data4: " + data4);

        LocalDate ultimoGiornoMesePrecedente = getLastDayOfPreviousMonth(LocalDate.now());
        System.out.println("Ultimo giorno del mese precedente: " + ultimoGiornoMesePrecedente);
        LocalDate primoGiornoMeseSuccessivo = getFirstDayOfNextMonth(LocalDate.now());
        System.out.println("Primo giorno del mese successivo: " + primoGiornoMeseSuccessivo);
    }

    // scrivi una funzione che data una certa data, restituisce l'ultima data del mese precedente
    public static LocalDate getLastDayOfPreviousMonth(LocalDate data) {
        LocalDate data2 = data.minusMonths(1);
        LocalDate data3 = data2.withDayOfMonth(data2.lengthOfMonth());
        return data3;
    }

    // trova il primo giorno del mese successivo
    public static LocalDate getFirstDayOfNextMonth(LocalDate data) {
        LocalDate data2 = data.plusMonths(1);
        LocalDate data3 = data2.withDayOfMonth(1);
        return data3;
    }
}
