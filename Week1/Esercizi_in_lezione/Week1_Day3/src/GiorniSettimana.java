import java.util.Scanner;

public class GiorniSettimana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero da 1 a 7: ");
        int giorno = scanner.nextInt();

        System.out.println("if else inline");
        if (giorno == 1) System.out.println("Lunedì");
        else if (giorno == 2) System.out.println("Martedì");
        else if (giorno == 3) System.out.println("Mercoledì");
        else if (giorno == 4) System.out.println("Giovedì");
        else if (giorno == 5) System.out.println("Venerdì");
        else if (giorno == 6) System.out.println("Sabato");
        else if (giorno == 7) System.out.println("Domenica");
        else System.out.println("Numero non valido. Inserisci un valore tra 1 e 7.");

        System.out.println("if else con {}");
        if (giorno == 1) {
            System.out.println("Lunedì");
        } else if (giorno == 2) {
            System.out.println("Martedì");
        } else if (giorno == 3) {
            System.out.println("Mercoledì");
        } else if (giorno == 4) {
            System.out.println("Giovedì");
        } else if (giorno == 5) {
            System.out.println("Venerdì");
        } else if (giorno == 6) {
            System.out.println("Sabato");
        } else if (giorno == 7) {
            System.out.println("Domenica");
        } else {
            System.out.println("Numero non valido. Inserisci un valore tra 1 e 7.");
        }

        System.out.println("\nSwitch inline");

        switch (giorno) {
            case 1: System.out.println("Lunedì"); break;
            case 2: System.out.println("Martedì"); break;
            case 3: System.out.println("Mercoledì"); break;
            case 4: System.out.println("Giovedì"); break;
            case 5: System.out.println("Venerdì"); break;
            case 6: System.out.println("Sabato"); break;
            case 7: System.out.println("Domenica"); break;
            default: System.out.println("Numero non valido. Inserisci un valore tra 1 e 7.");
        }

        System.out.println("\nSwitch con {}");

        switch (giorno) {
            case 1: {
                System.out.println("Il");
                System.out.println("giorno");
                System.out.println("che");
                System.out.println("corrisponde");
                System.out.println("al numero inserito è");
                System.out.println("Lunedì");
                break;
            }
            case 2: {
                System.out.println("Martedì");
                break;
            }
            case 3: {
                System.out.println("Mercoledì");
                break;
            }
            case 4: {
                System.out.println("Giovedì");
                break;
            }
            case 5: {
                System.out.println("Venerdì");
                break;
            }
            case 6: {
                System.out.println("Sabato");
                break;
            }
            case 7: {
                System.out.println("Domenica");
                break;
            }
            default: {
                System.out.println("Numero non valido. Inserisci un valore tra 1 e 7.");
            }
        }

        scanner.close();
    }
}
