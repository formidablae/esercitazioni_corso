package esercizi_in_lezione.week1.day1;

public class Casting1 {
    public static void main(String[] args) {
        double valoreDouble = 5.7;
        int valoreIntero = (int) valoreDouble;

        System.out.println("Valore double originale: " + valoreDouble);
        System.out.println("Valore intero dopo casting esplicito: " + valoreIntero);

        int interoPiccolo = 10;
        double doubleGrande = interoPiccolo;

        System.out.println("Valore intero piccolo: " + interoPiccolo);
        System.out.println("Valore double grande dopo casting implicito: " + doubleGrande);
    }
}
