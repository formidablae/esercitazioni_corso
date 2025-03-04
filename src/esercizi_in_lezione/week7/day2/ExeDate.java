package esercizi_in_lezione.week7.day2;

import java.time.OffsetDateTime;

public class ExeDate {
    public static void main(String[] args) {
        String dateStr = "2025-03-04T10:15:30+01:00";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateStr);
        System.out.println("senza formatting: " + dateTime);
        String formattedDate = dateTime.format(java.time.format.DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println("con formatting: " + formattedDate);
        // stampa solo l'ora
        System.out.println("ora: " + dateTime.getHour());

        OffsetDateTime dateTime2 = OffsetDateTime.parse("2024-03-25T10:15:30+01:00");
        long daysBetween = dateTime.getDayOfYear() - dateTime2.getDayOfYear();
        System.out.println("differenza in giorni: " + daysBetween);

        OffsetDateTime dateTime3 = OffsetDateTime.parse("2023-03-25T10:15:30+01:00");
        long daysBetween23 = dateTime2.getDayOfYear() - dateTime3.getDayOfYear();
        long diffYears = dateTime2.getYear() - dateTime3.getYear();
        System.out.println("diffYears: " + diffYears);
        System.out.println("daysBetween23 in giorni: " + (daysBetween23 + (diffYears * 365)));
    }
}
