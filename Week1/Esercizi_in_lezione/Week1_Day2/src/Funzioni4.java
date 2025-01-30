public class Funzioni4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 10;
        int d = 0;
        int e = 21;

        boolean aIsPari = isPari(a);
        boolean bIsPari = isPari(b);
        boolean cIsPari = isPari(c);
        boolean dIsPari = isPari(d);
        boolean eIsPari = isPari(e);

        System.out.println("a = " + a + " è pari? " + aIsPari);
        System.out.println("b = " + b + " è pari? " + bIsPari);
        System.out.println("c = " + c + " è pari? " + cIsPari);
        System.out.println("d = " + d + " è pari? " + dIsPari);
        System.out.println("e = " + e + " è pari? " + eIsPari + "\n");

        for (int x = 1; x <= 50; x++) {
            boolean risultato = isPari(x);
            System.out.println("x = " + x + " è pari? " + risultato);
        }
    }

    public static boolean isPari(int num) {
        return num % 2 == 0;
    }
}
