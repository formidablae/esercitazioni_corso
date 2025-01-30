public class Funzioni1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int somma = calcolaSomma(a, b);
        System.out.println("La somma di " + a + " e " + b + " è: " + somma);
        // Funzioni1 classeInizializata = new Funzioni1();
        // int xEPari = classeInizializata.isPari(x);
    }

    public static int calcolaSomma(int paramA, int paramB) {
        return paramA + paramB;
    }

    // public boolean isPari(int x) {
    //     return x % 2 == 0;
    // }
}

