package esercizi_compito.week8.colloquio3.dc;

import java.util.ArrayList;
import java.util.Scanner;
public class SubstringCompare {
    /**
     * Data un stringa s.
     * Dato un intero k.
     * Trovare la stringa più piccola (lexograficamente) di k caratteri e la stringa più grande di k caratteri.
     *
     * esempio: s = "welcometojava", k = 3
     * output: "ava", "wel"
     *
     * esempio2:  s = "welcometojava", k = 4
     * output: "come", "welc"
     */
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        // TODO: Complete the function
        // usare e implementare ordinaStringheLex

        return "stringa più 'lex-piccola' di " + k + " chars: " + smallest + "\nstringa più 'lex-grande' di " + k + " chars: " + largest;
    }

    /**
     * Data una lista di stringhe
     * Ordinare la lista in ordine lessicografico
     * Ritornare la lista ordinata
     *
     * esempio: ArrayList("ciao", "come", "stai")
     * output: ArrayList("come", "ciao", "stai")
     *
     * esempio2: ArrayList("nmg", "come", "stai", "a")
     * output: ArrayList("a", "come", "nmg", "stai")
     */
    public static ArrayList<String> ordinaStringheLex(ArrayList<String> strings) {
        // TODO:
        return strings;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}