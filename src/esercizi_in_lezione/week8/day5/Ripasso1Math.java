package esercizi_in_lezione.week8.day5;

public class Ripasso1Math {
    public static void main(String[] args) {
        int numeroIntero = 10;
        double numeroDouble = 10.5;
        System.out.println("Max: " + Math.max(numeroIntero, numeroDouble));
        System.out.println("Min: " + Math.min(numeroIntero, numeroDouble));
        System.out.println("Abs: " + Math.abs(-10));
        System.out.println("Sqrt: " + Math.sqrt(10));
        System.out.println("Pow: " + Math.pow(2, 3));
        System.out.println("Random: " + Math.random());
        System.out.println("Random: " + (int) (Math.random() * 10));
    }
}
