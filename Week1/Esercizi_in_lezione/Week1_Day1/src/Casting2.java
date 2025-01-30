import java.util.Scanner;

public class Casting2 {
    public static void main(String[] args) {
        Scanner ilMioScanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numeroIntero = ilMioScanner.nextInt();

        System.out.print("Inserisci un numero decimale: ");
        double numeroDecimale = ilMioScanner.nextDouble();

        double somma = numeroIntero + numeroDecimale;

        System.out.println("Somma (double): " + somma);

        int differenza = numeroIntero - (int) numeroDecimale;
        System.out.println("Differenza (int): " + differenza);

        ilMioScanner.close();
    }
}
