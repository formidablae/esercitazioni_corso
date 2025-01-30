import java.util.Scanner;

public class OperatoriAritmetici1 {
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int num = lettore.nextInt();
        System.out.println("Hai inserito: " + num);

        int quadrato = num * num;
        int cubo = num * num * num;
        System.out.println("quadrato: " + quadrato);
        System.out.println("cubo: " + cubo);
        int potenzaAlla7Custom = num * num * num * num * num * num * num;
        int potenzaAlla7 = (int) Math.pow(num, 7);
        System.out.println("potenzaAlla7Custom: " + potenzaAlla7Custom);
        System.out.println("potenzaAlla7: " + potenzaAlla7);

        lettore.close();
    }
}
