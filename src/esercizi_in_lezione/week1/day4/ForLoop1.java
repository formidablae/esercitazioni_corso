package esercizi_in_lezione.week1.day4;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        System.out.println("Prima del ciclo for");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 100; i++) {
            System.out.println("Durante il ciclo for. i = " + i);
            if (i % 10 == 0) {
                System.out.print("Vuoi interrompere il ciclo: 'S' per indicare Sì: ");
                String risp = scanner.next();
                if (risp.equals("S")) break;
            }
        }
        System.out.println("Sono uscito dal ciclo for");
    }
}
