package esercizi_in_lezione.week2.day5;

import java.util.Arrays;

public class ContaPariDispari {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 12, 15, 20, 21, 30, 3};

        int[] contoPariDisp = contaPariDispari(numbers);
        int pari = contoPariDisp[0];
        // O(1)
        int dispari = contoPariDisp[1];
        System.out.print("L'array: " + Arrays.toString(numbers) + " ha ");
        System.out.print(pari + " elementi pari e " + dispari + " elementi dispari");
    }

    public static int[] contaPariDispari(int[] arr) {
        // [ elementi_pari: 0, elementi_dispari: 0 ]
        int[] risposta = {0, 0};
        System.out.print("risposta: " + Arrays.toString(risposta));

        // lunghezza array = n
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                risposta[0]++;
            } else {
                risposta[1]++;
            }
        }

        return risposta;
    }
}
