package esercizi_in_lezione.week8.day5;

public class Ripasso1Stringhe {
    public static void main(String[] args) {
        String nome = "Mario";
        System.out.println("Lunghezza nome: " + nome.length());
        System.out.println("Lunghezza nome: " + nome.toUpperCase());
        System.out.println("Lunghezza nome: " + nome.toLowerCase());
        System.out.println("Lunghezza nome: " + nome.charAt(0));
        System.out.println("Lunghezza nome: " + nome.indexOf("r"));
        System.out.println("Lunghezza nome: " + nome.substring(2));
        System.out.println("Lunghezza nome: " + nome.substring(2, 4));
    }
}
