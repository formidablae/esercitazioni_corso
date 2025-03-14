package esercizi_in_lezione.week8.day5;

public class Ripasso1Casting {
    // Casting
    public static void main(String[] args) {
        int numeroIntero = 10;
        double numeroDouble = numeroIntero; // Casting implicito
        int numeroConvertito =  (int) numeroDouble; // Casting esplicito
        System.out.println("numeroConvertito: " + numeroConvertito);
    }
}
