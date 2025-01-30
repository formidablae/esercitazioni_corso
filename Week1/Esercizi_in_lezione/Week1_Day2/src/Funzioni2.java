public class Funzioni2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int somma = calcolaSomma(a, b);
        int divAB = divisione(a, b);
        int divBA = divisione(b, a);
        System.out.println("La somma di " + a + " e " + b + " è: " + somma);
    }

    public static int calcolaSomma(int x, int y) {
        return x + y;
    }

    /**
     Questa funzione calcola la divisione tra x e y
     */
    public static int divisione(int x, int y) {
        return x / y;
    }
}
