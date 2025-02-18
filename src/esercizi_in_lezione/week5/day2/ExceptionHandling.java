package esercizi_in_lezione.week5.day2;

import java.util.ArrayList;

public class ExceptionHandling {
    public static void main(String[] args) {
        ArrayList elencoNumeri = new ArrayList();
        // aggiungere 10 numeri random a elencoNumeri
        for (int i = 0; i < 10; i++) {
            elencoNumeri.add((int) (Math.random() * 100));
        }
        int numeroInPosSette = (int) elencoNumeri.get(7);
        try {
            // int[] numbers = {1, 2, 3};
            // System.out.println(numbers[10]);

            for (int i = 0; i < 5; i++) {
                numeroInPosSette = (int) elencoNumeri.get(7);
                elencoNumeri.remove(elencoNumeri.size() - 1);
            }
            System.out.println(numeroInPosSette);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: Indice dell'array non valido");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Errore IndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore generico: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Blocco finally eseguito");
        }
    }
}
