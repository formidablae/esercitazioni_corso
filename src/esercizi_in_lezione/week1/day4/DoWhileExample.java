package esercizi_in_lezione.week1.day4;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prima del ciclo do-while1");
        int num;
        do {
            System.out.print("Durante do-while1. Inserisci un numero positivo: ");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.println("Dopo il ciclo do-while1");

        System.out.println("Prima del ciclo do-while2");
        int i = 0;
        do {
            System.out.println("Durante do-while2. i = " + i);
            i++;
        } while (i <= -5);
        System.out.println("Dopo il ciclo do-while2");
    }
}
