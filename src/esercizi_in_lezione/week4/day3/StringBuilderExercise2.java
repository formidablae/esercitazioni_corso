package esercizi_in_lezione.week4.day3;

public class StringBuilderExercise2 {
    public static void main(String[] args) {
        // calcola il tempo necessario per concatenare 10000 stringhe con + e con StringBuilder
        long startTime = System.currentTimeMillis();
        // System.out.println("tempo all'inizio: " + startTime);
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "bla bla bla " + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo necessario con +: " + (endTime - startTime) + " ms");
        // System.out.println(str);
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("bla bla bla " + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Tempo necessario con StringBuilder: " + (endTime - startTime) + " ms");
        // System.out.println(sb.toString());

        // fai il reverse del testo
        StringBuilder nuovaStr = new StringBuilder("Ciao");
        String nuovaStrReverse = nuovaStr.reverse().toString();
        System.out.println(nuovaStrReverse);
    }
}
