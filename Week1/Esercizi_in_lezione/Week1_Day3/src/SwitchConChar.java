import java.util.Scanner;

public class SwitchConChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Scegli un'operazione (+, -, *, /): ");
        char operazione = scanner.next().charAt(0);

        double risultato;

        switch (operazione) {
            case '+':
                risultato = num1 + num2;
                break;
            case '-':
                risultato = num1 - num2;
                break;
            case '*':
                risultato = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Errore: divisione per zero!");
                    return;
                } else {
                    risultato = num1 / num2;
                }
                break;
            default:
                System.out.println("Operazione non valida.");
                return;
        }

        System.out.println("Risultato: " + risultato);

        scanner.close();
    }
}
