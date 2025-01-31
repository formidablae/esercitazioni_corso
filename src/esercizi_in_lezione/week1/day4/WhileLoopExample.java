package esercizi_in_lezione.week1.day4;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Prima del ciclo while");
        while (i < 100) {
            System.out.println("Durante il ciclo while. i = " + i);
            i++;
        }
        System.out.println("Sono uscito dal ciclo while");
    }
}