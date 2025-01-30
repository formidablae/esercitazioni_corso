import java.util.Scanner;

public class TipiPrimitivi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la lunghezza del rettangolo: ");
        double lunghezza = scanner.nextDouble();
        System.out.print("Inserisci la larghezza del rettangolo: ");
        double larghezza = scanner.nextDouble();

        System.out.println("lunghezza inserita = " + lunghezza);
        System.out.println("larghezza inserita = " + larghezza);

        if (lunghezza > 0 && larghezza > 0) {
            double area = lunghezza * larghezza;
            double perimetro = 2 * (lunghezza + larghezza);

            System.out.println("Area: " + area);
            System.out.println("Perimetro: " + perimetro);
        } else {
            System.out.println("Le dimensioni del rettangolo dovrebbero essere positivi");
        }
    }
}
