package esercizi_in_lezione.week1.day5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            System.out.print("\rCurrent Time: " + LocalTime.now().format(formatter));
            Thread.sleep(1000);
        }
    }
}
