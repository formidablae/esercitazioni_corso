import java.util.Scanner;

public class StringheEsercizio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una frase: ");
        String frase = scanner.nextLine();

        System.out.println("La frase inserita è: " + frase);
        int lunghezza = frase.length();

        String a = "Parte iniziale";
        String b = ", Parte finale";
        String c = a + b;
        System.out.println("c: " + c);

        System.out.println("La lunghezza della frase è: " + lunghezza);

        String fraseMaiuscola = frase.toUpperCase();
        System.out.println("Frase in maiuscolo: " + fraseMaiuscola);

        String fraseMinuscola = frase.toLowerCase();
        System.out.println("Frase in minuscolo: " + fraseMinuscola);
    }
}
