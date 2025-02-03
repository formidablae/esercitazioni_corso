package esercizi_in_lezione.week2.day2;

public class Funzioni3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 100;
        int a = 3;

        int conto = contaNumeriDivisibili(x, y, a);
        System.out.println("Tra " + x + " e " + y + " ci sono " + conto + " numeri divisibili per " + a);
    }

    public static int contaNumeriDivisibili(int da, int a, int num) {
        int risultato = 0;
        for (int i = da; i <= a; i++) {
            if (i % num == 0) {
                risultato = risultato + 1;
            }
        }
        return risultato;
    }
}
